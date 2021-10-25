package com.xbaimiao.portal

/**
 * 传送门传送数据包
 * @Author xbaimiao
 * @Date 2021/10/23 17:09
 */
class TeleportData(
    val location: String,
    val type: Type,
    val server: String,
    val entityType: String
) {

    enum class Type {
        ENTITY, PLAYER
    }

    fun aptLocation() = location.aptLocation()

}