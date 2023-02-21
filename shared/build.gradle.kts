plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.kodein.mock.mockmp")
}

kotlin {
    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    //    jvm() uncomment to make ./gradlew testReleaseUnitTest work

    sourceSets["commonTest"].dependencies {
        implementation(kotlin("test"))
    }
}

mockmp {
    usesHelper = true
}

android {
    namespace = "org.kodein.testmockmp"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
}