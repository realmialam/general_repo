package com.design.pattern.decorator.topping;

import com.design.pattern.decorator.Pizza;

public class Mushroom extends Topping{
    public Pizza basePizza;
    public Mushroom(Pizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public float cost() {
        return basePizza.cost() + 20;
    }
}
