package org.launchcode;

public class Wheel implements SpinningDisc{
    private int diameter;
    private String wheelType;
    private String usage;


    public Wheel(int aDiameter, String aWheelType, String aUsage){
        diameter = aDiameter;
        wheelType = aWheelType;
        usage = aUsage;
    }


    @Override
    public void spinDisc() {
        System.out.println("Wheel can have many different sizes and purposes, therefore can spin at a wide range of speeds.\n");
    }

    public void getWheelInfo(){
        System.out.println("This is a "+wheelType+" wheel. It's diameter measures at "+diameter+
                " in. and is used for "+usage+".");
    }
    //make Wheel abstract and extend it to classes called Bike, Truck, etc.

}