public class dogCreator{
	public static void main(String[] args){
		Dog dog1 = new Dog();
		dog1.setName("Spot");
		dog1.setBreed("Beagle");
		dog1.setSize(15);
		System.out.println(dog1.getName());
		System.out.println(dog1.getBreed());
		System.out.println(dog1.getSize());
		dog1.bark();
	}
}
