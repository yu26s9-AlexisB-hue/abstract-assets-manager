package com.pluralsight;

public class Cash extends Asset {
    private boolean isUnderMattress;
    private double cashValue;

    public Cash(String description, String dateAcquired, double originalCost, boolean isUnderMattress, double cashValue) {
        super(description, dateAcquired, originalCost);
        this.isUnderMattress = isUnderMattress;
        this.cashValue = cashValue;
    }

    public boolean isUnderMattress() {
        return isUnderMattress;
    }

    public void setUnderMattress(boolean underMattress) {
        isUnderMattress = underMattress;
    }

    public double getCashValue() {
        return cashValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    @Override
    public double getValue(){
        return getOriginalCost();
    }
}
