package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = "C:/Users/agile/IdeaProjects/APIProjection/Features/API.feature",
        glue = "stepDefinitions"
)
public class TestRunner {


}
