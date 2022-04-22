plugins {
    kotlin("jvm") version "1.6.20"
    id("org.jetbrains.kotlinx.kover") version "0.5.0"
}

repositories {
    mavenCentral()
}

kover {
    runAllTestsForProjectTask = true
}

tasks.koverVerify {
    // No rules added
}
