package com.xbaimiao.portal.bukkit

import com.xbaimiao.portal.channel.Client
import com.xbaimiao.portal.packet.CommandPacket
import taboolib.common.LifeCycle
import taboolib.common.platform.Awake
import taboolib.common.platform.ProxyCommandSender
import taboolib.common.platform.command.PermissionDefault
import taboolib.common.platform.command.command

/**
 * @Author xbaimiao
 * @Date 2021/10/25 15:10
 */
object Command {

    @Awake(LifeCycle.ENABLE)
    fun init() {
        command(
            name = "portal",
            permissionDefault = PermissionDefault.TRUE
        ) {
            literal("sender", optional = true, permission = "op") {
                dynamic {
                    dynamic {
                        dynamic {
                            execute<ProxyCommandSender> { sender, context, argument ->
                                val server = context.argument(-2)
                                val player = context.argument(-1)
                                val commandData = CommandPacket(argument, player, server, CommandPacket.Type.SENDER)
                                Client.sendPacket(commandData)
                            }
                        }
                    }
                }
            }
            dynamic {
                dynamic {
                    dynamic {
                        execute<ProxyCommandSender> { sender, context, argument ->
                            val server = context.argument(-2)
                            val player = context.argument(-1)
                            val commandData = CommandPacket(argument, player, server, CommandPacket.Type.PLAYER)
                            Client.sendPacket(commandData)
                        }
                    }
                }
            }
        }
    }

}