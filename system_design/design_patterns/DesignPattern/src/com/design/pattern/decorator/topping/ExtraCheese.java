package com.design.pattern.decorator.topping;

import com.design.pattern.decorator.Pizza;

public class ExtraCheese extends Topping{

    public Pizza basePizza;
    public ExtraCheese(Pizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public float cost() {
        return basePizza.cost() + 10;
    }
}
