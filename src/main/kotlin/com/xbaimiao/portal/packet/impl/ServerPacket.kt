package com.xbaimiao.portal.packet.impl

import com.xbaimiao.portal.bungee.channel.Server
import com.xbaimiao.portal.packet.Serializer
import java.net.Socket

/**
 * @Author xbaimiao
 * @Date 2021/11/10 9:59
 */
class ServerPacket(val name: String) : Serializer {

    override fun parse(string: String): Serializer {
        return ServerPacket(string)
    }

    override fun serializer(): String {
        return name
    }

    override val prefix: String
        get() = "SERVER"

    override fun bukkit(data: String, socket: Socket) {

    }

    override fun bungee(data: String, socket: Socket) {
        Server.clients[name] = socket
    }

    override fun toString(): String {
        return "与服务器${name}链接成功"
    }

}