import java.util.Scanner;

public class Premium 
{
	public static void main(String[] args)
{
		//data members
		Scanner user_input = new Scanner(System.in);

		int age ;
		System.out.println("Age: ");
		age = user_input.nextInt();

		String gender;
		System.out.println("Gender: ");
		gender = user_input.next();

		int yearsAcc_free;
		System.out.println("Number of years accident free: ");
		yearsAcc_free = user_input.nextInt();

		int womanU25 = 1500;

		int womanO25 = 800;

		int n = yearsAcc_free/10;

		if(yearsAcc_free < 5){
			n.equals(n);
		}
		if(yearsAcc_free > 5){
			n.equals(n*0);
		}
		if ((age >= 20)&&(age <= 75)){

			if (age < 25){
				if("female".equals(gender)){
				System.out.println(womanU25*n);
				}
				else if("male".equals(gender)){
				System.out.println((womanU25+200)*n);
				}

			}
			if (age >= 25){
				if( "female".equals(gender)){
				System.out.println(womanO25*n);
				}
				else if("male".equals(gender)){
				System.out.println((womanO25+200)*n);
				}





			}
		}

	}
}
