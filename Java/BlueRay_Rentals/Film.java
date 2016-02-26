abstract class Film{
	//Data members
	protected static int Idnumber;
	protected String Title;
	protected String Classification;
	//consturctor
	public Film(){
		this(0, "TBD ","TBC ");
	}
	public Film(int Idnumber,String Title, String Classification ){
		this.Idnumber = Idnumber;
		this.Title = Title;
		this.Classification = Classification;
	}
	public abstract double calculateLateFee(int days_late);	
		
	public void setIdnumber(int Idnumber){
		this.Idnumber=Idnumber;
	}
	public static int getIdnumber(){
		return Idnumber;
	}
	public void setTitle(String Title){
		this.Title = Title;
	}
	public String getTitle(){
		return Title;
	}
	public void setClassification(String Classification){
		this.Classification = Classification;
	}
	public String getClassification(){
		return Classification;
	}

	@Override
	public String toString(){
		return "Idnumber: "+getIdnumber()+" Title: "+getTitle()+" Classicfication: "+getClassification();
	}
}
