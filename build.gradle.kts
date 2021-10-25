plugins {
    java
    id("io.izzel.taboolib") version "1.30"
    id("org.jetbrains.kotlin.jvm") version "1.5.10"
}

taboolib {
    description {
        contributors {
            name("小白").description("TabooLib Developer")
        }
//        dependencies {
//            name("ExamplePlugin")
//            name("ExamplePlugin").optional(true)
//        }
    }
    install("common")
    install("platform-bukkit")
    install("platform-bungee")
    install("module-configuration")
    install("module-chat")
	install("module-lang")
    version = "6.0.3-15"
}

repositories {
    mavenCentral()
    maven(url = uri("https://www.xbaimiao.com/repository/maven-releases/"))
}

dependencies {
    compileOnly("ink.ptms.core:v11701:11701:mapped")
    compileOnly("ink.ptms.core:v11701:11701:universal")
    compileOnly("paper:paper:waterfall")
    compileOnly(kotlin("stdlib"))
    compileOnly(fileTree("libs"))
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}