import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.71"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
    testImplementation("org.hamcrest:hamcrest:2.2")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "13"
    }

    test {
        useJUnitPlatform()
    }
}
