import java.lang.Runtime.getRuntime

plugins {
	id("org.jetbrains.kotlin.jvm") version "1.6.21"
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