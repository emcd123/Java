public class studentTester {
	public static void main(String args[]){
		student[] students = new student[3];
		
	//create the object in the array
		students[0]= new student();
		students[1]= new student();
		students[2]= new student();

//setters, names ,idnumber, course
		students[0].setName("john doe");
		students[1].setName("jane doe");
		students[2].setName("jason smith");


		students[0].setIDnumber(12345678);
		students[1].setIDnumber(12567834);
		students[2].setIDnumber(12347856);

		students[0].setCourse("2BA");
		students[1].setCourse("2BA");
		students[2].setCourse("2BSc");


//print the student info
		System.out.println(students[0].getName());
		System.out.println(students[0].getIDnumber());
		System.out.println(students[0].getCourse());


		System.out.println(students[1].getName());
		System.out.println(students[1].getIDnumber());
		System.out.println(students[1].getCourse());

		System.out.println(students[2].getName());
		System.out.println(students[2].getIDnumber());
		System.out.println(students[2].getCourse());



	}
}
