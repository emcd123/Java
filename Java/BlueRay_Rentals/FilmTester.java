//import nessecary utilities
import java.util.Scanner;
import java.util.ArrayList;

public class FilmTester{
	public static void main(String args[]){
		//create a scanner object to take any user input
		Scanner user_input = new Scanner(System.in);
		//create an arraylist object to add film object to
		ArrayList Films = new ArrayList();
		//take number of movie out on rental
		int numFilms;
		System.out.println("Enter number of films to be inputted: ");
		numFilms = user_input.nextInt();

		int Idnumber;
		System.out.println("Enter staff Idnumber: ");
		Idnumber = user_input.nextInt();
		//loop through a sequence for each movie thats rented out
		//work out the late fees
		//Then add the created objects to the ArrayList
		for(int z=0; z<numFilms; z++){
			int genre;
			System.out.println("Enter1 for comedy,2 for Action,3 for Drama : ");
			genre = user_input.nextInt();

			String Title;///***STILL HAVE TO TAKE IN THE INPUT!!
			System.out.println("Enter Movie Title: ");
			Title = user_input.next();
			
			String Classification;
			System.out.println("Enter MOvie Classification: ");
			Classification = user_input.next();

			int days_late;
			System.out.println("Enter no.of Days late: ");
			days_late = user_input.nextInt();
	
			//Create nessecary genre object
			if(genre == 1){
				Film comedy = new Comedy(Idnumber,Title,Classification);
				Films.add(comedy);
			}
			if(genre == 2){
				Film action = new Action(Idnumber,Title,Classification);
				Films.add(action);
			}
			if(genre == 3){
				Film drama = new Drama(Idnumber,Title,Classification);
				Films.add(drama);
			}
		}
		//now print the overridden toString method
		for(int z=0; z<numFilms; z++){
			System.out.println(Films.get(z).toString());
		}
	}
}
