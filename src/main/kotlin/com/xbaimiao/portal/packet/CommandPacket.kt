package com.xbaimiao.portal.packet

import com.xbaimiao.portal.Portal
import com.xbaimiao.portal.channel.ChannelServer
import net.md_5.bungee.api.ProxyServer
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
    val type: Type
) : Packet {

    enum class Type {
        SENDER, PLAYER
    }

    override val prefix: String
        get() = "CMD"

    override fun bukkit(string: String, socket: Socket) {
        Portal.waitCommands.add(this)
        submit(delay = 200) { Portal.waitCommands.remove(this@CommandPacket) }
    }

    override fun bungee(string: String, socket: Socket) {
        val player = ProxyServer.getInstance().getPlayer(player)
        player.connect(ProxyServer.getInstance().getServerInfo(server))
        ChannelServer.sendMessage(server, this@CommandPacket)
    }

}