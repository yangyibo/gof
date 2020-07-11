package org.yyb.builder.house;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasics() {
        System.out.println("高楼打地基100米");
        house.setBasics("高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙20cm");
        house.setWall("高楼砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼的透明屋顶");
        house.setRoofed("高楼的透明屋顶");
    }
}
