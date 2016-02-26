public class Order implements OrderInterface{
	//data memeber
	final static double SALES_TAX = 0.1;
	public int unitWeight, numberOfUnits;
	public Order(int weight , int number){
		unitWeight = weight;
		numberOfUnits = number;
	}
	public void numberOfItems(int number){
		numberOfUnits = number;
	}
	public void unitWeight(int weight){
		unitWeight =weight;
	}
	public int getUnitWeight(){
		return unitWeight;
	}
	public int getNumberOfUnits(){
		return numberOfUnits;
	}
	public String toString(){
		return "Weight of units: "+getUnitWeight()+"\n"+" Number of units: "+getNumberOfUnits();
	}
}
