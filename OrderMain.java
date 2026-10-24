package Assignment5;
import java.util.Scanner;

public class OrderMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of Orders: ");
		int size = sc.nextInt();
		
		DeliveryOrder[] d = new DeliveryOrder[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("Enter the Order Id: ");
			int orderId = sc.nextInt();
			
			System.out.println("Enter the Order Date: ");
			String orderDate = sc.next();
			
			System.out.println("Enter the Order Amount: ");
			double orderAmount = sc.nextDouble();
			
			sc.nextLine(); 
			
			System.out.println("Enter the Delivery Address: ");
			String delAddress = sc.nextLine();
			
			System.out.println("Enter the Delivery Charges: ");
			double delCharges = sc.nextDouble();
			
			System.out.println("Enter the Expected Delivery Days: ");
			int delDays = sc.nextInt();
			
			d[i] = new DeliveryOrder(orderId, orderDate, orderAmount, delAddress, delCharges, delDays);
			
			
		}
		
		for(int i = 0; i < size; i++) {
			
			d[i].displayDetails();
		}
		
		
		
		sc.close();
		
	}

}
