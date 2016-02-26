import java.utils.Scanner;
public class MovieTest{
	public static void main(String[] args){
		//defining and creating array of movie objects
		Movie[] film = new Movie[3];
		film[0] = new Movie();//creating each movie object
		film[1] = new Movie();
		film[2] = new Movie();
		//creating arrays to store info for the movies
		String title[] = String[3];
		String genre[]=String[3];	
		int rating[]=int[3];

		Scaner user_input = new Scanner(System.in);
			
		//variables
		//MOVIE1
		String title;
		System.out.prinln("Please enter the title of the movie: ");
		title[0] = user_input.nextInt();
		film[0].playit(title[0]+"- Now Playing");
		
		String genre;
		System.out.println("Please enter the genre of the movie: ");
		genre[0] = user_input.next();

		int rating;
		System.out.println("Please enter the rating for the movie(1-5): ");
		rating[0]=user_input.nextInt();
	
		//MOVIE2
		String title;
		System.out.prinln("Please enter the title of the movie: ");
		title[1] = user_input.nextInt();

		String genre;
		System.out.println("Please enter the genre of the movie: ");
		genre[1] = user_input.next();

		int rating;
		System.out.println("Please enter the rating for the movie(1-5): ");
		rating[1]=user_input.nextInt();
		
		film[1].playit(title[1]+"- Now Playing");


		//MOVIE3
		String title;
		System.out.prinln("Please enter the title of the movie: ");
		title[2] = user_input.nextInt();

		String genre;
		System.out.println("Please enter the genre of the movie: ");
		genre[2] = user_input.next();

		int rating;
		System.out.println("Please enter the rating for the movie(1-5): ");
		rating[2]=user_input.nextInt();

		film[2].playit(title[2]+"- Now Playing");

		//setters
		film[0].setTitle(title[0]);
		film[1].setTitle(title[1]);
		film[2].setTitle(title[2]);

		film[0].setGenre(genre[0]);
		film[1].setGenre(genre[1]);
		film[2].setGenre(genre[2]);
	
		film[0].setRating(rating[0]);
		film[1].setRating(rating[1]);
		film[2].setRating(rating[2]);
	//getters and printing getters
		System.out.println(film[0].getTitle());
		System.out.println(film[0].getGenre());
		System.out.println(film[0].getRating());

		System.out.println(film[1].getTitle());
		System.out.println(film[1].getGenre());
		System.out.println(film[1].getRating());
	
		System.out.println(film[2].getTitle());
		System.out.println(film[2].getGenre());
		System.out.println(film[2].getRating());
	

	}
}
