plugins {
    id("base-convention")
    id("com.android.application")
    id("android-base-convention")
    id("kotlin-android")
}
val composeVersion = "1.5.15"

android {
    namespace = "com.vladismaker.tmclibrarytest"

    buildFeatures {
        compose = true
    }

    defaultConfig {
        multiDexEnabled = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            buildConfigField("Boolean", "IsDebug", "false")
        }
        getByName("debug") {
            isDebuggable = true
            applicationIdSuffix = ".dev"
            versionNameSuffix = "-DEV"
            buildConfigField("Boolean", "IsDebug", "true")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    packaging {
        resources {
            excludes.add("META-INF/LICENSE.txt")
            excludes.add("META-INF/NOTICE.txt")
            excludes.add("META-INF/app_debug.kotlin_module")
            excludes.add("META-INF/app_stage.kotlin_module")
            excludes.add("META-INF/app_release.kotlin_module")
            excludes.add("*/mips/*.so")
            excludes.add("*/mips64/*.so")
        }
    }
}
