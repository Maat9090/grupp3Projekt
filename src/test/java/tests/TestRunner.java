package tests;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
        },
        features = {"D:/Skolan/AAA-AT/projects/final-projekt/project3/src/test/resources/features/saucedemo/Saucedemo.feature"}
        ,glue={"tests.StepDefinitionsSaucedemo"}

)

public class TestRunner extends AbstractTestNGCucumberTests {

}