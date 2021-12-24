package com.xbaimiao.portal.packet.handler.bungee

import com.xbaimiao.portal.channel.ChannelServer
import com.xbaimiao.portal.packet.TeleportPacket
import net.md_5.bungee.api.ProxyServer
import taboolib.module.chat.TellrawJson

/**
 * @Author xbaimiao
 * @Date 2021/11/10 10:10
 */
object TeleportBungee {

    fun bungee(data: TeleportPacket) {
        if (data.type == TeleportPacket.Type.PLAYER) {
            val player = ProxyServer.getInstance().getPlayer(data.entityType)
            player.connect(ProxyServer.getInstance().getServerInfo(data.server))

            ChannelServer.sendMessage(data.server, data)
        } else {
            ChannelServer.sendMessage(data.server, data)
        }
    }

}