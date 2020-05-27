package org.example;

public class App {
    public static void main(String[] args ) {

        Bottle[] bottle = new Bottle[3];

        bottle[0] = new Bottle(5);
        bottle[1] = new Bottle(15);
        bottle[2] = new Bottle(20);

        bottle[0].addWater(3);
        bottle[1].addWater(10);
        bottle[2].addWater(2);


        bottle[0].transferFromOneBottleToAnotherBottle(5, bottle[1], bottle[2]);



        System.out.println(bottle[0].toString() + "\n" +
                bottle[1].toString() + "\n" +
                bottle[2].toString());









    }
}
