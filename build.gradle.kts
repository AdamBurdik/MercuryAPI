plugins {
    id("java")
}

group = "me.adamix.mercury.api"
version = "0.1.5"

repositories {
    mavenCentral()
    maven {
        name = "papermc"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
    maven { url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/") }
    maven { url = uri("https://repo.dmulloy2.net/repository/public/") }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.4-R0.1-SNAPSHOT")
    implementation("org.jetbrains:annotations:26.0.2")
    implementation("org.dizitart:nitrite")
    implementation(platform("org.dizitart:nitrite-bom:4.3.0"))
    compileOnly("com.comphenix.protocol:ProtocolLib:5.3.0")
}