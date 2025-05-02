# MercuryAPI
**MercuryAPI** is an api for mercury project plugins.

[Core Plugin](https://github.com/AdamBurdik/MercuryCorePlugin) implements main functionality. 

### Plans for the future
- Make api independent from all current dependencies. (paper, nitrite, protocollib)
- Entity api

# Installation
### Gradle (Kotlin DSL)
```kotlin
repositories {
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("com.github.AdamBurdik.MercuryAPI:-SNAPSHOT") // Implements newest commit
}
```

### Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.AdamBurdik</groupId>
        <artifactId>MercuryAPI</artifactId>
        <version>-SNAPSHOT</version>
    </dependency>
</dependencies>
```