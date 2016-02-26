//import the scanner class to take inputs
//take inputted number and validate if its a number between 1 and 10
//if its not between 1 and 10 then ask for another number
import java.util.Scanner;
public class numInput{
	public static void main(String[] args){	
		while (true){
			int num_input;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a number between 1 and 10: ");
			num_input = in.nextInt();


			if  ((num_input > 10) || (num_input <1)) {
			System.out.println("error, enter numbers between 1 and 10! "); 
			}
			else{
				break;}
		}
	}
}
