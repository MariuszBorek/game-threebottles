package org.example;

import java.util.Scanner;

public class Action {


    Scanner in = new Scanner(System.in);
    Bottle[] bottle = new Bottle[3];

    public void controller() {
        while(true){
            System.out.println("MENU");
            String act = in.next();
            switch(act) {
                case "sv": {
                    System.out.println("set volume of bottle 1:");
                    bottle[0] = new Bottle(in.nextInt());
                    System.out.println("set volume of bottle 2:");
                    bottle[1] = new Bottle(in.nextInt());
                    System.out.println("set volume of bottle 3:");
                    bottle[2] = new Bottle(in.nextInt());
                    controller();
                    return;
                }
                case "a1": {
                    System.out.println("add water to bottle 1:");
                    bottle[0].addWater(in.nextInt());
                    controller();
                    return;
                }
                case "a2": {
                    System.out.println("add water to bottle 2:");
                    bottle[1].addWater(in.nextInt());
                    controller();
                    return;
                }
                case "a3": {
                    System.out.println("add water to bottle 3:");
                    bottle[2].addWater(in.nextInt());
                    controller();
                    return;
                }
                case "gv": {
                    System.out.println(bottle[0].toString() + "\n" +
                            bottle[1].toString() + "\n" +
                            bottle[2].toString());
                    controller();
                    return;
                }
                default: {
                    System.out.println("Wrong character");
                    controller();
                    return;
                }

            }

        }

    }







//
//
//    bottle[0].transferFromOneBottleToAnotherBottle(5, bottle[1], bottle[2]);
//
//
//


}
