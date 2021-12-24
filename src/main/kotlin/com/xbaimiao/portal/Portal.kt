package com.xbaimiao.portal

import com.google.gson.Gson
import com.xbaimiao.portal.channel.Client
import com.xbaimiao.portal.packet.CommandPacket
import com.xbaimiao.portal.packet.Serializer
import com.xbaimiao.portal.util.aptSender
import com.xbaimiao.portal.packet.init
import com.xbaimiao.portal.packet.packets
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.event.player.PlayerJoinEvent
import taboolib.common.platform.Platform
import taboolib.common.platform.PlatformSide
import taboolib.common.platform.Plugin
import taboolib.common.platform.event.SubscribeEvent
import taboolib.common.platform.function.submit
import taboolib.common.reflect.Reflex.Companion.unsafeInstance
import taboolib.module.configuration.Config
import taboolib.module.configuration.SecuredFile

/**
 * @Author xbaimiao
 * @Date 2021/10/23 16:45
 */
@PlatformSide([Platform.BUKKIT])
object Portal : Plugin() {

    @Config("config.yml")
    lateinit var config: SecuredFile

    val waitTeleports = HashMap<String, Location>()
    val waitCommands = ArrayList<CommandPacket>()
    var isRun = true

    override fun onEnable() {
        init()
        // 子服处理bungee数据
        Client.subscribeEvent { prefix, string, socket ->
            println(prefix + string)
            val unsafeInstance = packets[prefix]?.unsafeInstance()
            if (unsafeInstance is Serializer) {
                val data = unsafeInstance.parse(string)
                data.bukkit(string, socket)
                return@subscribeEvent
            }
            val gson = Gson()
            val data = gson.fromJson(string, packets[prefix])
            data.bukkit(string, socket)
        }
    }

    override fun onDisable() {
        isRun = false
        Client.close()
    }

    @SubscribeEvent
    fun join(event: PlayerJoinEvent) {
        submit(delay = 5) {
            val player = event.player
            if (player.name in waitTeleports.keys) {
                player.teleport(waitTeleports[player.name]!!)
                waitTeleports.remove(player.name)
            }
            for (waitCommand in waitCommands) {
                if (waitCommand.player == player.name) {
                    Bukkit.dispatchCommand(waitCommand.type.aptSender(player), waitCommand.cmd)
                    waitCommands.remove(waitCommand)
                    break
                }
            }
        }
    }

}