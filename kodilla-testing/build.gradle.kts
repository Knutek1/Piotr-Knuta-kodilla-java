plugins {
    id("java")
}

group = "com.kodilla"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation ("org.mockito:mockito-junit-jupiter:5.8.0")

}

tasks.test {
    useJUnitPlatform()
}