package com.xbaimiao.portal.packet

import com.xbaimiao.portal.packet.handler.bukkit.TeleportBukkit
import com.xbaimiao.portal.packet.handler.bungee.TeleportBungee
import com.xbaimiao.portal.util.aptLocation
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

    override fun bukkit(string: String, socket: Socket) {
        TeleportBukkit.bukkit(this)
    }

    override fun bungee(string: String, socket: Socket) {
        TeleportBungee.bungee(this)
    }

}

