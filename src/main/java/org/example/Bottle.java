package org.example;

public class Bottle {
    private int volumeOfBottle;
    private int volumeOfWaterInTheBottle;

    public Bottle(int volumeOfBottle) {
        this.volumeOfBottle = volumeOfBottle;
    }

    public void setVolumeOfWaterInTheBottle(int volumeOfWaterInTheBottle) {
        this.volumeOfWaterInTheBottle = volumeOfWaterInTheBottle;
    }

    public int getVolumeOfBottle() {
        return volumeOfBottle;
    }

    public int getVolumeOfWaterInTheBottle() {
        return volumeOfWaterInTheBottle;
    }

    public String toString() {
        return "Volume of water in the bottle: " + volumeOfWaterInTheBottle + " L" +
                ", Volume of bottle: " + volumeOfBottle + " L";
    }

    public void addWater(int volumeOfWater) {
        volumeOfWaterInTheBottle += volumeOfWater;
    }

    public void subsWater(int volumeOfWater) {
        volumeOfWaterInTheBottle -= volumeOfWater;
    }

    public void transferFromOneBottleToAnotherBottle(int volumeOfWater, Bottle bottle1, Bottle bottle2) {
        if(volumeOfWater <= bottle1.getVolumeOfBottle() - bottle1.getVolumeOfWaterInTheBottle()  && volumeOfWater <= bottle2.getVolumeOfWaterInTheBottle()) {
            bottle1.addWater(volumeOfWater);
            bottle2.subsWater(volumeOfWater);
        } else {
            System.out.println("Warning! Bottle 1 is full or not enough water int the bottle 2");
        }



    }




}

//        if(volumeOfWater <= bottle1.getVolumeOfWaterInTheBottle() - bottle1.getVolumeOfBottle() && volumeOfWater <= bottle2.getVolumeOfWaterInTheBottle()) {
//                bottle1.addWater(volumeOfWater);
//                bottle2.subsWater(volumeOfWater);
//                } else {
//                System.out.println("Warning! Bottle 1 is full or not enough water int the bottle 2");
//                }
