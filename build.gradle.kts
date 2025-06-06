// build.gradle.kts (Project level)
plugins {
    kotlin("android") version "1.9.22" apply false
    id("com.android.application") version "8.2.0" apply false
    id("com.android.library") version "8.2.0" apply false
    id("com.google.gms.google-services") version "4.4.0" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
