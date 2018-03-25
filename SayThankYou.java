import java.util.Scanner;
public class SayThankYou {
	//Steven Banks
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		sayThanks("Gaius");
		sayThanks("Gaius", "Baltar");
		sayThanks("President", "Gaius", "Baltar");
		in.close();
	}
	public static void sayThanks(String fname) {
		System.out.println("Thanks, " + fname);
	}
	public static void sayThanks(String fname, String lname) {
		System.out.println("Thank you, " + fname + " " + lname);
	}
	public static void sayThanks(String title, String fname, String lname) {
		System.out.println("Thank you so very much, " + title + " " + fname + " " + lname);
	}
	

}
