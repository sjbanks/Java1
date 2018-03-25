import java.util.Scanner;
public class WordCounterBANKS {

	//Steven Banks
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a phrase: ");
		String str = in.nextLine();
		
		System.out.print("There are " + countWords(str) + " words in that phrase.");
		in.close();
	}
	public static int countWords(String str) {
		int wordCount = 1;
		
		for (int i = 0; i < str.length(); i++) {
			String sub = str.substring(i, i+1);
			if (sub.equals(" ")) {
				wordCount++;
			}
		}
	return wordCount;	
	}

}
