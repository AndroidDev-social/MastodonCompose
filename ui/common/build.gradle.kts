plugins {
    id("social.androiddev.library.ui")
    id("kotlin-parcelize")
}

android {
    namespace = "social.androiddev.common"
    packagingOptions {
        exclude("META-INF/DEPENDENCIES")
    }
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(projects.data.network)
                api(libs.com.arkivanov.decompose)
                api(libs.com.arkivanov.decompose.extensions.compose.jetbrains)
                implementation(libs.kotlinx.collections.immutable)
                implementation("com.alialbaali.kamel:kamel-image:0.4.0")
                implementation("it.skrape:skrapeit:1.2.2")

            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(libs.org.jetbrains.kotlin.test.common)
                implementation(libs.org.jetbrains.kotlin.test.annotations.common)
            }
        }
        val androidTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(libs.org.jetbrains.kotlin.test.junit)
            }
        }
    }
}
