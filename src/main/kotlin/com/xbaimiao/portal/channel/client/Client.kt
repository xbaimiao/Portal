package com.xbaimiao.portal.channel.client

import com.xbaimiao.portal.Portal
import taboolib.common.platform.function.submit
import java.net.Socket

/**
 * @Author xbaimiao
 * @Date 2021/10/23 19:27
 */
object Client {

    val socket: Socket = Socket(Portal.config.getString("channel.ip"), Portal.config.getInt("channel.port"))

    val output get() = socket.getOutputStream()

    val input get() = socket.getInputStream()

    val list = ArrayList<(string: String, socket: Socket) -> Unit>()

    init {
        submit(async = true) {
            while (true) {
                val bytes = ByteArray(4096)
                val len = input.read(bytes)
                val string = String(bytes, 0, len)
                list.forEach { it.invoke(string, socket) }
            }
        }
    }

    fun subscribeEvent(func: (string: String, socket: Socket) -> Unit) {
        list.add(func)
    }

    fun sendMessage(byteArray: ByteArray) {
        output.write(byteArray)
        output.flush()
    }

}