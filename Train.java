import java.util.ArrayList;

public class Train {

    //atributes of the train class
    private Engine engine;
    ArrayList<Car> cars;

    //constructor 
    /**
     * constructor for the train class 
     * @param fuelType the type of fuel
     * @param fuelCapacity the maximum fuel the engine can take 
     * @param nCars the number of cars on the train
     * @param passengerCapacity the number of people per car
     */
    public Train(FuelType fuelType, double fuelCapacity,int nCars, int passengerCapacity){
        
        this.engine = new Engine(fuelType,fuelCapacity);
        this.cars= new ArrayList<Car>(nCars);
        for (int i=0; i<nCars; i++){
            cars.add(new Car(passengerCapacity));
        }

    }

    //getters and methods
    /**
     * getter for the engine because it is private 
     * @return engine the engine of the train 
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * function that returns the car at the specified index
     * @param i the index of the car in the list of cars
     * @return a car at the index i that is specifed 
     */
    public Car getCar(int i) {
        return this.cars.get(i);
    }

    /**
     * method that gets the maximum capacity of the train 
     * @return maxCapacity the maximum capacity of the whole train  
     */
    public int getMaxCapacity() {
        int maxCapacity=0;
        for (int i=0;i<cars.size(); i++){
            maxCapacity+=cars.get(i).getCapacity();
        }
        return maxCapacity;
    }

    /**
     * function that gets the seats remaining on the car 
     * @return int the seats remaining on the train 
     */
    public int seatsRemaining() {
        int seatsLeft = 0;
        for (int i=0;i<cars.size(); i++){
            seatsLeft+=cars.get(i).seatsRemaining();
        }
        return seatsLeft;
    }
    
    /**
     * function that prints all of the passengers on the train 
     */
    public void printManifest(){
        for (int i=0;i<cars.size(); i++){
            cars.get(i).manifest();
        } 
    }

    /**
     * main function for testing
     * @param args
     */
    public static void main(String[] args) {
        Train mytrain= new Train(FuelType.ELECTRIC,100,5,10 );
        System.out.println(mytrain.engine);
        System.out.println(mytrain.getMaxCapacity());
        System.out.println(mytrain.seatsRemaining());

    }
}
