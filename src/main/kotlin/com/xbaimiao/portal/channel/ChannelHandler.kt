package com.xbaimiao.portal.channel

import taboolib.common.platform.function.submit
import java.net.Socket

/**
 * @Author xbaimiao
 * @Date 2021/10/23 19:21
 */
class ChannelHandler(val socket: Socket) : Thread() {

    val input = socket.getInputStream()

    override fun run() {
        submit(async = true) {
            while (true) {
                val bytes = ByteArray(4096)
                val len = input.read(bytes)
                val string = String(bytes, 0, len)
                ChannelServer.list.forEach { it.invoke(string, socket) }
            }
        }
    }

}