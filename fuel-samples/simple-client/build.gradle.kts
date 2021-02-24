plugins {
    kotlin("kapt")
}

application {
    mainClass.set("fuel.samples.FuelContributorsKt")
}

dependencies {
    kapt(Library.MOSHI_KOTLIN_CODEGEN)

    implementation(project(":fuel-singleton"))
    implementation(project(":fuel-moshi"))
}
