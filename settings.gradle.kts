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
        maven(url = "https://artifact.bytedance.com/babel/")
        maven(url = "https://developer.huawei.com/repo/")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://artifactory.applovin.com/artifactory/com.applovin/")
        maven(url = "https://android-sdk.is.com/")
        maven(url = "https://repo.adsterra.com/repository/maven-public/")
        maven(url = "https://mvn.singular.net/adk")
        maven(url = "https://maven.appsflyer.com/android")
        maven(url = "https://developer.huawei.com/repo/")
        maven(url = "https://jitpack.io")
    }
}

rootProject.name = "Earnings"
include(":app")
