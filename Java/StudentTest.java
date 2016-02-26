import java.util.Scanner;

public class StudentTest{
	public static void main(String args[]){
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter size of array: ");

		int i = user_input.nextInt();
	
		Student[] student = new Student[i];
		for(int z=0; z<i; z++){
			String name;
			System.out.println("Enter name of student: ");
			name = user_input.next();
			long ID;
			System.out.println("Enter Idnumber of student: ");
			ID = user_input.nextLong();
			student[z] = new Student(name, ID);

		}
		for(int z=0; z<i; z++){
			System.out.println(student[z].toString());
		}
	}
}
