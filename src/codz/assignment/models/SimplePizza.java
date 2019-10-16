package codz.assignment.models;

import codz.assignment.enums.ESize;

public class SimplePizza extends Pizza {

    public  SimplePizza(ESize size) {
        this.setSize(size);
        this.setDescription(getDescription() + " Simple Pizza");
    }

    @Override
    public String getDescription() {
        return "Simple Pizza; Size: " + getSize().label;
    }

    @Override
    public int getCost() {
        return 500 + this.getSize().price;
    }
}
