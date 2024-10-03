import java.util.ArrayList;

public class Car {

    //attributes
    private ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;

    //constructor
    public Car(int maxCapacity){
        this.passengersOnboard=new ArrayList<Passenger>();
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

    public ArrayList<Passenger> addPassenger(Passenger newPassenger){
        this.passengersOnboard.add(newPassenger);
        return passengersOnboard;
    }

    public ArrayList<Passenger> removePassenger(Passenger oldPassenger){
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