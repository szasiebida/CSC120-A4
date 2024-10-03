public class Passenger {
    
    //atributes of the passenger 
    private String name;

    /**
     * constructor for the passenger
     * @param name the name of the passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    //getter
    /**
     * getter for the attribute name 
     * @return name the name of the passenger 
     */
    public String getname(){
        return this.name;
    }

    //methods 
    /**
     * function that adds the passenger to the specified car
     * @param c the car that the passenger is boaring
     */
    public void boardCar(Car c){
        if (c.addPassenger(this)){
            c.addPassenger(this);
        } else {
            System.out.println("passenger cannot be added car is full");
        }
    }

    /**
     * function that removes the passenger from the specified car 
     * @param c the car that the passneger is getting off of 
     */
    public void getoffCar(Car c){
        if (c.removePassenger(this)){
            c.removePassenger(this);
        } else{
            System.out.println("passenger cannot be removed");
        }
    }
    public static void main(String[] args) {
        Passenger myperson= new Passenger("sofia");
        System.out.println(myperson.name);
    }
}
