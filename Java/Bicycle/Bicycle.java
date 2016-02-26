public class Bicycle{

	private int gear;
	private int speed;
	private int id;
	private static int numBicycles=0;
	//constructor
	public Bicycle(){
		this(0,0);
		id = ++numBicycles;
	}

	public Bicycle(int initialGear, int initialSpeed){
		gear = initialGear;
		speed = initialSpeed;


		id = ++numBicycles;
	}

	public int getId(){
		return id;
	}
	public int getGear(){
		return gear;
	}
	public int getSpeed(){
		return speed;
	}
	public String toString(){
		return "Number of bicycles instantiated: "+getId();
			//+"\n"+"Gear: "+getGear()+"\n"+"Speed: "+getSpeed();  **Decided to remove this as didnt think it was relevant and it was just messy
			                                                       //kept the counter of instances in here though
	}
}
