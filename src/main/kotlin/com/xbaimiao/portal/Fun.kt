package com.xbaimiao.portal

import org.bukkit.Bukkit
import org.bukkit.Location

/**
 * @Author xbaimiao
 * @Date 2021/10/23 17:12
 */
fun String.aptLocation(): Location {
    val args = this.split(",")
    return Location(Bukkit.getWorld(args[0]), args[1].toDouble(), args[2].toDouble(), args[3].toDouble())
}

fun Location.aptString(): String {
    return "${world!!.name},$blockX,$blockY,$blockZ"
}

