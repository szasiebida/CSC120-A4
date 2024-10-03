import java.util.ArrayList;

public class Train {

    //atributes 
    private Engine engine;
    ArrayList<Car> cars;

    //constructor 
    public Train(FuelType fuelType, double fuelCapacity,int nCars, int passengerCapacity){
        
        this.engine = new Engine(fuelType,fuelCapacity);
        this.cars= new ArrayList<Car>(nCars);
        for (int i=0; i<nCars; i++){
            cars.add(new Car(passengerCapacity));
        }

    }

    //getters and methods

    public Engine getEngine() {
        return engine;
    }

    public Car getCar(int i) {
        return this.cars.get(i);
    }

    public int getMaxCapacity() {
        int maxCapacity=0;
        for (int i=0;i<cars.size(); i++){
            maxCapacity+=cars.get(i).getCapacity();
        }
        return maxCapacity;
    }

    public int seatsRemaining() {
        int Max=getMaxCapacity();
        int 
    }
    
    public static void printManifest(){

    }

}
