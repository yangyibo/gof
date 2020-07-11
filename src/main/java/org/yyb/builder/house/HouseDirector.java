package org.yyb.builder.house;

public class HouseDirector {
    public HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildBasics();
        houseBuilder.buildWalls();
        houseBuilder.roofed();

        return houseBuilder.buildHouse();
    }
}
