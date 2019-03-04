package ca.asumal.prototype.cucumberpractice.test.step;

import ca.asumal.prototype.cucumberpractice.test.World;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.springframework.beans.factory.annotation.Autowired;

public class RefundItemsStep {

    private final World world;

    @Autowired
    public RefundItemsStep(World world) {
        this.world = world;
    }


    @When("^she return the kettle to the store$")
    public void return_the_an_item_to_the_store(String item) {
        world.getCustomer()
                .refund(world.getItem()
                        .getPrice());
    }

    @When("she return the <item> to the thing")
    public void sheReturnTheItemToTheThing(String item) {
        world.getCustomer()
                .refund(world.getItem()
                        .getPrice());
    }

    @Then("she will get <price> refffuundd")
    public void sheWillGetPriceRefffuundd(int expected) {
        MatcherAssert.assertThat(world.getCustomer().getRefunded(), CoreMatchers.is(expected));
    }
}
