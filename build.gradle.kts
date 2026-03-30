import org.gradle.api.internal.artifacts.DefaultModuleVersionSelector

plugins {
    id("de.undercouch.download") version "5.2.0"
    alias(libs.plugins.touchlab.skie).apply(false)
    alias(libs.plugins.moko.resources).apply(false)
}

buildscript {
    val compose_version by extra("1.2.0")
    val compose_ui_version by extra("1.2.0")

    repositories {
        mavenCentral()
        mavenLocal()
        google()
        gradlePluginPortal()
//        maven { url = uri("https://www.jitpack.io" ) }
        maven { url = uri("https://nexus.europlan.ru/repository/maven/")}
        maven { url = uri("https://nexus.europlan.ru/repository/maven-google/")}
        maven { url = uri("https://nexus.europlan.ru/repository/maven-jitpack/")}
    }
    dependencies {
        classpath(libs.mokoNetworkGeneratorGradle)
        classpath(libs.kotlinSerializationGradle)
        classpath(libs.realmGradle)
//        classpath(libs.googleServicesGradle)
        classpath(libs.crashlyticsGradle)
        classpath(libs.realmNewGradle)
        classpath(":build-logic")
    }
}

allprojects {
    configurations.configureEach {
        resolutionStrategy {
            val coroutines: MinimalExternalModuleDependency = rootProject.libs.coroutines.get()
            val forcedCoroutines: ModuleVersionSelector = DefaultModuleVersionSelector.newSelector(
                coroutines.module,
                coroutines.versionConstraint.requiredVersion
            )
            force(forcedCoroutines)
        }
    }
}

tasks.register("clean", Delete::class).configure {
    group = "build"
    delete(rootProject.layout.buildDirectory)
}