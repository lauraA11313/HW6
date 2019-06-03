package Car;

public class SportCar extends Car{

    private double weight;
    public SportCar(int idn, double price, double maxSpeed, double fuelCons, double weight){
        super(idn, price, maxSpeed, fuelCons);
        this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }
    public String toString(){
        return String.format(getIdn() +" "+ getPrice() +" "+ getMaxSpeed()+" "+ getFuelCons()+" "+getWeight());
    }
}
