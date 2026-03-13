import java.util.Properties

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
    id("com.google.firebase.firebase-perf")
    // id("com.huawei.agconnect") // Temporarily disabled - plugin not found
}

// Load secrets.properties if it exists
val secretsFile = file(rootProject.file("secrets.properties"))
val secrets = Properties()
if (secretsFile.exists()) {
    secrets.load(secretsFile.inputStream())
}

android {
    namespace = "com.ykapps.earnings"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.ykapps.earnings"
        minSdk = 21
        targetSdk = 35
        versionCode = 10
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        // Flutter multi-ABI support
        ndk {
            abiFilters += listOf("armeabi-v7a", "arm64-v8a", "x86", "x86_64")
        }

        // Preserve the original resource configurations
        resConfigs("en")

        // Manifest placeholders for API keys
        manifestPlaceholders["appLovinSdkKey"] = secrets.getProperty("appLovinSdkKey", "YOUR_APPLOVIN_SDK_KEY")
        manifestPlaceholders["appsFlyerDevKey"] = secrets.getProperty("appsFlyerDevKey", "YOUR_APPSFLYER_DEV_KEY")
        manifestPlaceholders["singularAppId"] = secrets.getProperty("singularAppId", "YOUR_SINGULAR_APP_ID")
        manifestPlaceholders["singularAppKey"] = secrets.getProperty("singularAppKey", "YOUR_SINGULAR_APP_KEY")
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            isMinifyEnabled = false
            isDebuggable = true
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    // Flutter support
    buildFeatures {
        viewBinding = true
        buildConfig = true
    }

    // Handle duplicate files
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += "/META-INF/DEPENDENCIES"
            excludes += "/META-INF/LICENSE"
            excludes += "/META-INF/LICENSE.txt"
            excludes += "/META-INF/NOTICE"
            excludes += "/META-INF/NOTICE.txt"
        }
    }

    // Support for different screen sizes like the original
    splits {
        density {
            isEnable = true
            reset()
            include("mdpi", "hdpi", "xhdpi", "xxhdpi", "xxxhdpi")
        }
        abi {
            isEnable = true
            reset()
            include("armeabi-v7a", "arm64-v8a", "x86", "x86_64")
            isUniversalApk = true
        }
    }
}

dependencies {
    // AndroidX Core
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.activity:activity-ktx:1.8.2")
    implementation("androidx.fragment:fragment-ktx:1.6.2")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-process:2.7.0")
    implementation("androidx.startup:startup-runtime:1.1.1")
    implementation("androidx.work:work-runtime-ktx:2.9.0")
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    annotationProcessor("androidx.room:room-compiler:2.6.1")

    // Emoji2
    implementation("androidx.emoji2:emoji2:1.4.0")
    implementation("androidx.emoji2:emoji2-views:1.4.0")

    // Profile Installer
    implementation("androidx.profileinstaller:profileinstaller:1.3.1")

    // Window
    implementation("androidx.window:window:1.2.0")
    implementation("androidx.window:window-java:1.2.0")

    // Credentials
    implementation("androidx.credentials:credentials:1.2.0")
    implementation("androidx.credentials:credentials-play-services-auth:1.2.0")

    // Google Play Services
    implementation("com.google.android.gms:play-services-ads:22.6.0")
    implementation("com.google.android.gms:play-services-ads-identifier:18.0.1")
    implementation("com.google.android.gms:play-services-auth:20.7.0")
    implementation("com.google.android.gms:play-services-location:21.1.0")
    implementation("com.google.android.gms:play-services-appset:16.0.2")
    implementation("com.google.android.gms:play-services-fido:20.2.0")
    implementation("com.google.android.gms:play-services-tagmanager:18.0.3")
    implementation("com.google.android.gms:play-services-analytics:18.0.3")
    implementation("com.google.android.gms:play-services-measurement:21.5.1")
    implementation("com.google.android.gms:play-services-measurement-sdk:21.5.1")
    implementation("com.google.android.gms:play-services-cloud-messaging:17.2.0")

    // Firebase
    implementation(platform("com.google.firebase:firebase-bom:34.10.0"))
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.firebase:firebase-messaging")
    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.firebase:firebase-crashlytics")
    implementation("com.google.firebase:firebase-performance")
    implementation("com.google.firebase:firebase-config")
    implementation("com.google.firebase:firebase-dynamic-links")
    implementation("com.google.firebase:firebase-appcheck")
    implementation("com.google.firebase:firebase-appcheck-playintegrity")
    implementation("com.google.firebase:firebase-installations")

    // Google Integrity API
    implementation("com.google.android.play:integrity:1.3.0")
    implementation("com.google.android.play:app-update:2.1.0")
    implementation("com.google.android.play:review:2.0.1")

    // reCAPTCHA
    implementation("com.google.android.recaptcha:recaptcha:18.6.1")

    // User Messaging Platform (GDPR)
    implementation("com.google.android.ump:user-messaging-platform:2.2.0")

    // AppLovin MAX
    implementation("com.applovin:applovin-sdk:11.3.3")
    implementation("com.applovin:applovin-max-sdk:11.3.3")

    // Fyber FairBid
    implementation("com.fyber:fairbid-sdk:1.3.17")
    implementation("com.fyber:inneractive-sdk:8.3.3")

    // DigitalTurbine
    implementation("com.digitalturbine.ignite:core:4.6.0")
    implementation("com.digitalturbine.ignite:advertising:4.6.0")

    // AppsFlyer
    implementation("com.appsflyer:af-android-sdk:6.12.0")
    implementation("com.android.installreferrer:installreferrer:2.2")

    // Singular
    implementation("com.singular.sdk:singular-sdk:12.9.1")

    // Huawei HMS Core
    implementation("com.huawei.hms:iap:6.13.0.300")
    implementation("com.huawei.hms:base:6.11.0.302")
    implementation("com.huawei.hms:ads-identifier:3.4.62.300")
    implementation("com.huawei.hms:ads-lite:13.4.62.300")
    implementation("com.huawei.hms:location:6.3.0.300")
    implementation("com.huawei.hms:push:6.11.0.300")
    implementation("com.huawei.hms:hwid:6.11.0.300")
    implementation("com.huawei.hms:availability:2.0.2.300")

    // AGConnect
    implementation("com.huawei.agconnect:agconnect-core:1.9.1.300")

    // OkHttp
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")

    // Kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.22")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // Protobuf
    implementation("com.google.protobuf:protobuf-javalite:3.25.1")

    // Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
