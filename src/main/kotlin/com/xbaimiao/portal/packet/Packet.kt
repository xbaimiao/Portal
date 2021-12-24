package com.xbaimiao.portal.packet

import java.net.Socket

/**
 * @Author xbaimiao
 * @Date 2021/10/25 15:19
 */
interface Packet {
    val prefix: String

    fun bukkit(string: String, socket: Socket)

    fun bungee(string: String, socket: Socket)

}