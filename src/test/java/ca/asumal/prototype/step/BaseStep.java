package ca.asumal.prototype.step;

import ca.asumal.prototype.TestConfig;
import cucumber.api.java.en.Given;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestConfig.class)
public class BaseStep {

    @Given("Setup Dependency Injection")
    public void setupDependencyInjection() {

    }
}
