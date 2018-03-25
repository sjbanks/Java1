import java.util.ArrayList;
import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) words.add(in.next());
		
		ArrayList<String> copyOfWords = new ArrayList<String>();
		
		for (String eachWord : words) {
			words = copyOfWords;
		}
	}
}

