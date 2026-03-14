pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        // Flutter artifacts via JitPack
        maven {
            url = uri("https://jitpack.io")
        }
        // AppsFlyer - available on Maven Central
        // Additional repositories for ad SDKs (commented out due to access issues)
        // maven(url = "https://artifactory.applovin.com/artifactory/")
        // maven(url = "https://android-sdk.is.com/")
        // maven(url = "https://mvn.singular.net/adk")
        // maven(url = "https://maven.appsflyer.com/android")
        // maven(url = "https://digitalturbine.jfrog.io/artifactory/")
        // maven(url = "https://developer.huawei.com/repo/")
        // maven(url = "https://jitpack.io")
    }
}

rootProject.name = "Earnings"
include(":app")
