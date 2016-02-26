import java.util.Scanner;//importing input library
public class discountCreator1{
	//taking the variable input from the discount.java file
	public static void main(String[] args){
		float i = discount_given(amount);

		//taking input to get number of bags ordered
		float bag_num;
		Scanner in = new Scanner(system.in);
		System.out.println("Enter number of coffee bags ordered: ");
		bag_num = in.nextInt();

		//creating an instance of the object
		//then getting and setting the values
		//then trying to do the arithmetic for the order
		discount discount1 = new discount();
		System.out.println("Number of bags ordered "+bag_num);
		System.out.println("Discount "+i);
		System.out.println("Your total cost is: "+(((discount1.setPrice(5.5f))*(discount1.setCoffeeBags(bag_num)))/(i));
		discount1.getPrice();
		discount1.getCoffeeBags();
	}

}
