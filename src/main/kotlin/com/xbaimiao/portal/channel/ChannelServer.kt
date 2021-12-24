package com.xbaimiao.portal.channel

import com.google.gson.Gson
import com.xbaimiao.portal.PortalBungee
import com.xbaimiao.portal.packet.Packet
import com.xbaimiao.portal.packet.Serializer
import taboolib.common.platform.function.info
import taboolib.common.platform.function.submit
import java.net.ServerSocket
import java.net.Socket


/**
 * @Author xbaimiao
 * @Date 2021/10/23 19:17
 */
object ChannelServer {

    val list = ArrayList<(prefix: String, string: String, socket: Socket) -> Unit>()
    val clients = HashMap<String, Socket>()

    lateinit var server: ServerSocket

    init {
        submit(async = true) {
            server = ServerSocket(PortalBungee.config.getInt("channel.port"))
            while (true) {
                ChannelHandler(server.accept()).run()
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
        val socket = clients[server] ?: return let {
            info("$server 服务器不在线 数据包取消发送")
            info("数据包信息: ${String(byteArray)}")
        }
        socket.sendMessage(byteArray)
    }

    fun sendMessage(server: String, packet: Packet) {
        if (packet is Serializer) {
            sendMessage(server, "${packet.prefix}:${packet.serializer()}".toByteArray())
            return
        }
        val gson = Gson()
        sendMessage(server, "${packet.prefix}:${gson.toJson(packet)}".toByteArray())
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