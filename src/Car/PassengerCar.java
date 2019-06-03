package Car;
import CarInterface.ISomePassengerCar;


public class PassengerCar extends Car implements ISomePassengerCar {

    private int idn;
    private double price;
    private double maxSpeed;
    private double fuelCons;
    private int seatsNum;


    public PassengerCar(int idn, double price, double maxSpeed, double fuelCons, int seatsNum){
        super(idn, price, maxSpeed,fuelCons);
        this.seatsNum=seatsNum;
    }

    public int getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(int seatsNum) {
        this.seatsNum = seatsNum;
    }

    public String toString(){
        return String.format(getIdn() +" "+ getPrice() +" "+ getMaxSpeed()+" "+ getFuelCons()+" "+getSeatsNum());
    }
}
