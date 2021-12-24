package com.xbaimiao.portal.packet

import net.md_5.bungee.api.ProxyServer
import net.md_5.bungee.chat.ComponentSerializer
import java.net.Socket

class HoverItemPacket(
    val rawJson: String
) : Serializer {

    override val prefix: String
        get() = "HOVERITEM"

    override fun bukkit(string: String, socket: Socket) {

    }

    override fun bungee(string: String, socket: Socket) {
        try {
            val json = ComponentSerializer.parse(rawJson)
            ProxyServer.getInstance().players.forEach {
                it.sendMessage(*json)
            }
        } catch (_: Exception) {

        }
    }

    override fun parse(string: String): Serializer {
        return HoverItemPacket(string)
    }

    override fun serializer(): String {
        return rawJson
    }

}