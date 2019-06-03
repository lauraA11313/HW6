package Car;

import CarInterface.ISomeRefrigeratorCar;
import CarInterface.ISomeTruck;

public class RefrigeratorCar extends Truck implements ISomeRefrigeratorCar {

    private double tempInLoadComp;

    public RefrigeratorCar(int idn, double price, double maxSpeed, double fuelCons, double loadCapacity, double tempInLoadComp) {
        super(idn, price, maxSpeed,fuelCons, loadCapacity);
        this.tempInLoadComp = tempInLoadComp;
    }

    public double getTempInLoadComp () {
        return tempInLoadComp;
    }

    public void setTempInLoadComp ( double tempInLoadComp){
        this.tempInLoadComp = tempInLoadComp;
    }

    public String toString () {
        return String.format(getIdn() + " " + getPrice() + " " + getMaxSpeed() + " " + getFuelCons() + " " + getTempInLoadComp());
    }
}
