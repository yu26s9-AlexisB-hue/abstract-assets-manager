package com.pluralsight;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        //todo compute the current value of the vehicle based on the detailes of the vehicle class

        double decrease;

        //according to google this is the average price of a new car.
        double averageCarPrice = 48841;

        if (year >= 2023){
            decrease = averageCarPrice * .03;
        }else if(year >= 2020){
            decrease = averageCarPrice * .06;
        }else if (year >= 2016){
            decrease = averageCarPrice * .08;
        }else{
            decrease = 1000;
        }

        double finalValue = averageCarPrice - decrease;

        if (odometer > 100000) {
            if (!(makeModel.equalsIgnoreCase("Honda") || makeModel.equalsIgnoreCase("Toyota"))) {
                finalValue -= finalValue * 0.25;
            }
        }
        return finalValue;
    }
}
