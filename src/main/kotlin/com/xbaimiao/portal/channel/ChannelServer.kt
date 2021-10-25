package com.xbaimiao.portal.channel

import com.xbaimiao.portal.PortalBungee
import taboolib.common.platform.function.submit
import java.net.ServerSocket
import java.net.Socket


/**
 * @Author xbaimiao
 * @Date 2021/10/23 19:17
 */
object ChannelServer {

    val list = ArrayList<(string: String, socket: Socket) -> Unit>()
    val clients = HashMap<String, Socket>()

    lateinit var server: ServerSocket

    init {
        submit(async = true) {
            server = ServerSocket(PortalBungee.config.getInt("channel.port"))
            subscribeEvent { string, socket ->
                if (string.startsWith("SERVER:")) {
                    clients[string.substring(7)] = socket
                }
            }
            while (true) {
                ChannelHandler(server.accept()).run()
            }
        }
    }

    fun subscribeEvent(func: (string: String, socket: Socket) -> Unit) {
        list.add(func)
    }

    fun Socket.sendMessage(byteArray: ByteArray) {
        this.getOutputStream().write(byteArray)
        this.getOutputStream().flush()
    }

    fun sendMessage(server: String, byteArray: ByteArray) {
        clients[server]?.sendMessage(byteArray)
    }

}