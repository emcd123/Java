public class Student{
	private int age;
	private String name, address;

	public Student(){
		this(0," "," ");
	}
	public Student(int age,String name, String address){
		this.age = age;
		this.name = name;
		this.address = address;
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String toString(){
		return "Name: "+getName()+"\n"+"Age:"+getAge()+"\n"+"Address:"+getAddress();
	}
}
