package org.yyb.decorator.mycoffee;

import org.yyb.decorator.Drink;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
