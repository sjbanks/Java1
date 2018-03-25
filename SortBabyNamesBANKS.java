import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class SortBabyNamesBANKS {
	//Steven Banks
	public static void main(String[] args) throws IOException {
		try {
			String address = "https://bbmedia.dmacc.edu/CIS/CIS171/babynames2014.txt";
			URL pageLocation = new URL(address);
			Scanner in = new Scanner(pageLocation.openStream());
			PrintWriter outBoy = new PrintWriter("boys.txt");
			PrintWriter outGirl = new PrintWriter("girls.txt");

			while (in.hasNextLine()) {
				String value = in.nextLine();
			
				if (value.contains("boy")) {
					outBoy.println(value);
				}
				else if (value.contains("girl")) {
					outGirl.println(value);
				}
			}
			in.close();
			outBoy.close();
			outGirl.close();
		}catch (IOException badAdress) {
			System.out.print("https://bbmedia.dmacc.edu/CIS/CIS171/babynames2015.txt is not available.");
		}
	}
}

