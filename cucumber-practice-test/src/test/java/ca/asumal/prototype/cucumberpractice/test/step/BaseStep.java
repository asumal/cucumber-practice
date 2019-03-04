package ca.asumal.prototype.cucumberpractice.test.step;

import ca.asumal.prototype.cucumberpractice.test.TestConfig;
import cucumber.api.java.en.Given;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestConfig.class)
public class BaseStep {

    @Given("Setup Dependency Injection")
    public void setupDependencyInjection() {

    }
}
