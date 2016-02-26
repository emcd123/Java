public class Dog{
	int size;
	String breed;
	String name;


	public Dog(String name){
		this.name = name;
	}
	public void bark(){
		System.out.println("ruff ruff")
	}
	public void dogSize(String dogSize){
		size = dogSize;
	}
	public void dogBreed(String dogBreed)
		breed = dogBreed;
	}
	public void printDog(){
		System.out.println("Name: " +name);
		System.out.println("Size: " +size);
		System.out.println("Breed: " +breed);
	}



}
