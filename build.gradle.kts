import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.2.2"
    id("io.spring.dependency-management") version "1.1.4"
    id("org.jmailen.kotlinter") version "4.2.0"
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.spring") version "1.9.22"
    kotlin("kapt") version "1.9.22"
}

group = "com.kvsinyuk"
version = "0.0.1-SNAPSHOT"

val mapstructVersion = "1.5.3.Final"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    developmentOnly("org.springframework.boot:spring-boot-docker-compose")

    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("io.micrometer:micrometer-registry-prometheus")

    kapt("org.mapstruct:mapstruct-processor:$mapstructVersion")
    implementation("org.mapstruct:mapstruct:$mapstructVersion")

    implementation("org.liquibase:liquibase-core")
    runtimeOnly("org.postgresql:postgresql")

    implementation("com.github.pengrad:java-telegram-bot-api:6.9.1")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
    implementation("io.github.microutils:kotlin-logging-jvm:3.0.5")

    testImplementation("org.testcontainers:testcontainers")
    testImplementation("org.testcontainers:postgresql:1.19.2")
    testImplementation("org.testcontainers:junit-jupiter:1.19.2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
