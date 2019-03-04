package ca.asumal.prototype;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "feature",
        glue = "ca.asumal.prototype.step")
public class RunCucumberTest {

}
