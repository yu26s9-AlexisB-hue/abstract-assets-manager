package com.pluralsight;

import static java.lang.Math.round;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description,
                 String dateAcquired,
                 double originalCost,
                 String address,
                 int condition,
                 int squareFoot,
                 int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        //todo: we need to compute the current value of the house which depends on the details of this house

        double pricePerSquartFoot = 0;

        if (condition == 1){
            pricePerSquartFoot = 180;
        } else if (condition == 2){
            pricePerSquartFoot = 130;
        }else if (condition == 3){
            pricePerSquartFoot = 90;
        }else if (condition > 4){
            System.out.println("Invalid entry");
        }else{
            pricePerSquartFoot = 80;
        }
        double houseValue = (pricePerSquartFoot * squareFoot) + (0.25 * lotSize);

        return houseValue;
    }
}
