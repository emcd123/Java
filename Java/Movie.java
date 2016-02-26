public class Movie {	
//	public void setName(){
	
	private String title;	
	private String genre;	
	private int rating;	
	
	public Movie(){
		title = "unassigned";
		genre = "unassigned";
		rating = 0;
	}
	public String getName(){
		return this.title;
	}
	public void setName(String title){
		this.title=title;
	}
	public String getGenre(){
		return this.genre;
	}
	public void setGenre(String genre){
		this.genre =genre;
	}
	public int getRating(){
		return this.rating;
	}
	public void setRating(int rating){
		this.rating=rating;
	}
//	public 
	public void playIt(){	
	
	System. out.println("Playing the Movie");	
	}	
		
}	
