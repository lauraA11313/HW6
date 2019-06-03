package TaxiPark;

import Car.*;

public class TaxiPark {
    private Car[] cars;
    public TaxiPark(Car[] cars) {
        this.cars = cars;
    }

    public double totalCost(){
        double sum=0;

        for(int i=0;i<cars.length;i++){
            sum+=cars[i].getPrice();
        }

        return sum;
    }

    public int totalNumberOfCars(){
        return cars.length;
    }

    public void sortByFuelConsumption (){
        boolean isSorted = false;
        double temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < cars.length-1; i++) {
                if(cars[i].getFuelCons() > cars[i+1].getFuelCons()){
                    isSorted = false;

                    temp = cars[i].getFuelCons();
                    cars[i].setFuelCons(cars[i+1].getFuelCons());
                    cars[i+1].setFuelCons(temp);
                }
            }
        }
    }



    public Car [] speedRange (double maxSpeed, double minSpeed){
        Car [] speedCarArr = new Car[0];
        for(int i=0;i<cars.length;i++) {
            if (minSpeed < cars[i].getMaxSpeed() && cars[i].getMaxSpeed() < maxSpeed) {
                speedCarArr = extendCarsArrayByNewCar(cars[i], speedCarArr);
            }
        }
        return speedCarArr;
    }

    private Car[] extendCarsArrayByNewCar(Car carToAdd, Car[] speedCarArr) {
        if (speedCarArr.length == 0) {
            return new Car[] { carToAdd };
        }
        else {
            Car[] newCarArr = new Car[speedCarArr.length + 1];
            for (int k = 0; k < speedCarArr.length; k++) {
                speedCarArr[k] = speedCarArr[k];
            }
            newCarArr[speedCarArr.length] = carToAdd;
            return newCarArr;
        }
    }



    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public String toString() {
        String result = "";

        for (Car car : cars) {
            result += (car.toString() + "\n");
        }

        return result;
    }
}
