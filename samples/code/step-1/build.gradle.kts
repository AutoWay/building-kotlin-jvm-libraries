// tag::apply-kotlin-plugin[]

// tag::apply-build-scan-plugin[]
plugins {
// end::apply-kotlin-plugin[]
    `build-scan`
// tag::apply-kotlin-plugin[]
    kotlin("jvm", "1.1.4-3") // <1>
}
// end::apply-kotlin-plugin[]
// end::apply-build-scan-plugin[]

// tag::configure-dependencies[]
repositories {
    jcenter() // <2>
}

dependencies {
    implementation(kotlin("stdlib", "1.1.4-3")) // <3>
}
// end::configure-dependencies[]

// tag::configure-build-scan[]
buildScan {
    setLicenseAgreementUrl("https://gradle.com/terms-of-service") // <1>
    setLicenseAgree("yes")

    publishAlways() // <2>
}
// end::configure-build-scan[]
