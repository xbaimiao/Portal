package com.xbaimiao.portal.packet.impl

import com.xbaimiao.portal.bukkit.Portal
import com.xbaimiao.portal.bungee.channel.Server
import com.xbaimiao.portal.packet.Packet
import com.xbaimiao.portal.util.aptSender
import net.md_5.bungee.api.ProxyServer
import org.bukkit.Bukkit
import taboolib.common.platform.function.submit
import java.net.Socket

/**
 * @Author xbaimiao
 * @Date 2021/10/25 14:57
 */
class CommandPacket(
    val cmd: String,
    val player: String,
    val server: String,
    val senderType: SenderType,
    val delay: Delay
) : Packet {

    enum class SenderType {
        SENDER, PLAYER
    }

    enum class Delay {
        NOW, DELAY
    }

    override val prefix: String
        get() = "CMD"

    override fun bukkit(data: String, socket: Socket) {
        if (delay == Delay.NOW) {
            val player = Bukkit.getPlayer(player)
            val type = if (player == null) Bukkit.getConsoleSender() else senderType.aptSender(player)
            submit { Bukkit.dispatchCommand(type, cmd) }
            return
        }
        Portal.waitCommands.add(this)
        submit(delay = 200) { Portal.waitCommands.remove(this@CommandPacket) }
    }

    override fun bungee(data: String, socket: Socket) {
        val player = ProxyServer.getInstance().getPlayer(player)
        player.connect(ProxyServer.getInstance().getServerInfo(server))
        Server.sendMessage(server, this@CommandPacket)
    }

    override fun toString(): String {
        return "命令数据包-> $cmd $senderType $delay"
    }

}