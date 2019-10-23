package codz.assignment.decorators;
import codz.assignment.models.Pizza;

public class Beef extends ToppingsDecorator{
    private static final long serialVersionUID = 1L;
    Pizza pizza;

    public Beef(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 800;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , Beef(Meat Opt)";
    }
}