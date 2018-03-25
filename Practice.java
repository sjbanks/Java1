import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = in.nextInt();
		System.out.print("Enter another number: ");
		int num2 = in.nextInt();
		
		int largest = largerOfTwo(num1, num2);
		System.out.print("The largest number is " + largest + ".");
		in.close();
	}
	public static int largerOfTwo(int a, int b) {
		int result = Math.max(a, b);
		return result;
	}

}
