import java.util.Scanner;

public class ComputeBalanceBANKS {

	//Steven Banks
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double initial;
		double rate;
		int years;
		
		System.out.print("Enter your initial balance: ");
		initial = in.nextDouble();
		System.out.print("Enter your interest rate: ");
		rate = in.nextDouble();
		System.out.print("Enter the number of years you'd like to calculate: ");
		years = in.nextInt();
		
		System.out.printf("$%.2f", computeBalance(initial, rate, years));
		in.close();
	}
	/** 
	 * determines interest accumulation and balance over time
	 * @param initial balance before interest rate
	 * @param rate interest rate
	 * @param years how many years computed
	 * @return initial plus interest accumulated
	 */
	public static double computeBalance(double initial, double rate, int years) {
		int count = 0;
		double newTotal = initial;
		double interest;
		
		while (count < years) {
			interest = newTotal * rate;
			newTotal += interest;
			//System.out.println(newTotal); //check that calculations are correct
			count++;
		}
		return newTotal;
		
	}
}
