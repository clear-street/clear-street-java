plugins {
    id("clear-street.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":clear-street-java-core"))
    implementation(project(":clear-street-java-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :clear-street-java-example:run` to run `Main`
    // Use `./gradlew :clear-street-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.clear_street.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
