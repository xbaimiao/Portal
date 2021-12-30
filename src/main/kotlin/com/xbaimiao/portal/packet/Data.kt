package com.xbaimiao.portal.packet

import com.google.gson.Gson
import com.xbaimiao.portal.packet.impl.*
import taboolib.common.reflect.Reflex.Companion.unsafeInstance

/**
 * @Author xbaimiao
 * @Date 2021/11/10 10:13
 */
object Data {

    private val packets = HashMap<String, Class<out Packet>>()

    fun putPacket(clazz: Class<out Packet>) {
        val method = clazz.getMethod("getPrefix")
        method.isAccessible = true
        val prefix = method.invoke(clazz.unsafeInstance()) as String
        packets[prefix] = clazz
    }

    fun parse(prefix: String, data: String): Packet? {
        val packetClass = packets[prefix] ?: return null
        val obj = packetClass.unsafeInstance()
        return if (obj is Serializer) {
            obj.parse(data)
        } else {
            val gson = Gson()
            gson.fromJson(data, packetClass)
        }
    }

    fun init() {
        putPacket(CommandPacket::class.java)
        putPacket(HoverItemPacket::class.java)
        putPacket(ServerPacket::class.java)
        putPacket(TeleportPacket::class.java)
        putPacket(TPAPacket::class.java)
    }

}