plugins {
    id("base-convention")
    id("com.android.library")
    id("kotlin-android")
    id("android-base-convention")
}

android {
    namespace = "com.vladismaker.tmclibrarytest"

    sourceSets.all { java.srcDir("src/$name/kotlin") }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    kotlin {
        jvmToolchain(17)
    }
}
