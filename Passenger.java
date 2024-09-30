public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    //getter
    public String getname(){
        return this.name;
    }

    //methods 
    public void boardCar(Car car){
        car.addPassenger(this);
    }

    public void getoffCar(Car car){
        car.removePassenger(this);
    }
    
}
