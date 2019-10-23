package codz.assignment.decorators;

import codz.assignment.models.Pizza;

public class Pepperoni extends ToppingsDecorator{
    Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 800;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , Pepperoni(Meat Opt)";
    }
}
