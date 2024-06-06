plugins {
    // Kotlin
    // ------------------------------------------------------------------------
//    kotlin("multiplatform")
    kotlin("jvm")
}

kotlin {
    sourceSets {
        main {
            dependencies {
                implementation(gradleKotlinDsl())
            }
        }
        test {
            dependencies {
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
