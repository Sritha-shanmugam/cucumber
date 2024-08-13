package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:/Assessment/PracticeAutomationTesting/src/main/features/Shop.feature",glue = "StepDefinitions")
public class TestRunner {
}
