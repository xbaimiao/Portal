package com.xbaimiao.portal.packet.impl

import com.xbaimiao.portal.packet.Serializer
import net.md_5.bungee.api.ProxyServer
import net.md_5.bungee.chat.ComponentSerializer
import java.net.Socket

class HoverItemPacket(
    val rawJson: String
) : Serializer {

    override val prefix: String
        get() = "HOVERITEM"

    override fun bukkit(data: String, socket: Socket) {

    }

    override fun bungee(data: String, socket: Socket) {
        val json = ComponentSerializer.parse(rawJson)
        ProxyServer.getInstance().players.forEach {
            it.sendMessage(*json)
        }
    }

    override fun toString(): String {
        return "物品展示数据包"
    }

    override fun parse(string: String): Serializer {
        return HoverItemPacket(string)
    }

    override fun serializer(): String {
        return rawJson
    }

}