plugins {
    // IDE
    // ------------------------------------------------------------------------
    id("idea")

    // Kotlin
    // ------------------------------------------------------------------------
//    kotlin("multiplatform") apply false
//    kotlin("jvm") apply false

    // Gradle
    // ------------------------------------------------------------------------
//    id("com.gradle.plugin-publish") version "1.2.1"

    // Third Parties
    // ------------------------------------------------------------------------
//    id("com.olafmertens.git-version") version "0.1.1"
}

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}

//allprojects {
//    group = "io.github.jervnorsk"
//    afterEvaluate {
//        version = rootProject.version
//    }
//}

//gradlePlugin {
////    website.set("https://github.com/jervnorsk/GradlePlugins")
////    vcsUrl.set("https://github.com/jervnorsk/GradlePlugins")
//    plugins {
////        create("greetingsPlugin") {
////            id = "io.github.jervnorsk.greeting"
////            implementationClass = "io.github.jervnorsk.gradle.GreetingPlugin"
////            displayName = "Gradle Greeting plugin"
////            description = "Gradle plugin to say hello!"
////            tags.set(listOf("search", "tags", "for", "your", "hello", "plugin"))
////        }
////        create("goodbyePlugin") {
////            id = "io.github.jervnorsk.goodbye"
////            implementationClass = "io.github.jervnorsk.gradle.GoodbyePlugin"
////            displayName = "Gradle Goodbye plugin"
////            description = "Gradle plugin to say goodbye!"
////            tags.set(listOf("search", "tags", "for", "your", "goodbye", "plugin"))
////        }
//        create("git") {
//            id = "${project.group}.${name}"
//            implementationClass = "${project.group}.integrations.gradle.plugins.${name}"
//        }
//    }
//}
