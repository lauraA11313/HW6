package Car;

import CarInterface.ISomeCar;

public class Car implements ISomeCar {
    private int idn;
    private double price;
    private double maxSpeed;
    private double fuelCons;     //kg/h

    Car (int idn, double price, double maxSpeed, double fuelCons){
        this.idn=idn;
        this.price=price;
        this.maxSpeed=maxSpeed;
        this.fuelCons=fuelCons;
    }

    public int getIdn() {
        return idn;
    }

    public void setIdn(int idn) {
        this.idn = idn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelCons() {
        return fuelCons;
    }

    public void setFuelCons(double fuelCons) {
        this.fuelCons = fuelCons;
    }
}
