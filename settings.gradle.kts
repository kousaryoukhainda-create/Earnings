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
        maven(url = "https://developer.huawei.com/repo/")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://developer.huawei.com/repo/")
        maven(url = "https://jitpack.io")
        // AppLovin - using Maven Central when available
        maven(url = "https://artifactory.applovin.com/artifactory/")
        // Fyber/Inneractive
        maven(url = "https://android-sdk.is.com/")
        // Singular
        maven(url = "https://mvn.singular.net/adk")
        // AppsFlyer
        maven(url = "https://maven.appsflyer.com/android")
        // DigitalTurbine
        maven(url = "https://digitalturbine.jfrog.io/artifactory/")
    }
}

rootProject.name = "Earnings"
include(":app")
