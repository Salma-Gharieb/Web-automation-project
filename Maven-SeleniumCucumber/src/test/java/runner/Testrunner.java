package runner;

import StepDefinition.Hook;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue = "StepDefinition",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/Testreport.html",
                "json:target/cucumber/cucumber.json"
        }
)
public class Testrunner extends AbstractTestNGCucumberTests {
}
