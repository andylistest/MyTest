import java.util.Scanner;
public class GitHub {
	public static void main (String[] args){
		System.out.println("Hello Word!");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = in.nextInt();
		System.out.println("Enter your name:");
		String name = in.next();
		System.out.println("Enter your last name:");
		String lastName = in.next();
		System.out.println("Name: " + name + /n"Last name: " + lastName + /n"age: " + age + " years old.");
		
	}
}

