abstract class SalesEmployee{

	//data members
	protected float commission;
	protected int sales;
	private int ppsnumber;
	//constructor
	public SalesEmployee(){
	}

	abstract float calculateCommission();
	
	public void setSales(int sales){
		this.sales=sales;
	}
	public int getSales(){
		return sales;
	}
	public void setCommission(float commission){
		this.commission = commission;
	}
	public float getCommission(){
		return commission;
	}
	public void setPpsnumber(int ppsnumber){
		this.ppsnumber = ppsnumber;
	}
	public int getPpsnumber(){
		return ppsnumber;
	}
	//override toString method
	@Override
	public String toString(){
		return "Ppsnumber:"+getPpsnumber()+" Sales:"+getSales()+ " COmmission:" + calculateCommission();
	}
}
