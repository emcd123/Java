public class Student{
	private String name;
	private long IdNumber;

	public Student(){
		this("unassigned",0);
	}
	public Student(String name, long IdNumber){
		this.name = name;
		this.IdNumber = IdNumber;
	}
	public String getName(){
		return name;
	}
	public long getIdNumber(){
		return IdNumber;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setIdNumber(long IdNumber){
		this.IdNumber = IdNumber;
	}
	public String toString(){
		return getName() +" "+ getIdNumber();
	}
}
