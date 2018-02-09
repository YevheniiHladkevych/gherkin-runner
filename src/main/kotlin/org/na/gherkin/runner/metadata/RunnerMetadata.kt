package org.na.gherkin.runner.metadata


data class RunnerMetadata @JvmOverloads constructor(
    var suiteName: String = "GherkinRunner Tests",
    var environment: TestEnvironment? = null)
