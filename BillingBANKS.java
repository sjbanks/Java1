
public class BillingBANKS {
	
	final static double TAX = 0.08;
	
	public static void main(String[] args) {
		
		System.out.printf("$%.2f", computePhotoBill(19.99));
		System.out.println();
		System.out.printf("$%.2f", computePhotoBill(19.99, 2));
		System.out.println();
		System.out.printf("$%.2f", computePhotoBill(19.22, 2, .1));

	}
	public static double computePhotoBill(double price) {
		double total = (price * TAX) + price;
		return total;
	}
	public static double computePhotoBill(double price, int num) {
		double subtotal = price * num;
		double subTax = subtotal * TAX;
		double total = subtotal + subTax;
		return total;
	}
	public static double computePhotoBill(double price, int num, double coupon) {
		double subtotal = price * num;
		double newSubtotal = subtotal - (subtotal * coupon);
		double subTax = newSubtotal * TAX;
		double total = subTax + newSubtotal;
		return total;
	}
	

}
