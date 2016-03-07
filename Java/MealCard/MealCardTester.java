import java.util.Scanner;
import java.util.ArrayList;

public class MealCardTester{
	public static void main(String[] args){
		Scanner user_input = new Scanner(System.in);

		int numCustomers;
		System.out.println("Enter number of customers:");
		numCustomers = user_input.nextInt();

		ArrayList meal_card = new ArrayList();
		for(int i=0; i<numCustomers; i++){
			int age;
			System.out.println("Age: ");
			user_input.nextInt();

			String name;
			System.out.println("Name: ");
			user_input.nextLine();

			String address;
			System.out.println("Address: ");
			user_input.nextLine();
		
			int balance;
			System.out.println("Meal Card Balance: ");
			user_input.nextInt();
		
			Student meals = new MealCard(age,name,address);
			meal_card.add(meals);					
		}
		for(int i=0; i<numCustomers; i++){
			System.out.println(meal_card.get(i).toString());
		}
		String otherServices;
		System.out.println("Would you like to use other services(Buy points or make a purchase, type y or n)");
		user_input.next();

		if (otherServices.equals("y")){
			int whichAccount;
			System.out.println("Which account(Type index entry in the array)");
			user_input.nextInt();
			
			String purchaseOrPoints;
			System.out.println("Type 'w' to make a purchase, 'l' to purchase points");
			user_input.next();
			if(purchaseOrPoints.equals('w')){
				return meals.get(whichAccount).purchaseItem(100);
			}
			else{
				return meals.get(whichAccount).purchasePoints(1000);
			}
		}
		else{
			System.out.println("Finished");
		}	
		

		user_input.close();
	}
}
