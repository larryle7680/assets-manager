package com.pluralsight;

public class Asset {

    //Attributes of Assets
    private String description;
    private String dateAcquired;
    private double originalCost;

    //Constructor
    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }


    //Getters


    public double getOriginalCost() {
        return originalCost;
    }

    //Method inside of Asset
    public double getValue(){
        return originalCost;
    }
}
