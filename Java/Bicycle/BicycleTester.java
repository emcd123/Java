import java.util.Scanner;
public class BicycleTester{
	public static void main(String[] args){
		Scanner user_input = new Scanner(System.in);
		int numBikes;
		System.out.println("Number of bike wanted instantiated: ");
		numBikes=user_input.nextInt();
		
		int initialGear;
		System.out.println("gear: ");
		initialGear=user_input.nextInt();
			
		int initialSpeed;
		System.out.println("Speed: ");
		initialSpeed=user_input.nextInt();
		
		Bicycle[] array = new Bicycle[numBikes];
		
		for(int i=0; i<numBikes; i++){	
			array[i] = new Bicycle(initialGear, initialSpeed);
		}
		for(int i=0; i<numBikes; i++){
			System.out.println(array[i].toString());			
		}
	//one way to remove the reference is to equal the object reference to null
	//signalling the garbage collection can clean it
		//for(int i=0; i< numBikes;i++){
		//	array[i]=null;
		//}	
	//another way is to explicity invoke the java garbage collection,but this will remove the reference for the whole program
	//not just an individual object
		//System.gc();
	//however these just hint to the garbage collection that these objects should be removed but they wont nessecarily be cleaned
	//The third way that I can find is to allow the Garbage collector to remove the object when It becomes unreachable.
	//That is the only real way to get rid of an objects reference
	}
}
