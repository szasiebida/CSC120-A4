public class Engine {

    //attributes of the engine 
    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    //constructor 
    /**
     * constructor for the engine class
     * @param fuelType the type of fuel the engine has
     * @param maxFuelLevel the maximum fuel that the engine can take
     */
    public Engine(FuelType fuelType,double maxFuelLevel){
        this.fuelType=fuelType;
        this.currentFuelLevel=maxFuelLevel;
        this.maxFuelLevel=maxFuelLevel;
    }

    //getters 
    /**
     * getter that returns the fuel type because it's private
     * @return fuelType the type of fuel the engine takes
     */
    public FuelType getfuelType(){
        return this.fuelType;
    }

    /**
     * getter that returns the current fuel level because it's private
     * @return currentFuelLevel the amount of fuel in the engine
     */
    public double getcurrentFuelLevel(){
        return this.currentFuelLevel;
    }

    /**
     * getter that returns the maximum fuel level because it's private
     * @return getmaxFuelLevel the amount of fuel in the engine
     */
    public double getmaxFuelLevel(){
        return this.maxFuelLevel;
    }

    //methods 
    /**
     * function that refuels the engine by setting the current fuel level equal to the maximum
     * @param currentFuelLevel the amount of fuel currently in the engine 
     */
    public void refuel(double currentFuelLevel){
        currentFuelLevel=maxFuelLevel;
    }

    /**
     * function that makes the train go by depleting the current fuel level
     * @return boolean true if the fuel level is greater than 0 and false if it is less than 0 
     */
    public boolean go(){
        if (currentFuelLevel>25){
            currentFuelLevel=currentFuelLevel-25;
            System.out.println("you have"+ currentFuelLevel+ "gallons of fuel left");
        } else{
            System.out.println("there is not enough fuel");
        }
        if (currentFuelLevel>0){
            return true;
        } else{
            return false;
        }
    }

}
// public static void main(String[] args) {
//     Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
//     while (myEngine.go()) {
//         System.out.println("Choo choo!");
//     }
//     System.out.println("Out of fuel.");
// }
