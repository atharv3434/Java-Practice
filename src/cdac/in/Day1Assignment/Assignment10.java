package cdac.in.Day1;
import java.util.Scanner;

public class Assignment10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Marks: ");
		int marks = sc.nextInt();
		
		if(marks >= 40 && marks <= 100) {
			System.out.println("You are Pass");
		}else if (marks < 40 && marks >= 0) {
			System.out.println("You are Fail!!");
		}else {
			System.out.println("Invalid Marks Entered");
		}
	}

}
