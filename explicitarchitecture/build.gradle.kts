import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.vanniktech.mavenPublish)
    alias(libs.plugins.kotlinSerialization)
}

group = "io.github.giovanniandreuzza"
version = "1.0.0"

kotlin {
    explicitApi()

    jvm()
    androidTarget {
        publishLibraryVariants("release")
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "explicitarchitecture"
            isStatic = true
        }
    }

    linuxX64()

    sourceSets {
        commonMain.dependencies {
            api(libs.kotlinx.coroutines.core)
            api(libs.kotlinx.datetime)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "io.github.giovanniandreuzza.explicitarchitecture"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}

mavenPublishing {
    // Define coordinates for the published artifact
    coordinates(
        groupId = "io.github.giovanniandreuzza",
        artifactId = "explicitarchitecture",
        version = "1.0.0"
    )

    // Configure POM metadata for the published artifact
    pom {
        name.set("KMP Library for sharing DDD concepts")
        description.set("This library can be used by Android and iOS targets for the explicitarchitecture functionality of structuring project following DDD concepts.")
        inceptionYear.set("2025")
        url.set("https://github.com/giovanniandreuzza/explicitarchitecture")

        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/MIT")
            }
        }

        // Specify developer information
        developers {
            developer {
                id.set("giovanniandreuzza")
                name.set("Giovanni Andreuzza")
                email.set("giovi.andre@gmail.com")
            }
        }

        // Specify SCM information
        scm {
            url.set("https://github.com/giovanniandreuzza/explicitarchitecture")
        }
    }

    // Configure publishing to Maven Central
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    // Enable GPG signing for all publications
    signAllPublications()
}
