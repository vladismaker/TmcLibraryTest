plugins {
    id("android-app-convention")
    id("kotlin-kapt")
    id("kotlinx-serialization")
    id("io.realm.kotlin")
//    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
    id("realm-android")
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.20"
}

android {
    //buildFeatures.dataBinding = true
    namespace = "com.vladismaker.tmclibrarytest"

    defaultConfig {
        applicationId = "com.vladismaker.tmclibrarytest"
        //minSdkVersion = 24
        //targetSdkVersion = 34
        versionCode = 255
        versionName = "9.1.1"
        multiDexEnabled = true
        vectorDrawables.useSupportLibrary = true
    }

    signingConfigs {
        create("release"){
            keyAlias = "wwii-app-key"
            keyPassword = "Y6nev6DBhf"
            storeFile = file("../wwii-keystore.jks")
            storePassword = "gx52WYnG7Q"
        }
        /*getByName("debug"){
            keyAlias = ""
            keyPassword = ""
            storeFile = file("")
            storePassword = ""
        }*/
        buildTypes {
            getByName("release") {
                isMinifyEnabled = false
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
                signingConfig = signingConfigs.getByName("release")
                isDebuggable = false
            }
            getByName("debug") {
                signingConfig = signingConfigs.getByName("debug")
                android.buildFeatures.buildConfig = true
                isDebuggable = true
            }
        }
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }
    }
}

dependencies {
    val composeBom = platform(libs.composeBom)
    implementation(composeBom)
    androidTestImplementation(composeBom)
    implementation(libs.composeConstraintlayout)
    implementation(libs.composeActivity)
    implementation(libs.composeMaterial3)
    implementation(libs.composeTooling)
    implementation(libs.navigation.compose)
    //implementation(libs.androidxLifecycleViewModelCompose)

    implementation(libs.inputMask)
    implementation(libs.appCompat)
    implementation(libs.material)
    implementation(libs.biometric)
    //implementation(libs.constraintLayout)
    //implementation(libs.recyclerView)
    implementation(libs.kotlinSerialization)
    //implementation(libs.swipeRefreshLayout)
    //implementation(libs.prolificInteractiveCalendar)
    implementation(libs.mokoMvvmDataBinding)
    implementation(libs.mokoPermissions)
    implementation(libs.composeGlide)
    implementation(libs.mokoMvvmFlowCompose)
    implementation(libs.appMetrica)
    implementation(libs.yandexMaps)
    implementation(libs.appMetrica)
    implementation(libs.firebase)
    implementation(libs.paging)
    implementation(libs.glide)
    implementation(libs.okHttp)
    implementation(libs.threetenAbp)
    //implementation(libs.realm)
    implementation(libs.multidex)
    //implementation(libs.firebaseCoreGradle)
//    implementation(projects.shared)

    implementation(platform(libs.bom))
    implementation(libs.crashlytics)
    implementation(libs.converterGson)

    implementation(libs.koin.core)
    implementation(libs.koin.android)
    implementation(libs.koin.androidx.compose)

//    implementation(libs.coilCompose)
//    implementation(libs.coilNetWork)

//    implementation(libs.cameraCore)
//    implementation(libs.camera2)
//    implementation(libs.cameraView)
//    implementation(libs.cameraLifecycle)

    implementation(libs.ktorClient)

    kotlin {
        jvmToolchain(17)
    }
}
