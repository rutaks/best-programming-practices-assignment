package codz.assignment.decorators;

import codz.assignment.models.Pizza;

public class Mushroom extends ToppingsDecorator{
    private static final long serialVersionUID = 1L;
    Pizza pizza;

    public Mushroom(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 1000;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , Mushroom(Veg Opt)";
    }
}
