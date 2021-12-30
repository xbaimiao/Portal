package com.xbaimiao.portal.util

import java.io.File
import java.net.URLDecoder
import java.util.jar.JarFile

/**
 * @Author xbaimiao
 * @Date 2021/11/22 20:09
 */
object PackageUtil {

    @JvmStatic
    fun getSelfClass(prefix: String = ""): List<String> {
        val path = this.javaClass.protectionDomain.codeSource.location.file
        val jarFile = JarFile(File(URLDecoder.decode(path, "utf-8")))
        return getClassList(jarFile, prefix)
    }

    @JvmStatic
    fun getClassList(file: JarFile, prefix: String = ""): List<String> {
        val array = arrayListOf<String>()
        for (entry in file.entries()) {
            if (entry.name.endsWith(".class")) {
                val name = entry.name.replace("/", ".").substring(0, entry.name.length - 6)
                if (name.contains("$") || name.contains("META-INF")) {
                    continue
                }
                if (prefix == "" || name.startsWith(prefix)) {
                    array.add(name)
                }
            }
        }
        return array
    }

}