package classvars;

public class Bicycle {
    
    private int cadence;
    private int gear;
    private int speed;
    private int id;
    // 'static' keyword creates a class variable; in this case, the numberOfBicycles value increments every time a bicycle object is created
    // and then stores the value as the bike's id.
    private static int numberOfBicycles = 0;
        
    public Bicycle(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        // increment number of Bicycles
        // and assign ID number
        id = ++numberOfBicycles;
    }

    // new method to return the ID instance variable
    public int getID() {
        return id;
    }
    
    public static void main(String[] args) {
    	
    	System.out.println("Number of bicycles: " + Bicycle.numberOfBicycles);
    	
    	Bicycle myBike01 = new Bicycle(10, 5, 10);
		Bicycle myBike02 = new Bicycle(9, 16, 14);
		Bicycle myBike03 = new Bicycle(7, 13, 14);
		
		System.out.println("myBike01 ID: " + myBike01.getID());
		System.out.println("myBike02 ID: " + myBike02.getID());
		System.out.println("myBike03 ID: " + myBike03.getID());
		
		System.out.println("Number of bicycles: " + Bicycle.numberOfBicycles);
	}
}