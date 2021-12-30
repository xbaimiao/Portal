package com.xbaimiao.portal.packet.impl

import com.xbaimiao.portal.packet.Packet
import com.xbaimiao.portal.packet.handler.bukkit.TeleportBukkit
import com.xbaimiao.portal.packet.handler.bungee.TeleportBungee
import java.net.Socket

/**
 * 传送门传送数据包
 * @Author xbaimiao
 * @Date 2021/10/23 17:09
 */
class TeleportPacket(
    val location: String,
    val type: Type,
    val server: String,
    val entityType: String
) : Packet {

    enum class Type {
        ENTITY, PLAYER
    }

    override val prefix: String
        get() = "TELEPORT"

    override fun bukkit(data: String, socket: Socket) {
        TeleportBukkit.bukkit(this)
    }

    override fun bungee(data: String, socket: Socket) {
        TeleportBungee.bungee(this)
    }

    override fun toString(): String {
        return "地狱门传送->server:${server},location:${location}"
    }

}

