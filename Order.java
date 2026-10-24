package Assignment5;

class Order {
	int orderId;
	String orderDate;
	double orderAmount;
	
	public Order(int orderId,String orderDate, double orderAmount) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		
		
	}
	
	
	public void displayOrderDetails() {
		System.out.println("Order ID: " + orderId);
		System.out.println("Order Date: " + orderDate);
		System.out.println("Order Amount: "+ orderAmount);
	}
	

}
