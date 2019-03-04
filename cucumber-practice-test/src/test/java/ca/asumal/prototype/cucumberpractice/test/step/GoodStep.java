package ca.asumal.prototype.cucumberpractice.test.step;

import ca.asumal.prototype.cucumberpractice.app.Customer;
import ca.asumal.prototype.cucumberpractice.app.Item;
import ca.asumal.prototype.cucumberpractice.test.World;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class GoodStep {

    private final World world;

    @Autowired
    public GoodStep(World world) {
        this.world = world;
    }


    @Given("I <try> this where <item> for <price>")
    public void iTryThisWhereItemForPrice(String name, String itemType, int price) {
        world.setCustomer(new Customer(name));
        world.setItem(new Item(itemType, price));
    }
}
