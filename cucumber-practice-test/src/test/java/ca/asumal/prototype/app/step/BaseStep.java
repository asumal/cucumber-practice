package ca.asumal.prototype.app.step;

import ca.asumal.prototype.app.TestConfig;
import cucumber.api.java.en.Given;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestConfig.class)
public class BaseStep {

    @Given("Setup Dependency Injection")
    public void setupDependencyInjection() {

    }
}
