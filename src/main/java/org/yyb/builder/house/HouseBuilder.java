package org.yyb.builder.house;

public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasics();
    public abstract void buildWalls();
    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
