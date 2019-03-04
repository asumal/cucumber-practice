package ca.asumal.prototype.cucumberpractice.app;

public class Item {
    private final String itemName;

    private final Integer price;


    public Item(String itemName, Integer price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public Integer getPrice() {
        return price;
    }
}
