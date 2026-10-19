package cdac.in.Day1;
import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("The Number you Entered is Even ");
		}else {
			System.out.println("The Number you Entered is Odd ");
		}
	}

}
