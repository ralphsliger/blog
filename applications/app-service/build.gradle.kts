apply(plugin = "org.springframework.boot")

dependencies {
	testImplementation 'com.fasterxml.jackson.core:jackson-databind'
	testImplementation 'com.tngtech.archunit:archunit:1.2.1'
    implementation(project(":model"))
    implementation(project(":usecase"))
    runtimeOnly("org.springframework.boot:spring-boot-devtools")
}

tasks.getByName<Jar>("jar") {
    // To disable the *-plain.jar
    enabled = false
}

tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
    // Sets output jar name
    archiveFileName.set("${project.parent?.name}.${archiveExtension.get()}")}