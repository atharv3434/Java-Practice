package cdac.in.Day2;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks: ");
		
		int marks = sc.nextInt();
		
		if(marks >= 90 && marks <= 100) {
			System.out.println("Grade A ");
		}else if (marks >= 75 && marks <= 89) {
			System.out.println("Grade B");
		}else if(marks >= 60 && marks <= 74) {
			System.out.println("Grade C");
		}else if(marks >= 50 && marks <=59) {
			System.out.println("Grade D");
		}else if(marks < 50 && marks >= 0) {
			System.out.println("Grade F");
		}else {
			System.out.println("Invalid Marks Entered!!");
		}
		
	}

}
