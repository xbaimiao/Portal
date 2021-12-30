package com.xbaimiao.portal.packet.impl

import com.xbaimiao.portal.packet.Packet
import net.md_5.bungee.api.event.LoginEvent
import net.md_5.bungee.api.event.PlayerDisconnectEvent
import org.bukkit.Bukkit
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent
import taboolib.common.platform.event.SubscribeEvent
import taboolib.common.platform.function.adaptPlayer
import taboolib.module.chat.TellrawJson
import java.net.Socket

/**
 * TPA数据包
 */
class TPAPacket(
    val player1: String,
    val player2: String
) : Packet {

    override val prefix: String
        get() = "TPA"

    override fun bukkit(data: String, socket: Socket) {
        val player2 = Bukkit.getPlayer(player2) ?: return
        val message = TellrawJson().apply {
            this.append("§6$player1 §e请求传送到你身边 ")
        }
        message.append(TellrawJson().apply {
            this.append("§a[√] ")
            this.hoverText("同意请求")
            this.runCommand("/tpaccept $player1")
        })
        message.append(TellrawJson().apply {
            this.append("§4[X] ")
            this.hoverText("拒绝请求")
            this.runCommand("/tpdeny $player1")
        })
        message.sendTo(adaptPlayer(player2))
        player2.sendTitle("", "§6$player1 §e请求传送到你身边 请查看聊天栏", 20, 40, 20)
    }

    override fun bungee(data: String, socket: Socket) {

    }

    override fun toString(): String {
        return "$player1 tpa to $player2"
    }
}