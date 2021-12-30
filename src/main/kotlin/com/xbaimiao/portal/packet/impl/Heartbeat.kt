package com.xbaimiao.portal.packet.impl

import com.xbaimiao.portal.packet.Packet
import java.net.Socket

/**
 * 心跳包
 */
class Heartbeat : Packet {

    override val prefix: String
        get() = "HEART"

    override fun bukkit(data: String, socket: Socket) {

    }

    override fun bungee(data: String, socket: Socket) {

    }

    override fun toString(): String {
        return "null"
    }

}