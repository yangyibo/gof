package org.yyb.decorator.mydecorator;

import org.yyb.decorator.Drink;

public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
