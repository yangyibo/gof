package org.yyb.builder.house;

public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
        House house = houseDirector.constructHouse();
        System.out.println("result: " + house.getBasics() + " " + house);

        houseDirector.setHouseBuilder(new HighBuilding());
        house = houseDirector.constructHouse();
        System.out.println("result: " + house.getWall() + " " + house);
    }
}
