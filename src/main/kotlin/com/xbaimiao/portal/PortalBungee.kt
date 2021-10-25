package com.xbaimiao.portal

import com.google.gson.Gson
import com.xbaimiao.portal.channel.ChannelServer
import net.md_5.bungee.api.ProxyServer
import taboolib.common.platform.Platform
import taboolib.common.platform.PlatformSide
import taboolib.common.platform.Plugin
import taboolib.module.configuration.Config
import taboolib.module.configuration.SecuredFile

@PlatformSide([Platform.BUNGEE])
object PortalBungee : Plugin() {

    @Config("bungeeConfig.yml")
    lateinit var config: SecuredFile

    override fun onLoad() {
        ProxyServer.getInstance().registerChannel("portal:main")
    }

    override fun onEnable() {
        ChannelServer.subscribeEvent { string, socket ->
            if (string.startsWith("TELEPORT:")) {
                val gson = Gson()
                val data = gson.fromJson(string.substring(9), TeleportData::class.java)
                if (data.type == TeleportData.Type.PLAYER) {
                    val player = ProxyServer.getInstance().getPlayer(data.entityType)
                    player.connect(ProxyServer.getInstance().getServerInfo(data.server))
                    ChannelServer.sendMessage(data.server, "TELEPORT:${gson.toJson(data)}".toByteArray())
                } else {
                    ChannelServer.sendMessage(data.server, "TELEPORT:${gson.toJson(data)}".toByteArray())
                }
            }
        }
    }

    override fun onDisable() {
        ChannelServer.server.close()
    }

}