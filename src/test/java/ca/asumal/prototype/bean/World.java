package ca.asumal.prototype.bean;

import ca.asumal.prototype.Customer;
import ca.asumal.prototype.Item;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class World {

    private Customer customer;
    private Item item;


    public Customer getCustomer() {
        return customer;
    }

    public Item getItem() {
        return item;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
