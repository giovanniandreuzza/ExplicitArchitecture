import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import java.io.FileNotFoundException
import java.util.Properties

plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.vanniktech.mavenPublish)
    alias(libs.plugins.kotlinSerialization)
}

val localProperties = loadProperties()

group = "io.github.giovanniandreuzza"
version = localProperties.getVersion()

kotlin {
    explicitApi()

    jvm()
    androidTarget {
        publishLibraryVariants("release")
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_1_8)
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}

tasks.register("generateReadme") {
    val readmeTemplatePath = rootProject.file("README.md.template").absolutePath
    val readmePath = rootProject.file("README.md").absolutePath
    val versionFilePath = rootProject.file("versions.properties").absolutePath

    inputs.file(readmeTemplatePath)
    outputs.file(readmePath)

    doLast {
        val version = File(versionFilePath)
            .readLines()
            .first { it.startsWith("VERSION=") }
            .substringAfter("=")

        val content = File(readmeTemplatePath).readText().replace(
            oldValue = "\$VERSION",
            newValue = version
        )

        File(readmePath).writeText(content)
    }
}

tasks.build {
    dependsOn("generateReadme")
}

mavenPublishing {
    // Define coordinates for the published artifact
    coordinates(
        groupId = "io.github.giovanniandreuzza",
        artifactId = "explicitarchitecture",
        version = localProperties.getVersion()
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

fun loadProperties() = rootProject.file("versions.properties").let {
    if (!it.exists()) {
        throw FileNotFoundException("File ${it.absolutePath} not found")
    }

    Properties().also { properties ->
        properties.load(it.inputStream())
    }
}

fun Properties.getVersion() = getProperty("VERSION") ?: "1.0.0"
