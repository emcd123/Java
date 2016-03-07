public class MealCard extends Student{
	private static int NUM_MEAL_CARDS = 0;
	private int balance;
	private int id;
	public MealCard(){
		super();
		id = ++NUM_MEAL_CARDS;
	}
	public MealCard(int age,String name,String address){
		super(age,name,address);
		id= ++NUM_MEAL_CARDS;
	}
	public int getBalance(){
		return balance;
	}
	public void setBalance(int balance){
		this.balance=balance;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public int purchaseItem(int purchase){
		return 	balance -= purchase;
	}
	public int purchasePoints(int deposit){
		return balance += deposit; 
	}
	@Override
	public String toString(){
		return super.toString()+"\n"+"Balance:"+getBalance()+"\n"+"Number of meal cards issued:"+getId();
	}







}
