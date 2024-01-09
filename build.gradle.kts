plugins {
    kotlin("jvm") version "1.9.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testng:testng:6.14.3")
}

tasks.test {
    useTestNG()
}

tasks.jar {
    from(sourceSets["test"].output)
    from(configurations.testRuntimeClasspath.map { config -> config.map { if (it.isDirectory) it else zipTree(it) } })
    isZip64 = true
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

kotlin {
    jvmToolchain(15)
}