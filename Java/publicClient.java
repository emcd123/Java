public class publicClient{
	public static void main(String[] args){
		Person[] client= new Person[2];
		client[0]= new Person();
		client[1]= new Person();
	
		client[0].name = "Jane Doe";
		client[0].age = 28;
		client[0].gender = 'F';

		client[1].name = "John Doe";
		client[1].age = 25;
		client[1].gender = 'M';
		System.out.println("p1 name  "+client[0].name+ " Age: "+client[0].age+ " Gender: "+client[0].gender);
		System.out.println("p2 name  "+client[1].name+ " Age: "+client[1].age+ " Gender: "+client[1].gender);
	}
}
