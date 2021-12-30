package com.xbaimiao.portal.bungee.module

import com.xbaimiao.portal.bungee.channel.Server
import com.xbaimiao.portal.packet.impl.CommandPacket
import com.xbaimiao.portal.packet.impl.TPAPacket
import net.md_5.bungee.api.ProxyServer
import net.md_5.bungee.api.event.LoginEvent
import net.md_5.bungee.api.event.PlayerDisconnectEvent
import taboolib.common.LifeCycle
import taboolib.common.platform.Awake
import taboolib.common.platform.ProxyPlayer
import taboolib.common.platform.command.command
import taboolib.common.platform.event.SubscribeEvent
import taboolib.module.lang.sendLang

/**
 * 跨服TPA模块
 */
object TPA {

    private val tpaMap = HashMap<String, ArrayList<String>>()

    @SubscribeEvent
    fun join(event: LoginEvent) {
        tpaMap[event.connection.name] = ArrayList()
    }

    @SubscribeEvent
    fun quit(event: PlayerDisconnectEvent) {
        tpaMap.remove(event.player.name)
    }

    @Awake(LifeCycle.ENABLE)
    fun init() {
        command(
            "tpa",
            permission = "default"
        ) {
            dynamic {
                suggestion<ProxyPlayer> { _, _ ->
                    ProxyServer.getInstance().players.map { it.name }
                }
                // player1是tpa发起者 player2是被请求者
                execute<ProxyPlayer> { player1, _, player2 ->
                    val proxyPlayer = ProxyServer.getInstance().players.first { it.name == player2 }
                    val proxyPlayer1 = ProxyServer.getInstance().players.first { it.name == player1.name }
                    if (proxyPlayer1.server.info.name == "登录中") {
                        return@execute
                    }
                    Server.sendMessage(proxyPlayer.server.info.name, TPAPacket(player1.name, player2))
                    tpaMap[player2]!!.add(player1.name)
                    player1.sendLang("tpasend", player2)
                }
            }
            execute<ProxyPlayer> { player, _, _ ->
                player.sendLang("tpahelp1")
            }
        }
        command(
            "tpaccept",
            permission = "default"
        ) {
            dynamic {
                suggestion<ProxyPlayer> { _, _ ->
                    ProxyServer.getInstance().players.map { it.name }
                }
                // player1 是被请求者 player2是tpa发起者
                execute<ProxyPlayer> { player1, _, player2 ->
                    // 如果被请求者输入了 /tpaccept $player2 则检查player2有没有发起tpa 如果发起了把他俩位置搞一堆
                    val proxyPlayer1 = ProxyServer.getInstance().players.first { it.name == player1.name }
                    if (proxyPlayer1.server.info.name == "登录中") {
                        return@execute
                    }
                    if (tpaMap[player1.name]!!.contains(player2)) {
                        val proxyPlayer2 = ProxyServer.getInstance().players.first { it.name == player2 }
                        tpaMap[player1.name]!!.remove(player2)
                        var delay = CommandPacket.Delay.NOW
                        if (proxyPlayer1.server.info.name != proxyPlayer2.server.info.name) {
                            delay = CommandPacket.Delay.DELAY
                            proxyPlayer2.connect(proxyPlayer1.server.info)
                            "§6由于此次TPA传送为跨服传送 如果失败请到达玩家对应服务器再次TPA".apply {
                                proxyPlayer1.sendMessage(this)
                                proxyPlayer2.sendMessage(this)
                            }
                        }
                        Server.sendMessage(
                            proxyPlayer1.server.info.name,
                            CommandPacket(
                                "tp $player2 ${player1.name}",
                                player2,
                                proxyPlayer1.server.info.name,
                                CommandPacket.SenderType.SENDER,
                                delay
                            )
                        )
                    }
                }
            }
            execute<ProxyPlayer> { player, _, _ ->
                player.sendLang("tpahelp2")
            }
        }
        command(
            "tpdeny",
            permission = "default"
        ) {
            dynamic {
                suggestion<ProxyPlayer> { _, _ ->
                    ProxyServer.getInstance().players.map { it.name }
                }
                // player1 是被请求者 player2是tpa发起者
                execute<ProxyPlayer> { player1, _, player2 ->
                    // 如果被请求者输入了 /tpaccept $player2 则检查player2有没有发起tpa 如果发起了把他俩位置搞一堆
                    if (tpaMap[player1.name]!!.contains(player2)) {
                        val proxyPlayer1 = ProxyServer.getInstance().players.first { it.name == player1.name }
                        val proxyPlayer2 = ProxyServer.getInstance().players.first { it.name == player2 }
                        proxyPlayer2.sendMessage("§e你对${player1.name}发起的传送请求已被拒绝")
                        proxyPlayer1.sendMessage("§e已拒绝传送")
                        tpaMap[player1.name]!!.remove(player2)
                    }
                }
            }
            execute<ProxyPlayer> { player, _, _ ->
                player.sendLang("tpahelp3")
            }
        }
    }

}