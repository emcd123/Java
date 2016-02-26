import java.util.Scanner;
import java.util.ArrayList;

public class SalesTester{
	public static void main(String args[]){
		Scanner user_input = new Scanner(System.in);

		//Create an arrayList to store employee info
		//take number of employees to be inputted, and loop through block
		//Add the employeeobjects to the arrayList
		int numEmployees;
		System.out.println("Enter number of employees to be inputted: ");
		numEmployees = user_input.nextInt();
	
		ArrayList employees = new ArrayList();
		for(int z=0; z<numEmployees; z++){	
			//take in all the variables I need using the scanner class
			int employeeType;
			System.out.println("Sales employee type: Press 1 for salesperson,2 for sales agent");
			employeeType = user_input.nextInt();
		
			int ppsnumber;
			System.out.println("Enter employee ppsnumber: ");
			ppsnumber= user_input.nextInt();	
		
			int sales;
			System.out.println("Enter sales amount: ");
			sales = user_input.nextInt();
			//Decide which employee type we have and create respective object
			if (employeeType == 1){
				SalesEmployee SalesPerson = new SalesPerson();
				SalesPerson.setSales(sales); //pass the parameters in the methods
				SalesPerson.setPpsnumber(ppsnumber);
				SalesPerson.calculateCommission();
				employees.add(SalesPerson);//after parameters are set ass objects to the arrayList
			}
			if (employeeType == 2){
		                SalesEmployee SalesAgent = new SalesAgent();
				SalesAgent.setSales(sales);
				SalesAgent.setPpsnumber(ppsnumber);//same as above
				SalesAgent.calculateCommission();
				employees.add(SalesAgent);
		        }
		}
		for(int z=0; z<numEmployees; z++){
			System.out.println(employees.get(z).toString());//print the overidden toString method for the objects in the arrayList
		}
	}
}
