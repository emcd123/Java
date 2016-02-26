public class SalesPerson extends SalesEmployee{
	//constructor ,calling super class
	public SalesPerson(){
		super();
	}
	@Override
	public float calculateCommission(){
		commission = (sales * 0.15f);
		return commission;
	}
	@Override
	public String toString(){
		return "Ppsnumber:"+getPpsnumber()+" Sales:"+getSales()+" Commission:"+getCommission();
	}
}
