import java.util.ArrayList;

public class Order {
	//Steven Banks
	
	private double totalPrice = 0;
	private ArrayList<Pizza> customerOrderList;
	
	public Order() {
		System.out.println("A new order is created");
		customerOrderList = new ArrayList<Pizza>();
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public void addToOrder(Pizza p) {
		customerOrderList.add(p);
		this.totalPrice += p.getPrice();
	}
}
