package com.xbaimiao.portal.bungee.channel

import com.google.gson.Gson
import com.xbaimiao.portal.bungee.PortalBungee
import com.xbaimiao.portal.packet.Packet
import com.xbaimiao.portal.packet.Serializer
import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.ChannelFuture
import io.netty.channel.ChannelInitializer
import io.netty.channel.EventLoopGroup
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.SocketChannel
import io.netty.channel.socket.nio.NioServerSocketChannel
import io.netty.handler.codec.string.StringDecoder
import io.netty.handler.logging.LogLevel
import io.netty.handler.logging.LoggingHandler
import taboolib.common.platform.function.info
import taboolib.common.platform.function.submit
import java.net.ServerSocket
import java.net.Socket
import java.net.SocketException


/**
 * @Author xbaimiao
 * @Date 2021/10/23 19:17
 */
object Server {

    val list = ArrayList<(prefix: String, string: String, socket: Socket) -> Unit>()
    val clients = HashMap<String, Socket>()

    lateinit var server: ServerSocket

    @Throws(InterruptedException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val bossgroup: EventLoopGroup = NioEventLoopGroup()
        val workgroup: EventLoopGroup = NioEventLoopGroup()
        val sb = ServerBootstrap()
        sb.channel(NioServerSocketChannel::class.java)
        sb.group(bossgroup, workgroup)
        sb.handler(LoggingHandler(LogLevel.INFO))
        sb.childHandler(object : ChannelInitializer<SocketChannel>() {
            @Throws(Exception::class)
            override fun initChannel(sc: SocketChannel) {
                sc.pipeline().addLast(StringDecoder())
                sc.pipeline().addLast(ServerHandler())
            }
        })
        val future: ChannelFuture = sb.bind(8080).sync()
        future.channel().closeFuture().sync()
        workgroup.shutdownGracefully()
        bossgroup.shutdownGracefully()
    }

    init {
        submit(async = true) {
            server = ServerSocket(PortalBungee.config.getInt("channel.port"))
            while (true) {
                try {
                    ChannelHandler(server.accept()).start()
                } catch (_: SocketException) {

                }
            }
        }
    }

    fun subscribeEvent(func: (prefix: String, string: String, socket: Socket) -> Unit) {
        list.add(func)
    }

    private fun Socket.sendMessage(byteArray: ByteArray) {
        this.getOutputStream().write(byteArray)
        this.getOutputStream().flush()
    }

    /**
     * 给指定服务器发送数据
     * @param server 服务器id
     * @param byteArray 数据
     */
    private fun sendMessage(server: String, byteArray: ByteArray) {
        val socket = clients[server] ?: return info("$server 服务器不在线 数据包取消发送")
        socket.sendMessage(byteArray)
    }

    /**
     * 给指定子服发送消息
     */
    fun sendMessage(server: String, packet: Packet) {
        if (packet is Serializer) {
            sendMessage(server, "${packet.prefix}:${packet.serializer()}".toByteArray())
            return
        }
        val gson = Gson()
        sendMessage(server, "${packet.prefix}:${gson.toJson(packet)}".toByteArray())
    }

    /**
     * 给所有子服发送消息
     */
    fun sendAllMessage(packet: Packet) {
        clients.keys.forEach { sendMessage(it, packet) }
    }

    fun close() {
        for (value in clients.values) {
            value.shutdownOutput()
            value.shutdownInput()
            value.close()
        }
        server.close()
    }

}