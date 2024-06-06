with(rootProject) {
    name = "jnt-gradle"
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

pluginManagement {
    resolutionStrategy {
        plugins {
            // Kotlin
            // ----------------------------------------------------------------
            kotlin("multiplatform") version (extra["kotlin.version"] as String)
            kotlin("jvm") version (extra["kotlin.version"] as String)

            // Kotlin Plugins
            // ----------------------------------------------------------------
            kotlin("plugin.serialization") version (extra["kotlin.version"] as String)
        }
    }
}

arrayOf(
    ":plugins:common",
    ":plugins:git"
).forEach {
    include(it)
    project(it).apply {
        projectDir = file("." + it.replace(":", "/"))
    }
}
