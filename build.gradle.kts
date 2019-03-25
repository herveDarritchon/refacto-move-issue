plugins {
    java
    kotlin("jvm") version "1.3.20"
}

group = "fr.hervedarritchon.opensource"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    compile(kotlin("stdlib"))
    testCompile("junit", "junit", "4.12")
}