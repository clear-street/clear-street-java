import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

publishing {
  repositories {
      if (project.hasProperty("publishLocal")) {
          maven {
              name = "LocalFileSystem"
              url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
          }
      }
  }
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    if (!project.hasProperty("publishLocal")) {
        signAllPublications()
        publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    }

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaJavadoc"),
            sourcesJar = true,
        )
    )

    pom {
        name.set("Clear Street Trading API")
        description.set("A unified, secure, and high-performance RESTful API for all client interactions\nwith the Active trading platform. This specification provides a single source of\ntruth for the API surface, covering order management, trade execution, market\ndata, and account services.\n\n### Authentication\n\nAll endpoints require authentication via a JWT Bearer token provided in the\n`Authorization` header.\n\n### Response Structure\n\nAll responses, both for success and error, adhere to a standard envelope\nstructure:\n\n- `data`: Contains the response payload on success, or `null` on error.\n- `error`: Contains a structured error object on failure, or `null` on success.\n- `metadata`: Contains the `request_id` and pagination information.")
        url.set("https://www.github.com/clear-street/clear-street-java")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Clear Street")
                email.set("concierge@clearstreet.com")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/clear-street/clear-street-java.git")
            developerConnection.set("scm:git:git://github.com/clear-street/clear-street-java.git")
            url.set("https://github.com/clear-street/clear-street-java")
        }
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
