package com.xbaimiao.portal.packet.handler.bukkit

import com.xbaimiao.portal.bukkit.Portal
import com.xbaimiao.portal.packet.impl.TeleportPacket
import com.xbaimiao.portal.util.aptLocation
import org.bukkit.entity.EntityType
import taboolib.common.platform.function.submit

/**
 * @Author xbaimiao
 * @Date 2021/11/10 10:10
 */
object TeleportBukkit {

    fun bukkit(data: TeleportPacket) {
        if (data.type == TeleportPacket.Type.PLAYER) {
            //放入待tp列表
            Portal.waitTeleports[data.entityType] = data.location.aptLocation()
            submit(delay = 200) { Portal.waitTeleports.remove(data.entityType) }
        } else {
            submit {
                data.location.aptLocation().world!!.spawnEntity(
                    data.location.aptLocation(),
                    EntityType.valueOf(data.entityType)
                )
            }
        }
    }

}