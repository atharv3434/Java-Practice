package cdac.in.Day1;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of the Circle");
		double radius = sc.nextDouble();
		
		double area = 3.14 * radius * radius;
		double circumference = 2 * 3.14 * radius;
		
		System.out.println("Area: " + area);
		System.out.println("Circumference: " + circumference);
		
		sc.close();
		
		
	}

}
