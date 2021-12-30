package com.xbaimiao.portal.bukkit.module

import com.xbaimiao.portal.bukkit.channel.Client
import com.xbaimiao.portal.bukkit.module.ItemName.Companion.getChineseName
import com.xbaimiao.portal.packet.impl.HoverItemPacket
import com.xbaimiao.util.PlaceholderHook.Companion.papi
import net.md_5.bungee.chat.ComponentSerializer
import net.minecraft.server.level.EntityPlayer
import org.bukkit.Bukkit
import org.bukkit.event.player.AsyncPlayerChatEvent
import org.bukkit.inventory.ItemStack
import taboolib.common.platform.event.EventPriority
import taboolib.common.platform.event.SubscribeEvent
import taboolib.common.reflect.Reflex.Companion.invokeMethod
import taboolib.common.reflect.Reflex.Companion.setProperty
import taboolib.module.chat.TellrawJson
import taboolib.module.lang.event.PlayerSelectLocaleEvent
import taboolib.module.nms.i18n.I18n
import taboolib.platform.util.hoverItem

object ItemHover {

    val list = ArrayList<String>().also {
        it.add("%1")
        it.add("%2")
        it.add("%3")
        it.add("%4")
        it.add("%5")
        it.add("%6")
        it.add("%7")
        it.add("%8")
        it.add("%9")
    }
    var id = 0
    val prefix = "%minetags_player_tag%§7%player_name%§7>§f  "
    val format = "§6[§7%item_name% §cx §7%item_amount%§6]"

    @SubscribeEvent
    fun zl(event: PlayerSelectLocaleEvent) {
        event.locale = "zh_CN"
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    fun show(event: AsyncPlayerChatEvent) {
        val msg = event.message
        var isJump = false
        var itemAmount = 0
        if (msg.contains("%")) {
            val sendAccList = ArrayList<String>()
            var isSend = false
            val player = event.player
            player.invokeMethod<EntityPlayer>("getHandle")?.apply {
                this.setProperty("locale", "zh_CN")
            }
            val prefix = this.prefix.papi(player)

            val msgMain = TellrawJson().append(prefix)

            val length = msg.length
            for (i in 0 until length) {
                if (isJump) {
                    //跳过数字序号
                    isJump = false
                    continue
                }
                //如果是在展示物品
                if (msg[i].toString() == "%") {
                    val num: String
                    try {
                        num = "${msg[i]}${msg.substring(i + 1, i + 2)}"
                    } catch (e: Exception) {
                        continue
                    }
                    if (num in list && num !in sendAccList) {
                        sendAccList.add(num)
                        val itemToLink: ItemStack = player.inventory.getItem(msg.substring(i + 1, i + 2).toInt() - 1)
                            ?: continue

                        id++
                        var name = itemToLink.itemMeta?.displayName
                        if (name == null || name == "") {
                            name = itemToLink.type.getChineseName()
                        }
                        if (name == null) {
                            name = I18n.instance.getName(itemToLink)
                        }
                        if (name == "") {
                            name = itemToLink.type.toString()
                        }
                        val show = TellrawJson().apply {
                            append(
                                format.replace("%item_name%", name!!)
                                    .replace("%item_amount%", "${itemToLink.amount}")
                            )
                            hoverItem(itemToLink)
                        }
                        msgMain.append(show)
                        msgMain.append(" ")
                        itemAmount++
                        isSend = true
                        isJump = true
                        continue
                    }
                }
                msgMain.append("§f" + msg[i].toString())
            }
            if (isSend) {
                Client.sendPacket(HoverItemPacket(msgMain.toRawMessage()))
                Bukkit.getConsoleSender().spigot().sendMessage(*ComponentSerializer.parse(msgMain.toRawMessage()))
                event.isCancelled = true
            }
        }
    }

}