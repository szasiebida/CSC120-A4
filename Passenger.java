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
    public void boardCar(Car c){
        if (c.addPassenger(this)){
            c.addPassenger(this);
        } else {
            System.out.println("passenger cannot be added car is full");
        }
    }

    public void getoffCar(Car c){
        if (c.removePassenger(this)){
            c.removePassenger(this);
        } else{
            System.out.println("passenger cannot be removed");
        }
    }
    
}
