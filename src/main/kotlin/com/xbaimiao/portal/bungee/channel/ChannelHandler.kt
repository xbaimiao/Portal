package com.xbaimiao.portal.bungee.channel

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
                try {
                    val bytes = ByteArray(40960)
                    val len = input.read(bytes)
                    if (len == -1) {
                        sleep(25)
                        continue
                    }
                    val string = String(bytes, 0, len)
                    if (string == "") {
                        continue
                    }
                    submit(async = true) {
                        val index = string.indexOf(":")
                        Server.list.forEach {
                            it.invoke(
                                string.substring(0, index),
                                string.substring(index + 1),
                                socket
                            )
                        }
                    }
                } catch (e: Exception) {
                    try {
                        sleep(100)
                    } catch (_: Exception) {

                    }
                    continue
                }
            }
        }
    }

}