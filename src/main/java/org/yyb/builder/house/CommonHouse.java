package org.yyb.builder.house;

public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasics() {
        System.out.println("普通房子打地基5米");
        house.setBasics("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10cm");
        house.setWall("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
        house.setRoofed("普通房子屋顶");
    }
}
