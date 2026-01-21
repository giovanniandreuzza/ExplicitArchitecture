plugins {
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.vanniktech.mavenPublish) apply false
}

tasks.register("clean") {
    doLast {
        file(rootProject.layout.buildDirectory).deleteRecursively()
    }
}