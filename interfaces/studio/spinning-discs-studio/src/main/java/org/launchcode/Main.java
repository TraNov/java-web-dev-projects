package org.launchcode;

public class Main {

    public static void main(String[] args){

        CD cd = new CD("CD example", 700, "CD-R", 350);
        DVD dvd = new DVD("DVD example", 4700, "DVD-R", 1450);

        Wheel bikeTire = new Wheel(9, "bicycle", "transportation");

        cd.spinDisc();
        dvd.spinDisc();

        System.out.println(cd.writeData(275));
        System.out.println(dvd.writeData(8000));

        System.out.println(cd.diskInfo());
        System.out.println(dvd.diskInfo());

        bikeTire.spinDisc();
        bikeTire.getWheelInfo();


    }
}