import java.util.ArrayList;

import javax.print.attribute.standard.MediaSize.Engineering;

public class Train {

    //atributes 
    private Engine engine;
    ArrayList<Car> cars;
    // FuelType fuelType;
    // double fuelCapacity;
    // private int passengerCapacity;

    //constructor 
    public Train(FuelType fuelType, double fuelCapacity,int nCars, int passengerCapacity, Engine engine){
        
        this.engine=engine;

        // this.fuelCapacity=fuelCapacity;
        // this.passengerCapacity=Car.getCapacity();

    }

    //getters and methods

    public Engine getEngine() {
        return this.engine;
    }

    public Car getCar(int i) {
        return this.cars.get(i);
    }

    public int getMaxCapacity() {
        return this.passengerCapacity;
    }
    public int seatsRemaining() {
        int Max=getMaxCapacity();
        int 
    }
    
    public static void printManifest(){

    }

}
