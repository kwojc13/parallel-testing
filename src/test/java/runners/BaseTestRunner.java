package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber/report.json", "html:target/cucumber/report.html", "rerun:target/failed-rerun.txt"},
        features = "classpath:features",
        glue = {"stepDefinitions"},
        publish = false,
        tags = "@Test")
public class BaseTestRunner {
}