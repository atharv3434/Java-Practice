package cdac.in.Day2;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        double discount;

        if (price >= 10000) {
            discount = 20;
        } else if (price >= 5000) {
            discount = 10;
        } else if (price >= 2000) {
            discount = 5;
        } else {
            discount = 0;
        }

        double finalPrice = price - (price * discount / 100);

        System.out.println("\n--- Product Details ---");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: ₹" + finalPrice);

        sc.close();
    }
}
