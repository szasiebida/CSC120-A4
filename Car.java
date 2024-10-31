import java.util.ArrayList;

public class Car {

    //attributes
    private ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;

    //constructor
    /**
     * constructor for the car class
     * @param maxCapacity the maximum capacity of the car
     */
    public Car(int maxCapacity){
        this.maxCapacity=maxCapacity;
        this.passengersOnboard=new ArrayList<Passenger>(maxCapacity);
    }

    //getters 
    /**
     * getter for the maximum capacity because it's private 
     * @return maxCapacity the maximum number of people that can be on the car
     */
    public int getCapacity(){
        return this.maxCapacity;
    }

    //methods and such 
    /**
     * function that calculates the seats left based on the maximum capacity and the current number of passengers 
     * @return seatsLeft the number of seats left on the car 
     */
    public int seatsRemaining(){
        int seatsTaken=passengersOnboard.size();
        int seatsLeft=maxCapacity-seatsTaken;
        return seatsLeft;
    }

    /**
     * funtion that adds passengers to the car 
     * @param newPassenger the passenger to be added to the car
     * @return boolean true if the passenger was successfully added and falsi if not 
     */
    public boolean addPassenger(Passenger newPassenger){
        if (seatsRemaining()>0 && !passengersOnboard.contains(newPassenger)){
            passengersOnboard.add(newPassenger);
            return true;
        } else {
            return false;
        }
    }

    /**
     * function to remove the passenger from the car 
     * @param oldPassenger the passenger that will be removed from the car
     * @return boolean true if the passenger was successfully removed and false if it was not
     */
    public boolean removePassenger(Passenger oldPassenger){
        if (passengersOnboard.contains(oldPassenger)){
            passengersOnboard.remove(oldPassenger);
            return true;
        } else {
            return false;
        }
    }

    /**
     * function that prints the names of the passengers in the car 
     */
    public void printManifest(){
        int number=passengersOnboard.size();
        if (number>0){
            for (int i=0;i<number;i++){
                System.out.println(passengersOnboard.get(i).getname());
            } 
        } else {
            System.out.println("This car is EMPTY.");
        }
    }
    
    /**
     * main function for testing 
     * @param args
     */
    public static void main(String[] args) {
        Car mycar=new Car(40);
        System.out.println(mycar.maxCapacity);
        Passenger mypassenger= new Passenger("sofia");
        mycar.addPassenger(mypassenger);
        mycar.printManifest();
    }
}