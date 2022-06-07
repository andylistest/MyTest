import java.util.Scanner;
public class GitHub {
	public static void main (String[] args){
		System.out.println("Hello Word!");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = in.nextInt();
		System.out.println("Enter your name:");
		String name = in.next();
		System.out.println("Name " + name + ", age " + age + " years old.");
	}
}

