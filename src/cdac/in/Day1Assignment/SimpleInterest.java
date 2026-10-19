package cdac.in.Day1;
import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal Amount: ");
		double principal = sc.nextDouble();
		
		System.out.println("Enter the Rate Of Interest: ");
		float rate = sc.nextFloat();
		
		System.out.println("Enter the Time Period in Years:");
		int time = sc.nextInt();
		
		double simple_interest =  (principal * rate * time) / 100 ;
		
		double amount = principal + simple_interest;
		
		System.out.println("Simple Interest: " + simple_interest);
		System.out.println("Total Amount: " + amount);
		
		
	}

}
