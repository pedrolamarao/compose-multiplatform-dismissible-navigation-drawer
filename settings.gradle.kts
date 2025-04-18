pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
    }
    plugins {
        kotlin("jvm") version("2.1.20")
        kotlin("multiplatform") version("2.1.20")
        kotlin("plugin.compose") version("2.1.20")
        kotlin("plugin.serialization") version("2.1.20")
        id("org.jetbrains.compose") version("1.8.0-beta02")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention").version("0.9.0")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
    }
}

rootProject.name = "sample"
