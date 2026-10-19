package cdac.in.Day1;
import java.util.Scanner;

public class Assignment9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		
		if (age >= 18) {
			System.out.println("You are Eligible To Vote ");
		}else {
			System.out.println("You are Not Eligibile To Vote!!");
		}
	}

}
