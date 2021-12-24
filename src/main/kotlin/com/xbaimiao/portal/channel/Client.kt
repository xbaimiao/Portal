package com.xbaimiao.portal.channel

import com.google.gson.Gson
import com.xbaimiao.portal.Portal
import com.xbaimiao.portal.packet.Packet
import com.xbaimiao.portal.packet.Serializer
import com.xbaimiao.portal.packet.ServerPacket
import taboolib.common.platform.function.info
import taboolib.common.platform.function.submit
import java.net.Socket

/**
 * @Author xbaimiao
 * @Date 2021/10/23 19:27
 */
object Client {

    var socket: Socket = Socket(Portal.config.getString("channel.ip"), Portal.config.getInt("channel.port"))

    val output get() = socket.getOutputStream()

    val input get() = socket.getInputStream()

    val list = ArrayList<(prefix: String, string: String, socket: Socket) -> Unit>()

    init {
        sendPacket(ServerPacket(Portal.config.getString("channel.server")))
        submit(async = true) {
            while (Portal.isRun) {
                try {
                    val bytes = ByteArray(4096)
                    val len = input.read(bytes)
                    if (len == -1) {
                        Thread.sleep(25)
                        continue
                    }
                    val string = String(bytes, 0, len)
                    if (string == "") {
                        continue
                    }
                    submit(async = true) {
                        val index = string.indexOf(":")
                        list.forEach { it.invoke(string.substring(0, index), string.substring(index + 1), socket) }
                    }
                } catch (e: Exception) {
                    Thread.sleep(500)
                    try {
                        info("尝试重新连接")
                        reload()
                        info("重连成功")
                    } catch (e: Exception) {
                        info("重连失败")
                    }
                    continue
                }
            }
        }
    }

    private fun reload() {
        socket = Socket(Portal.config.getString("channel.ip"), Portal.config.getInt("channel.port"))
        sendPacket(ServerPacket(Portal.config.getString("channel.server")))
    }

    fun subscribeEvent(func: (prefix: String, string: String, socket: Socket) -> Unit) {
        list.add(func)
    }

    private fun sendMessage(byteArray: ByteArray) {
        try {
            output.write(byteArray)
            output.flush()
        } catch (e: Exception) {
            reload()
            sendMessage(byteArray)
        }
    }

    fun sendPacket(packet: Packet) {
        if (packet is Serializer) {
            sendMessage("${packet.prefix}:${packet.serializer()}".toByteArray())
            return
        }
        val gson = Gson()
        sendMessage("${packet.prefix}:${gson.toJson(packet)}".toByteArray())
    }

    fun close() {
        try {
            socket.shutdownInput()
            socket.shutdownOutput()
            socket.close()
        } catch (e: Exception) {

        }
    }

}