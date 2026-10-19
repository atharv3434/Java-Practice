package cdac.in.Day1;
import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature in Celsius ");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (celsius * 9 / 5) + 32;
		
		System.out.println("Fahrenheit: " + fahrenheit);
		
	
		
	}

}
