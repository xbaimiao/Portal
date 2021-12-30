package com.xbaimiao.portal.bukkit.module

import com.xbaimiao.portal.bukkit.Portal
import com.xbaimiao.portal.bukkit.channel.Client
import com.xbaimiao.portal.packet.impl.TeleportPacket
import com.xbaimiao.portal.util.aptString
import org.bukkit.World
import org.bukkit.entity.Item
import org.bukkit.event.entity.EntityPortalEvent
import org.bukkit.event.player.PlayerPortalEvent
import taboolib.common.platform.event.SubscribeEvent

/**
 * @Author xbaimiao
 * @Date 2021/10/25 15:09
 */
object OnPortalEvent {

    @SubscribeEvent
    fun portal(event: EntityPortalEvent) {
        val entity = event.entity
        if (event.from.world!!.environment == World.Environment.THE_END) {
            event.isCancelled = true
            return
        }
        if (entity is Item) {
            event.isCancelled = true
            return
        }
        val type = TeleportPacket.Type.ENTITY
        val location = event.to ?: return
        val server =
            if (location.world!!.environment == World.Environment.NETHER) Portal.config.getString("nether.form")
            else Portal.config.getString("nether.to")

        val data = TeleportPacket(location.aptString(), type, server, entity.type.toString())
        Client.sendPacket(data)
        event.isCancelled = true
        entity.remove()
    }

    @SubscribeEvent
    fun pPortal(event: PlayerPortalEvent) {
        val player = event.player
        val type = TeleportPacket.Type.PLAYER
        val location = event.to ?: return
        val server =
            if (location.world!!.environment == World.Environment.NETHER) Portal.config.getString("nether.form")
            else Portal.config.getString("nether.to")

        val data = TeleportPacket(location.aptString(), type, server, player.name)
        Client.sendPacket(data)
        event.isCancelled = true
    }

}