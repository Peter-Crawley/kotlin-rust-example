import java.lang.Runtime.getRuntime

plugins {
	id("org.jetbrains.kotlin.jvm") version "1.7.0"
}

repositories {
	mavenCentral()
}

tasks {
	register("compileRust") {
		getRuntime().exec(arrayOf("cargo", "build"))
	}

	classes {
		dependsOn("compileRust")
	}
}