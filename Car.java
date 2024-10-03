import java.util.ArrayList;

public class Car {

    //attributes
    private ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;

    //constructor
    public Car(int maxCapacity){
        this.maxCapacity=maxCapacity;
        this.passengersOnboard=new ArrayList<Passenger>(maxCapacity);
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

    public boolean addPassenger(Passenger newPassenger){
        if (seatsRemaining()>0){
            passengersOnboard.add(newPassenger);
            return true;
        } else {
            return false;
        }
    }

    public boolean removePassenger(Passenger oldPassenger){
        if (passengersOnboard.contains(oldPassenger)){
            passengersOnboard.remove(oldPassenger);
            return true;
        } else {
            return false;
        }
    }

    public void manifest(){
        int number=passengersOnboard.size();
        if (number>0){
            for (int i=0;i<number;i++){
                System.out.println(passengersOnboard.get(i));
            } 
        } else {
            System.out.println("there's no one on board");
        }
    }
}