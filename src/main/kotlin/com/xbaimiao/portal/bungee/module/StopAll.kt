package com.xbaimiao.portal.bungee.module

import com.xbaimiao.portal.bungee.channel.Server
import com.xbaimiao.portal.packet.impl.CommandPacket
import net.md_5.bungee.api.ProxyServer
import taboolib.common.LifeCycle
import taboolib.common.platform.Awake
import taboolib.common.platform.ProxyCommandSender
import taboolib.common.platform.command.command

object StopAll {

    @Awake(LifeCycle.ENABLE)
    fun init() {
        command(
            "stopall",
            permission = "stopall"
        ) {
            execute<ProxyCommandSender> { _, _, _ ->
                Server.sendAllMessage(
                    CommandPacket(
                        "stop",
                        "stop",
                        "stop",
                        CommandPacket.SenderType.SENDER,
                        CommandPacket.Delay.NOW
                    )
                )
                ProxyServer.getInstance().stop()
            }
        }
    }

}


