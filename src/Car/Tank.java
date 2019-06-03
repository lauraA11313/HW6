package Car;

import Car.Truck;

public class Tank extends Truck {
    private double tankVol;

    public Tank(int idn, double price, double maxSpeed, double fuelCons, double loadCapacity, double tankVol) {
        super(idn, price, maxSpeed, fuelCons, loadCapacity);
        this.tankVol = tankVol;
    }

    public double getTankVol() {
        return tankVol;
    }

    public void setTankVol(double tankVol) {
        this.tankVol = tankVol;
    }

    public String toString() {
        return String.format(getIdn() + " " + getPrice() + " " + getMaxSpeed() + " " + getFuelCons() + " " + getTankVol());
    }
}