public class Person{
	//data member
	private String name;
	private int age;
	private char gender;

	//consturctor
	public Person(){
		this("not given", 0, 'U');
	}
	public Person(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String  getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public char getGender(){
		return gender;
	}
	public void setName(){
		this.name = name;
	}
	public void setAge(){
		this.age = age;
	}
	public void setGender(){
		this.gender = gender;
	}
	public String toString(){
		return " Name: "+getName()+ " Age: "+ getAge()+ " Gender: "+ getGender();
	} 

}
