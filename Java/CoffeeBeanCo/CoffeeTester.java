import java.util.Scanner;
public class CoffeeTester{
	public static void main(String[] args){
	Scanner user_input = new Scanner(System.in);

	int unitWeight;
	System.out.println("Enter weight of bag: ");
	unitWeight = user_input.nextInt();

	int numberOfUnits;
	System.out.println("Enter number of bags in order: ");
	numberOfUnits = user_input.nextInt();

	user_input.close();

	CoffeeBagOrder order = new CoffeeBagOrder(unitWeight, numberOfUnits);
	//System.out.println(order.toString());	
	//System.out.println(5.50);
	//System.out.println(order.calculateSalesBeforeTax());
	//System.out.println(order.calculateSalesTax());
	//System.out.println(order.calculateTotalSales());
	System.out.println(order.toString());


	}
}
