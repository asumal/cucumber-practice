package ca.asumal.prototype.app.step;

import ca.asumal.prototype.app.Customer;
import ca.asumal.prototype.app.Item;
import ca.asumal.prototype.app.bean.World;
import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class GoodStep {

    private final World world;

    @Autowired
    public GoodStep(World world) {
        this.world = world;
    }


    @Given("that <name> bought a faulty <item> for <price>")
    public void thatNameBoughtAFaultyItemForPrice(String name, String itemType, int price) {
        world.setCustomer(new Customer(name));
        world.setItem(new Item(itemType, price));
    }
}
