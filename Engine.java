public class Engine {

    //attributes
    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    //constructor 
    public Engine(FuelType fuelType,double maxFuelLevel){
        this.fuelType=fuelType;
        this.currentFuelLevel=maxFuelLevel;
        this.maxFuelLevel=maxFuelLevel;
    }

    //getters 
    public FuelType getfuelType(){
        return this.fuelType;
    }

    public double getcurrentFuelLevel(){
        return this.currentFuelLevel;
    }

    public double getmaxFuelLevel(){
        return this.maxFuelLevel;
    }

    //methods 
    public void refuel(double currentFuelLevel){
        currentFuelLevel=maxFuelLevel;
    }

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
