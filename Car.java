import java.util.ArrayList;

public class Car {

    //attributes
    ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;

    //constructor
    public Car(ArrayList<Passenger> passengersOnboard, int maxCapacity){
        this.passengersOnboard=passengersOnboard;
        this.maxCapacity=maxCapacity;
    }

    //getters 
    public int getCapacity(){
        return this.maxCapacity;
    }

    //methods and such 
    public int seatsRemaining(){
        int seatsTaken=passengersOnboard.size();
        int seatsLeft=maxCapacity-seatsTaken;
        return seatsLeft;
    }

    public ArrayList<Passenger> addPassenger(ArrayList<Passenger> passengersOnboard, Passenger newPassenger){
        passengersOnboard.add(newPassenger);
        return passengersOnboard;
    }

    public ArrayList<Passenger> removePassenger(ArrayList<Passenger> passengersOnboard, Passenger oldPassenger){
        passengersOnboard.remove(oldPassenger);
        return passengersOnboard;
    }

    public void manifest(ArrayList<Passenger> passengersOnboard){
        int number=passengersOnboard.size();
        for (int i=0;i<number;i++){
            System.out.println(passengersOnboard.get(i));
        }
    }

}