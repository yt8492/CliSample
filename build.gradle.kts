plugins {
    kotlin("multiplatform") version "1.3.72"
}

group = "com.yt8492"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://kotlin.bintray.com/kotlinx")
}

kotlin {
    macosX64("macos") {
        binaries {
            executable {
                entryPoint = "com.yt8492.clisample.main"
                runTask?.args("")
            }
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation("org.jetbrains.kotlinx:kotlinx-cli:0.2.1")
            }
        }
    }
    targets.all {
        compilations.all {
            kotlinOptions {
                freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
            }
        }
    }
}
