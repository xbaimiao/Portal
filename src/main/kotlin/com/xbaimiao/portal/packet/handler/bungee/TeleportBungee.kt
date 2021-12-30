package com.xbaimiao.portal.packet.handler.bungee

import com.xbaimiao.portal.bungee.channel.Server
import com.xbaimiao.portal.packet.impl.TeleportPacket
import net.md_5.bungee.api.ProxyServer

/**
 * @Author xbaimiao
 * @Date 2021/11/10 10:10
 */
object TeleportBungee {

    fun bungee(data: TeleportPacket) {
        if (data.type == TeleportPacket.Type.PLAYER) {
            val player = ProxyServer.getInstance().getPlayer(data.entityType)
            player.connect(ProxyServer.getInstance().getServerInfo(data.server))

            Server.sendMessage(data.server, data)
        } else {
            Server.sendMessage(data.server, data)
        }
    }

}