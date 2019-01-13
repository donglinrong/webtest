package test.model;

import org.springframework.beans.factory.annotation.Autowired;
import test.impl.Dessert;

public class Person {

    private Dessert dessert;

    public Dessert getDessert() {
        return dessert;
    }

    @Autowired
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
