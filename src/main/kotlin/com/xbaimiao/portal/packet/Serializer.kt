package com.xbaimiao.portal.packet

interface Serializer : Packet {

    fun parse(string: String): Serializer

    fun serializer(): String

}