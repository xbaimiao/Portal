package com.xbaimiao.portal.packet

import com.xbaimiao.portal.channel.ChannelServer
import java.net.Socket

/**
 * @Author xbaimiao
 * @Date 2021/11/10 9:59
 */
class ServerPacket(val name: String) : Packet {

    override val prefix: String
        get() = "SERVER"

    override fun bukkit(string: String, socket: Socket) {

    }

    override fun bungee(string: String, socket: Socket) {
        ChannelServer.clients[name] = socket
    }

}