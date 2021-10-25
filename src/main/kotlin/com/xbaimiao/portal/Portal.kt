package com.xbaimiao.portal

import com.google.gson.Gson
import com.xbaimiao.portal.channel.client.Client
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.entity.EntityType
import org.bukkit.entity.Item
import org.bukkit.event.entity.EntityPortalEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerPortalEvent
import taboolib.common.platform.Platform
import taboolib.common.platform.PlatformSide
import taboolib.common.platform.Plugin
import taboolib.common.platform.event.SubscribeEvent
import taboolib.common.platform.function.submit
import taboolib.module.configuration.Config
import taboolib.module.configuration.SecuredFile
import taboolib.platform.BukkitPlugin

/**
 * @Author xbaimiao
 * @Date 2021/10/23 16:45
 */
@PlatformSide([Platform.BUKKIT])
object Portal : Plugin() {

    @Config("config.yml")
    lateinit var config: SecuredFile

    val waitTeleports = HashMap<String, Location>()

    override fun onEnable() {
        Bukkit.getServer().messenger.registerOutgoingPluginChannel(BukkitPlugin.getInstance(), "BungeeCord")

        Client.sendMessage("SERVER:${config.getString("channel.server")}".toByteArray())
        Client.subscribeEvent { string, socket ->
            if (string.startsWith("TELEPORT:")) {
                val gson = Gson()
                val data = gson.fromJson(string.substring(9), TeleportData::class.java)
                if (data.type == TeleportData.Type.PLAYER) {
                    //放入待tp列表
                    waitTeleports[data.entityType] = data.aptLocation()
                    submit(delay = 200) { waitTeleports.remove(data.entityType) }
                } else {
                    submit {
                        data.aptLocation().world!!.spawnEntity(data.aptLocation(), EntityType.valueOf(data.entityType))
                    }
                }
            }
        }
    }

    @SubscribeEvent
    fun tp(event: PlayerJoinEvent) {
        submit(delay = 5) {
            val player = event.player
            if (player.name in waitTeleports.keys) {
                player.teleport(waitTeleports[player.name]!!)
                waitTeleports.remove(player.name)
            }
        }
    }

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
        val type = TeleportData.Type.ENTITY
        val location = event.to ?: return
        val server =
            if (location.world!!.environment == World.Environment.NETHER) config.getString("nether.form")
            else config.getString("nether.to")

        val data = TeleportData(location.aptString(), type, server, entity.type.toString())
        val gson = Gson()
        Client.sendMessage("TELEPORT:${gson.toJson(data)}".toByteArray())
        event.isCancelled = true
        entity.remove()
    }

    @SubscribeEvent
    fun pPortal(event: PlayerPortalEvent) {
        val player = event.player
        val type = TeleportData.Type.PLAYER
        val location = event.to ?: return
        val server =
            if (location.world!!.environment == World.Environment.NETHER) config.getString("nether.form")
            else config.getString("nether.to")

        val data = TeleportData(location.aptString(), type, server, player.name)
        val gson = Gson()
        Client.sendMessage("TELEPORT:${gson.toJson(data)}".toByteArray())
        event.isCancelled = true
    }

}