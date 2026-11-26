plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.kasirstroller" // Pastikan ini sesuai dengan nama package Anda
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.kasirstroller"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
} // <-- Kurung penutup android di sini

// TAMBAHKAN BAGIAN INI DI PALING BAWAH:
dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
}
