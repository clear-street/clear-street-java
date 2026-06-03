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
        description.set("A unified, secure, and high-performance RESTful API for all client interactions\nwith the Active trading platform. This specification provides a single source of\ntruth for the API surface, abstracting the complexity of downstream services\nlike the Order and Execution Management System (OEMS).\n\n### Authentication\n\nAll endpoints require authentication via a JWT Bearer token provided in the\n`Authorization` header.\n\n### Response Structure\n\nAll responses, both for success and error, adhere to a standard envelope\nstructure:\n\n- `data`: Contains the response payload on success, or `null` on error.\n- `error`: Contains a structured error object on failure, or `null` on success.\n- `metadata`: Contains the `request_id` and pagination information.\n\n### WebSockets\n\nReal-time market data is available via WebSocket connections, which are not\nformally described in this OpenAPI specification. The following operations are\navailable:\n\n- `market-data-l1-subscribe`: To start receiving L1 market data updates for a\n  set of symbols.\n- `market-data-l1-unsubscribe`: To stop receiving L1 market data updates.")
        url.set("https://www.github.com/clear-street/clear-street-java")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Clear Street")
                email.set("support@clearstreet.io")
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
