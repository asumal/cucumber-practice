package ca.asumal.prototype.cucumberpractice.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "feature",
        glue = "ca.asumal.prototype.cucumberpractice.test.step")
public class RunCucumberTest {

}
