package com.CRM.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/CRM/step_definitions",
        dryRun = false,
        tags = "@US01invalid",
        publish = false

)

public class CukesRunner extends AbstractTestNGCucumberTests {
}
