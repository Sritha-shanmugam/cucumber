package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:/Cucumber/demo/src/main/feature",glue = "stepDefinitions")
public class TestRunner {

}
