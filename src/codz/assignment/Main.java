package codz.assignment;

import codz.assignment.decorators.Beef;
import codz.assignment.decorators.Pepperoni;
import codz.assignment.decorators.ToppingsDecorator;
import codz.assignment.enums.ESize;
import codz.assignment.models.Pizza;
import codz.assignment.models.SimplePizza;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        Pizza[] pizzas = new Pizza[3];

        Pizza pizza = new SimplePizza(ESize.S);

        pizza = new Pepperoni(pizza);
        pizza = new Beef(pizza);
        System.out.println(pizza);
        pizzas[0] = pizza;

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("A.txt"));
        out.writeObject(pizza);
        out.close();
    }
}
