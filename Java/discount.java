public class discount{
	//variables
	private float price;
	private float coffeeBags;
	//constructor
	public discount(){
		price  = 0;
		//coffeebags =0f;
	}//getters and setter
	public float getPrice(){
		return this.price;
	}
	public float getCoffeeBags(){
		return this.coffeeBags;
	}
	public  void setPrice(float price){
		this.price = price;
	}
	public void setCoffeeBags(float coffeeBags){
		this.coffeeBags = coffeeBags;
	}//creating the discount variable called amount
	public float  discount_given(float amount){
		if(coffeeBags >25){
			amount = 0.05f;
		}
		if(coffeeBags >50){
			amount = 0.1f;
		}
		if(coffeeBags >100){
			amount = 0.15f;
		}
		if(coffeeBags >150){
			amount = 0.2f;
		}
		if(coffeeBags >200){
			amount = 0.25f;
		}
		if(coffeeBags >300){
			amount = 0.2f;
		}
		System.out.println("Discount given: " +amount);
		return amount;
	}
}
