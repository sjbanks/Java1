import java.util.Scanner;
public class ChildCareChargesBANKS {
	//Steven Banks
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SENTINAL = 999;
		int age;
		int days;
		
		System.out.print("Enter the age of your child, or 999 to quit: ");
		age = in.nextInt();
		while (age != SENTINAL) {
			System.out.print("How many days per week does the child attend daycare? ");
			days = in.nextInt();
			System.out.print("It will cost $" + rates(age, days) + " for a " + age + " year old of for " + days + " day(s).");
			System.out.println();
			System.out.print("Enter the age of your child, or 999 to quit: ");
			age = in.nextInt();
			if (age == SENTINAL) {
				break;
			}
		}
		System.out.print("Goodbye.");
		in.close();
	}
	public static int rates(int age, int days){
		int [][] rates = {{30, 60, 88, 115, 140},
						  {26, 52, 70, 96, 120},
						  {24, 46, 67, 89, 110},
						  {22, 40, 60, 75, 88},
						  {20, 35, 50, 66, 84}};
		int values = rates[age][days-1];
		return values;
		
	}

}
