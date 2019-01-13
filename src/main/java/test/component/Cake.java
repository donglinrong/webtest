package test.component;

import org.springframework.stereotype.Component;
import test.impl.Dessert;

@Component
public class Cake implements Dessert {

    public void eat()
    {
        System.out.println("Cake Eat");
    }
}
