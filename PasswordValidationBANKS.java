import java.util.Scanner;
public class PasswordValidationBANKS {
	//Steven Banks
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean changed = false; 
		
		System.out.println("New password must have at least 8 characters, 1 uppercase, 1 lowercase, and 1 digit.");
		System.out.print("Enter new password: ");
		String password = in.next();
		while (!changed) {
		if (isValid(password)) {
			System.out.print("Enter password again to confirm: ");
			String password2 = in.next();
			if (password2.equals(password)) {
				System.out.print("Password changed.");
				changed = true;
				break;
			}
			else {System.out.println("Password did not match. ");}
		} else {
			System.out.print("Enter a valid password: ");
			password = in.next();
		}
		}in.close();
	}
	public static boolean isValid(String password) {
		final int UPPERCASE = 1;
		final int LOWERCASE = 1;
		final int CHARACTERS = 8;
		final int DIGIT = 1;
		int upperCount = 0;
		int lowerCount = 0;
		int digCount = 0;
		
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCount++;
			}
			if (Character.isLowerCase(ch)) {
				lowerCount++;
			}
			if (Character.isDigit(ch)) {
				digCount++;
			}
			if (upperCount >= UPPERCASE && lowerCount >= LOWERCASE && password.length() >= CHARACTERS && digCount >= DIGIT) {
				return true;
		}
		}
		return false;
		

	}
}
