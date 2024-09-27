public class Engine {

    //attributes
    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    //constructor 
    public Engine(FuelType fuelType,double currentFuelLevel){
        this.fuelType=fuelType;
        this.currentFuelLevel=currentFuelLevel;
        this.maxFuelLevel=100;
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

    public void go(double currentFuelLevel){
        if (currentFuelLevel>25){
            currentFuelLevel=currentFuelLevel-25;
        }
        else{
            System.out.println("there is not enough have enough fuel");
        }
        
    }

}

// public static void main(String[] args) {
//     Engine myengine= new Engine(FuelType.STEAM, 50);
//     System.out.println(myengine.getcurrentFuelLevel());
// }
