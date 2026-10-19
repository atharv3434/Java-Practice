package cdac.in.Day2;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = units * 3;
        } else if (units <= 300) {
            bill = units * 5;
        } else {
            bill = units * 7;
        }

        System.out.println("Electricity Bill: ₹" + bill);

        sc.close();
    }
}