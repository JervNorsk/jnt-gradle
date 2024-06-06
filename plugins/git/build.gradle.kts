plugins {
    // Kotlin
    // ------------------------------------------------------------------------
//    kotlin("multiplatform")
    kotlin("jvm")

    // Gradle
    // ------------------------------------------------------------------------
    id("com.gradle.plugin-publish") version "1.2.1"
}

kotlin {
    sourceSets {
        main {
            dependencies {
//                implementation(project(":plugins:common"))
                implementation(gradleKotlinDsl())
            }
        }
        test {
            dependencies {
//                implementation(project(":plugins:common"))
                implementation(kotlin("test"))
            }
        }
    }
    tasks {
        test {
            useJUnitPlatform()
        }
    }
}

gradlePlugin {
//    website.set("https://github.com/jervnorsk/GradlePlugins")
//    vcsUrl.set("https://github.com/jervnorsk/GradlePlugins")
    plugins {
        create("jnt-git") {
            id = "${project.group}.${project.name}"
            implementationClass = "${project.group}.integrations.gradle.plugins.${project.name}"
        }
    }
}
