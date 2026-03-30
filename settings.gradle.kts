//pluginManagement {
//    repositories {
//        google {
//            content {
//                includeGroupByRegex("com\\.android.*")
//                includeGroupByRegex("com\\.google.*")
//                includeGroupByRegex("androidx.*")
//            }
//        }
//        mavenCentral()
//        gradlePluginPortal()
//    }
//}
//plugins {
//    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
//}
//dependencyResolutionManagement {
//    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
//    repositories {
//        google()
//        mavenCentral()
//    }
//}
//
//rootProject.name = "TmcLibraryTest"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        // mavenCentral()
        // google()


        // jcenter {
        //     content {
        //         includeGroup("org.jetbrains.kotlinx")
        //         includeGroup("com.github.aakira")
        //     }
        // }

        // maven { url = uri("https://www.jitpack.io" ) }
        maven { url = uri("https://nexus.europlan.ru/repository/maven/")}
        maven { url = uri("https://nexus.europlan.ru/repository/maven-google/")}
        maven { url = uri("https://nexus.europlan.ru/repository/maven-jitpack/")}
    }
}
rootProject.name = "TmcLibraryTest"

includeBuild("build-logic")
include(":app")
 