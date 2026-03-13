# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /sdk/tools/proguard/proguard-android.txt

# Keep Flutter classes
-keep class io.flutter.** { *; }
-keep class io.flutter.plugins.** { *; }
-keep class flutter.** { *; }
-keep class android.** { *; }
-keep class androidx.** { *; }
-keep class org.** { *; }
-keep class com.** { *; }
-keep class kotlin.** { *; }
-keep class okhttp3.** { *; }
-keep class okio.** { *; }

# Keep R class
-keep class com.ykapps.earnings.R { *; }
-keep class com.ykapps.earnings.**$* { *; }

# Keep native methods
-keepclasseswithmembernames class * {
    native <methods>;
}

# Keep custom view constructors
-keepclasseswithmembers class * {
    public <init>(android.content.Context, android.util.AttributeSet);
}
-keepclasseswithmembers class * {
    public <init>(android.content.Context, android.util.AttributeSet, int);
}

# Keep enum methods
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# Keep Parcelable
-keep class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}

# Keep Serializable
-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

# Keep annotations
-keepattributes *Annotation*
-keepattributes Signature
-keepattributes Exceptions
-keepattributes InnerClasses
-keepattributes EnclosingMethod

# Firebase
-keep class com.google.firebase.** { *; }
-keep class com.google.android.gms.** { *; }
-dontwarn com.google.firebase.**
-dontwarn com.google.android.gms.**

# Firebase Crashlytics
-keep class com.google.firebase.crashlytics.** { *; }

# Firebase Performance
-keep class com.google.firebase.perf.** { *; }

# Google AdMob
-keep class com.google.android.gms.ads.** { *; }
-keep class com.google.android.ump.** { *; }

# AppLovin
-keep class com.applovin.** { *; }
-keep class com.applovin.mediation.** { *; }
-dontwarn com.applovin.**

# Fyber
-keep class com.fyber.** { *; }
-keep class com.digitalturbine.** { *; }
-dontwarn com.fyber.**

# AppsFlyer
-keep class com.appsflyer.** { *; }
-dontwarn com.appsflyer.**

# Singular
-keep class com.singular.** { *; }
-keep class com.singular.sdk.** { *; }
-dontwarn com.singular.**

# Huawei HMS
-keep class com.huawei.** { *; }
-keep class com.huawei.hms.** { *; }
-keep class com.huawei.agconnect.** { *; }
-dontwarn com.huawei.**

# OkHttp
-dontwarn okhttp3.**
-dontwarn okio.**
-keepnames class okhttp3.internal.publicsuffix.PublicSuffixDatabase

# Kotlin
-keep class kotlin.** { *; }
-keep class kotlin.Metadata { *; }
-dontwarn kotlin.**
-keepclassmembers class **$WhenMappings {
    <fields>;
}
-keepclassmembers class kotlin.Metadata {
    public <methods>;
}

# Kotlin Coroutines
-keepnames class kotlinx.coroutines.internal.MainDispatcherFactory {}
-keepnames class kotlinx.coroutines.CoroutineExceptionHandler {}
-keepclassmembers class kotlinx.coroutines.** {
    volatile <fields>;
}

# Play Integrity
-keep class com.google.android.play.core.integrity.** { *; }

# reCAPTCHA
-keep class com.google.android.recaptcha.** { *; }

# Billing
-keep class com.android.billingclient.** { *; }

# Adjoe
-keep class io.adjoe.** { *; }
-dontwarn io.adjoe.**

# Keep Flutter assets
-keep class crypto.bitcoin.ethereum.litecoin.cloud.mining.eth.btc.ltc.hash.pool.cloud_mining.** { *; }

# Keep defpackage (obfuscated classes from decompilation)
-keep class defpackage.** { *; }

# Keep J2J (Jackson-like) classes
-keep class j$.** { *; }

# Keep crypto stuff package
-keep class crypto.** { *; }

# Keep resources
-keep class com.ykapps.earnings.R
-keep class com.ykapps.earnings.**R
-keep class com.ykapps.earnings.**R$*

# Keep BuildConfig
-keep class com.ykapps.earnings.BuildConfig { *; }

# Keep classes referenced in AndroidManifest.xml
-keep class com.ykapps.earnings_com.google.android.gms.permission.AD_ID { *; }
-keep class com.ykapps.earnings_BIND_GET_INSTALL_REFERRER_SERVICE { *; }
-keep class com.ykapps.earnings.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION { *; }
-keep class com.ykapps.earnings_com.google.android.c2dm.permission.RECEIVE { *; }
-keep class com.ykapps.earnings_com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE { *; }
-keep class com.ykapps.earnings_com.applovin.array.apphub.permission.BIND_APPHUB_SERVICE { *; }
-keep class com.ykapps.earnings_com.google.android.providers.gsf.permission.READ_GSERVICES { *; }
