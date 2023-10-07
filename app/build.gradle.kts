/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("io.github.maiconfz.java_solid_design_principles.java-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("io.github.maiconfz.java_solid_design_principles.app.App")
}