package Car;

import CarInterface.ISomeTruck;

public class Truck extends Car implements ISomeTruck {

    private int idn;
    private double price;
    private double maxSpeed;
    private double fuelCons;
    private double loadCapacity;

    public Truck(int idn, double price, double maxSpeed, double fuelCons, double loadCapacity){
        super(idn, price, maxSpeed,fuelCons);
        this.loadCapacity=loadCapacity;
    }


    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}

