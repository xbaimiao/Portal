package com.xbaimiao.portal

import com.google.gson.Gson
import com.xbaimiao.portal.channel.ChannelServer
import com.xbaimiao.portal.packet.Serializer
import com.xbaimiao.portal.packet.init
import com.xbaimiao.portal.packet.packets
import net.md_5.bungee.api.ProxyServer
import net.md_5.bungee.api.event.LoginEvent
import net.md_5.bungee.api.event.ServerConnectedEvent
import net.md_5.bungee.api.event.ServerDisconnectEvent
import taboolib.common.platform.Platform
import taboolib.common.platform.PlatformSide
import taboolib.common.platform.Plugin
import taboolib.common.platform.event.SubscribeEvent
import taboolib.common.reflect.Reflex.Companion.unsafeInstance
import taboolib.module.configuration.Config
import taboolib.module.configuration.SecuredFile

@PlatformSide([Platform.BUNGEE])
object PortalBungee : Plugin() {

    @Config("bungeeConfig.yml")
    lateinit var config: SecuredFile

    override fun onEnable() {
        init()
        //bungee处理数据
        ChannelServer.subscribeEvent { prefix, string, socket ->
            println(prefix + string)
            val unsafeInstance = packets[prefix]?.unsafeInstance()
            if (unsafeInstance is Serializer) {
                val data = unsafeInstance.parse(string)
                data.bungee(string, socket)
                return@subscribeEvent
            }
            val gson = Gson()
            val data = gson.fromJson(string, packets[prefix])
            data.bungee(string, socket)
        }
    }

    override fun onDisable() {
        try {
            ChannelServer.close()
        } catch (e: Exception) {

        }
    }

    @SubscribeEvent
    fun login(event: LoginEvent) {
        ProxyServer.getInstance().players.forEach { it.sendMessage("§a${event.connection.name}加入了服务器") }
    }

}