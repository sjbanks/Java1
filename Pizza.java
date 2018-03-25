
public class Pizza extends MenuItem {
//Steven Banks
	
	private String topping;
	private String size;
	private double price;
	private int orderNumber;
	private static int nextOrderNumber = 1001;
	
	public Pizza(String t, String s, Double p) {
		setTopping(t);
		setSize(s);
		setPrice(p);
		
		nextOrderNumber++;
		this.orderNumber = nextOrderNumber;
		
		if (getSize().equals("error")) {
			throw new IllegalArgumentException("Size not selected.");
		}
	}
	
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		size.toLowerCase();
		if (size.equals("small") || size.equals("medium") || size.equals("large") || size.equals("extra large")) {
			this.size = size;
		}
		else {
			this.size = "error";
		}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
	
	public static Pizza quickOrder(String topping) {
		Pizza quickPizza = new Pizza(topping, "large", 9.99);
		return quickPizza;
	}
	public String repeatOrder() {
		String repeat = "Order Number: " + orderNumber + "," + " You ordered a " + this.getSize() + " " + this.getTopping() + " pizza for $" + this.getPrice() + ".";
		return repeat;
		//return super.getDescription() + "Order number: " + this.getOrderNumber();
	}
	
}
