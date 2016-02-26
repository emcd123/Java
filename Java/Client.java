public class Client{
	public static void main(String[] args){
		Person[] client = new Person[2];
		//create the objects and set values
		Person clients= new Person();
		client[0]= new Person("Jane Doe", 28, 'F');
		client[1]= new Person("John Doe", 25, 'M');
		//print the info using the toString method
		System.out.println("p1  " +clients.toString());
		System.out.println("p2 " +client[0].toString());
		System.out.println("p1 " +client[1].toString());
	}
}
