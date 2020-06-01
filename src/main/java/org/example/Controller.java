package org.example;

import java.util.Scanner;

public class Controller extends Bottle {

    Scanner in = new Scanner(System.in);
    Bottle[] bottle = new Bottle[3];

    public Controller() {
    }

    public void controller() {
        while (true) {
            System.out.println("__________________________________________MENU___________________________________________\n" +
                    "|\t   sv - set bottles volume | pw - pour water from one bottle to second bottle   \t|\n" +
                    "| a1 - add water to bottle 1 | a2 - add water to bottle 2 | a3 - add water to bottle 3  |\n" +
                    "|\t                  gv - get actual volume of water in the bottles                 \t|\n" +
                    "|_______________________________________________________________________________________|");
            System.out.print("input >>");
            String act = in.next();
            switch (act) {
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
                case "pw": {
                    System.out.println("how much do you want to pour:");
                    int volumeOfWater = in.nextInt();
                    System.out.println("what do you want to do?\n12 - from 1 to 2, 13 - from 1 to 3,\n" +
                            "21 - from 2 to 1, 23 - from 2 to 3,\n" +
                            "31 - from 3 to 1, 32 - from 3 to 2:");
                    int choose = in.nextInt();
                    switch (choose) {
                        case 12: {
                            transferFromOneBottleToAnotherBottle(volumeOfWater, bottle[1], bottle[0]);
                            controller();
                            return;
                        }
                        case 13: {
                            transferFromOneBottleToAnotherBottle(volumeOfWater, bottle[2], bottle[0]);
                            controller();
                            return;
                        }
                        case 21: {
                            transferFromOneBottleToAnotherBottle(volumeOfWater, bottle[0], bottle[1]);
                            controller();
                            return;
                        }
                        case 23: {
                            transferFromOneBottleToAnotherBottle(volumeOfWater, bottle[2], bottle[1]);
                            controller();
                            return;
                        }
                        case 31: {
                            transferFromOneBottleToAnotherBottle(volumeOfWater, bottle[0], bottle[2]);
                            controller();
                            return;
                        }
                        case 32: {
                            transferFromOneBottleToAnotherBottle(volumeOfWater, bottle[1], bottle[2]);
                            controller();
                            return;
                        }
                    }
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
}
