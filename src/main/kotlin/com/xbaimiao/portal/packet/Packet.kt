package com.xbaimiao.portal.packet

import java.net.Socket

/**
 * @Author xbaimiao
 * @Date 2021/10/25 15:19
 */
interface Packet {

    val prefix: String

    fun bukkit(data: String, socket: Socket)

    fun bungee(data: String, socket: Socket)

    override fun toString(): String

}