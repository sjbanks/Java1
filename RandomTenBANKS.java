public class RandomTenBANKS {
	//Steven Banks
	public static void main(String[] args) {
		
		final int LOW = 1;
		final int HI = 20;
		final int SIZE = 10;
		int largest;
		int lowest;
		int [] randomArray = new int [SIZE];
		
		for (int i = 0; i < randomArray.length; i++) {
			int randNum = LOW + (int)(Math.random() * HI);
			randomArray[i] = randNum;
			//System.out.println(randNum); //checking to see if it works
		}
		//all items
		System.out.print("All array items: ");
		for (int element : randomArray) {
			System.out.print(element + " ");
		}
		System.out.println();
		//even index items
		System.out.print("Even index items: ");
	    for (int i = 0; i < randomArray.length; i=i+2){
	    	 System.out.print(randomArray[i]+" ");
	     }
	    System.out.println();
	    //even elements
	    System.out.print("Even elements: ");
	    for (int i = 0; i < randomArray.length; i++) {
	    	if (randomArray[i] % 2 == 0) {
	    		System.out.print(randomArray[i] + " ");
	    	}
	    }
	    System.out.println();
	    //Reverse the array
	    System.out.print("Reversed array: ");
	    for (int i = randomArray.length-1; i >=0; i--) {
	    	System.out.print(randomArray[i] + " ");
	    }
	    System.out.println();
	    //first
	    System.out.println("First array element: " + randomArray[0]);
	    //last
	    System.out.println("Last array element: " + randomArray[randomArray.length-1]);
	    //highest number
	    System.out.print("Highest number in array: ");
	    largest = randomArray[0];
	    for (int i = 1; i < randomArray.length; i++) {
	    	if (randomArray[i] > largest) {
	    		largest = randomArray[i];
	    	}
	    }System.out.println(largest);
	    //lowest
		System.out.print("Lowest number in array: ");
		lowest = randomArray[0];
		for (int i = 1; i < randomArray.length; i ++) {
			if (randomArray[i] < lowest) {
				lowest = randomArray[i];
			}
		}System.out.println(lowest);
	}
}
