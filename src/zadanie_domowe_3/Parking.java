package zadanie_domowe_3;

public class Parking {
    boolean isFree = true;
    int placeIndex = 0;
    int maxAvailablePlace;
    String factoryName;
    Car[] parking;

    public Parking(int maxAvailablePlace, String factoryName) {
        this.maxAvailablePlace = maxAvailablePlace;
        this.factoryName = factoryName;
        this.parking = new Car[this.maxAvailablePlace];
    }

    void appendCar(Car car){
        if (placeIndex < this.maxAvailablePlace){
            parking[placeIndex] = car;
            placeIndex++;
        } else {
            isFree = false;
        }
    }

    void availableParkingPlce(){
        System.out.println("Available parking place " + parking.length + " in " + factoryName);
    }
}
