public class CoffeeBagOrder extends Order implements Sales{
	final static double PRICE_PER_KG = 5.5;
	public CoffeeBagOrder(int weight, int number){
		super(weight, number);
	}
	public double calculateSalesBeforeTax(){
		return ((unitWeight*PRICE_PER_KG)*numberOfUnits);
	}
	public double calculateSalesTax(){
		return(((unitWeight*PRICE_PER_KG)*numberOfUnits)*SALES_TAX);
	}
	public double calculateTotalSales(){
		return ((unitWeight*PRICE_PER_KG)*numberOfUnits)-(((unitWeight*PRICE_PER_KG)*numberOfUnits)*SALES_TAX);
	}
	public String toString(){
		return super.toString()+"\n"+"Price per kg: "+PRICE_PER_KG+"\n"+"Sales before tax: "+calculateSalesBeforeTax()+"\n"+"Sales Tax: "+calculateSalesTax()+"\n"+"Total Sales cost: "+calculateTotalSales();
	}
}
