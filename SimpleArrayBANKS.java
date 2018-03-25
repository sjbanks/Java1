
public class SimpleArrayBANKS {
	//Steven Banks
	public static void main(String[] args) {
		
		double [] simpleArray = {20.5, 30.12, 40.01, 50.99, 60.45, 70.32, 80.00, 90.78, 10.01, 1.15, 2.25, 3.35, 4.45, 5.55, 6.65};
		int counter = 0;
		for (double element : simpleArray) {
			System.out.println("simpleArray element at index[" + counter + "] = " + element);
			counter++;	
		}

	}

}
