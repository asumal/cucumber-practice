package ca.asumal.prototype.step;

import ca.asumal.prototype.bean.World;
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
    public void return_the_an_item_to_the_store() {
        world.getCustomer()
                .refund(world.getItem()
                        .getPrice());
    }

    @Then("^she will get \\$(\\d+) refunded$")
    public void she_will_get_$_back(int expected) {
        MatcherAssert.assertThat(world.getCustomer().getRefunded(), CoreMatchers.is(expected));
    }

    @Then("she will get <price> refunded")
    public void sheWillGetPriceRefunded(int expected) {
        MatcherAssert.assertThat(world.getCustomer().getRefunded(), CoreMatchers.is(expected));
    }
}
