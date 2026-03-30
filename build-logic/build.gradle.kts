plugins {
    `kotlin-dsl`
}

repositories {
//    mavenCentral()
//    google()
//    maven { url = uri("https://www.jitpack.io" ) }
//    maven { url = uri("https://kotlin.bintray.com/kotlinx") }
//    gradlePluginPortal()
    maven { url = uri("https://nexus.europlan.ru/repository/maven/")}
    maven { url = uri("https://nexus.europlan.ru/repository/maven-google/")}
    maven { url = uri("https://nexus.europlan.ru/repository/maven-jitpack/")}
}

dependencies {
    api("dev.icerock:mobile-multiplatform:0.14.4")
    api("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.20")
    api("com.android.tools.build:gradle:8.5.2")
    api("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.18.0")
//    api("com.google.gms:google-services:4.3.14")
}
