package cdac.in.Day1;
import java.util.Scanner;

public class Assignment8 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter First Number: ");
	int num1 = sc.nextInt();
	
	System.out.println("Enter Second Number: ");
	
	int num2 = sc.nextInt();
	
	if (num1 > num2) {
		System.out.println(num1 + " "+ "is Greater than" + " "+ num2);
	}else if (num2 > num1) {
		System.out.println(num2 + " "+ "is Greater than" + " "+ num1);
	}else {
		System.out.println("Both the Number's are Equal ");
	}
	
	
	}
	
	

}
