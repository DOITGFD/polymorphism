import java.util.Scanner;

abstract class Vehicle{
    double dist;
    double fuelConsumptionRate;
    public abstract double calculateFuelEfficiency();
}

class Car extends Vehicle{
    public Car(double dist, double fuelConsumptionRate){
        this.dist = dist;
        this.fuelConsumptionRate = fuelConsumptionRate;
    }
    public double calculateFuelEfficiency(){
        return dist/fuelConsumptionRate;
    }
}

class Truck extends Vehicle{
    public Truck(double dist, double fuelConsumptionRate){
        this.dist = dist;
        this.fuelConsumptionRate = fuelConsumptionRate;

    }
    public double calculateFuelEfficiency(){
        return dist/fuelConsumptionRate;
    }
}

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double carDistance = input.nextDouble();
       double carFuelRate = input.nextDouble();
       double truckDistance = input.nextDouble();
       double truckFuelRate = input.nextDouble();

       Vehicle[] vehicles = new Vehicle[2];
       vehicles[0] = new Car(carDistance,carFuelRate);
       vehicles[1] = new Truck(truckDistance,truckFuelRate);

       for (Vehicle vehicle : vehicles){
        System.out.println("Fuel efficiency for "+vehicle.getClass().getSimpleName()+": "+vehicle.calculateFuelEfficiency());
       } 
    }
}