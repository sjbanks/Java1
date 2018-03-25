import java.util.ArrayList;
import java.util.Scanner;

public class BadArrayIndexBANKS {
	//Steven Banks
	public static void main(String[] args) {
		
		ArrayList<String> firstNames = new ArrayList<String>();
		firstNames.add("Steve");
		firstNames.add("Mallory");
		firstNames.add("Larry");
		firstNames.add("Kristopherson");
		firstNames.add("Zoe");
		firstNames.add("Ella");
		firstNames.add("Lily");
		firstNames.add("Jeff");
		firstNames.add("Teri");
		firstNames.add("Ryan");
		int position;
		Scanner in = new Scanner(System.in);
		
		try {
			System.out.print("Enter an integer to see the corresponding name: ");
			position = in.nextInt();
			System.out.print(firstNames.get(position - 1));
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.print("Number must be between 1 and 10");
		}
		//The above catch wasn't catching this exception, and I'm not sure why
		//So I made two catches
		catch (IndexOutOfBoundsException exception) {
			System.out.print("Number must be between 1 and 10");
		}
		in.close();
	}

}
