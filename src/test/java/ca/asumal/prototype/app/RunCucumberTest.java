package ca.asumal.prototype.app;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "feature",
        glue = "ca.asumal.prototype.step")
public class RunCucumberTest {

}
