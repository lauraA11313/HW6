import Car.Car;

public interface ISomeTaxiPark {

    double totalCost();
    int TotalNumberOfCars();
    void sortByFuelConsumption();


    Car[] speedRange (double maxSpeed, double minSpeed);
    Car[] extendCarsArrayByNewCar(Car carToAdd, Car[] speedCarArr);

    Car[] getCars();
    void setCars(Car[] cars);

}
