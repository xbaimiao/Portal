package com.xbaimiao.portal.bukkit

import com.xbaimiao.portal.bukkit.channel.Client
import com.xbaimiao.portal.packet.Data
import com.xbaimiao.portal.packet.impl.CommandPacket
import com.xbaimiao.portal.util.aptSender
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.event.player.PlayerJoinEvent
import taboolib.common.platform.Platform
import taboolib.common.platform.PlatformSide
import taboolib.common.platform.Plugin
import taboolib.common.platform.event.SubscribeEvent
import taboolib.common.platform.function.info
import taboolib.common.platform.function.submit
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
        info("§aPortal Enable")
        Data.init()
        // 子服处理bungee数据
        Client.subscribeEvent { prefix, string, socket ->
            val packet = Data.parse(prefix, string) ?: return@subscribeEvent
            if (packet.toString() != "null"){
                println(packet.toString())
            }
            packet.bukkit(string, socket)
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
                    Bukkit.dispatchCommand(waitCommand.senderType.aptSender(player), waitCommand.cmd)
                    waitCommands.remove(waitCommand)
                    break
                }
            }
        }
    }

}