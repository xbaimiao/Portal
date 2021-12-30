package com.xbaimiao.portal.bungee

import com.xbaimiao.portal.bungee.channel.Server
import com.xbaimiao.portal.packet.Data
import net.md_5.bungee.api.ProxyServer
import net.md_5.bungee.api.event.LoginEvent
import net.md_5.bungee.api.event.PlayerDisconnectEvent
import taboolib.common.platform.Platform
import taboolib.common.platform.PlatformSide
import taboolib.common.platform.Plugin
import taboolib.common.platform.event.SubscribeEvent
import taboolib.common.platform.function.info
import taboolib.module.chat.TellrawJson
import taboolib.module.configuration.Config
import taboolib.module.configuration.SecuredFile

@PlatformSide([Platform.BUNGEE])
object PortalBungee : Plugin() {

    @Config("bungeeConfig.yml")
    lateinit var config: SecuredFile

    override fun onEnable() {
        info("§aPortal Enable")
        Data.init()
        //bungee处理数据
        Server.subscribeEvent { prefix, string, socket ->
            val packet = Data.parse(prefix, string) ?: return@subscribeEvent
            if (packet.toString() != "null"){
                println(packet.toString())
            }
            packet.bungee(string, socket)
        }
    }

    override fun onDisable() {
        try {
            Server.close()
        } catch (_: Exception) {

        }
    }

    @SubscribeEvent
    fun login(event: LoginEvent) {
        ProxyServer.getInstance().players.forEach { it.sendMessage("§a${event.connection.name}加入了游戏") }
    }

    @SubscribeEvent
    fun quit(event: PlayerDisconnectEvent) {
        ProxyServer.getInstance().players.forEach { it.sendMessage("§a${event.player.name}退出了游戏") }
    }

}