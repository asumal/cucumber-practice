package ca.asumal.prototype.cucumberpractice.app;

public class Customer {
    private final String name;
    private Integer refund;

    public Customer(String name) {
        this.name = name;
        refund = 0;
    }

    public String getName() {
        return name;
    }

    public void refund(Integer price) {
        refund += price;
    }

    public Integer getRefunded() {
        Integer result = refund;
        refund = 0;

        return result;
    }
}
