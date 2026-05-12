package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset{
    //Attributes
    private String makeModel;
    private int year;
    private int odometer;



    //Constructors
    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }





    //Setters/Getters

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
        LocalDate localDate = LocalDate.now();
        int currentYear = localDate.getYear();
        int ageOfCar = currentYear - this.year;
        double value = 0;
        if(ageOfCar <= 3){
            value = this.getOriginalCost() - (.03 * this.getOriginalCost() * ageOfCar);
        }else if(ageOfCar <= 6){
            value = this.getOriginalCost() - (.06 * this.getOriginalCost() * ageOfCar);
        }else if (ageOfCar < 10){
            value = this.getOriginalCost() - (.08 * this.getOriginalCost() * ageOfCar);
        }else if (ageOfCar >= 10){
            return value = 1000;
        }

        //If the odometer is over a 100000, then reduce the value by another 25 percent.
        if (this.odometer > 100000){
            value = this.getOriginalCost() - (.25 * this.getOriginalCost());
        }
        return value;
    }
}
