package test.component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import test.impl.Dessert;
@Component
@Qualifier("cold")
public class Cookies implements Dessert {

    public void eat()
    {
        System.out.println("Cookies Eat");
    }
}
