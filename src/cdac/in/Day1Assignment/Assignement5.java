package cdac.in.Day1;
import java.util.Scanner;

public class Assignement5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of English: ");
		int eng_marks = sc.nextInt();
		
		System.out.println("Enter the Marks of Maths: ");
		int maths_marks = sc.nextInt();
		
		System.out.println("Enter the Marks of Science: ");
		int science_marks = sc.nextInt();
		
		double total_marks = (eng_marks + maths_marks + science_marks);
		double average_marks = (eng_marks + maths_marks + science_marks)/ 3;
		
		System.out.println("Total Marks: " + total_marks);
		System.out.println("Average Marks: "+ average_marks );
		
	}

}
