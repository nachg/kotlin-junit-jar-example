plugins {
    kotlin("jvm") version "1.9.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testImplementation("org.junit.platform:junit-platform-console-standalone:1.10.1")
}

tasks.test {
    useJUnitPlatform()
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