package com.xbaimiao.portal.packet

import taboolib.common.reflect.Reflex.Companion.unsafeInstance

/**
 * @Author xbaimiao
 * @Date 2021/11/10 10:13
 */
val packets = HashMap<String, Class<out Packet>>()

fun putPacket(clazz: Class<out Packet>) {
    val method = clazz.getMethod("getPrefix")
    method.isAccessible = true
    val prefix = method.invoke(clazz.unsafeInstance()) as String
    packets[prefix] = clazz
}

fun init() {
    putPacket(CommandPacket::class.java)
    putPacket(TeleportPacket::class.java)
    putPacket(ServerPacket::class.java)
    putPacket(HoverItemPacket::class.java)
}