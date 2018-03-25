import java.util.ArrayList;
public class ArrayListExampleBANKS {
	//Steven Banks
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names);
		//add individual names
		names.add("Andy");
		names.add("Angela");
		names.add("Dwight");
		names.add("Erin");
		names.add("Jim");
		names.add("Michael");
		names.add("Pam");
		names.add("Toby");
	    System.out.println(names);
	    //print using the get() method
	    System.out.print(names.get(0) + " ");
	    System.out.print(names.get(1) + " ");
	    System.out.print(names.get(2) + " ");
	    System.out.print(names.get(3) + " ");
	    System.out.print(names.get(4) + " ");
	    System.out.print(names.get(5) + " ");
	    System.out.print(names.get(6) + " ");
	    System.out.println(names.get(7) + " ");
	    //Print size of the ArrayList
	    System.out.println(names.size() + " is the size of this ArrayList.");
	    //Use size() to print the last name on the list
	    System.out.println(names.get(names.size()-1) + " is the last name on the list.");
	    //use set() to change Andy to Andy Bernard, print ArrayList to verify
	    names.set(0, "Andy Bernard");
	    System.out.println(names);
	    //insert kelly after jim and print
	    names.add(5, "Kelly");
	    System.out.println(names);
	    //use an enahced for loop to print each name in the ArrayList
	    for (String name : names) {
	    	System.out.print(name + " ");
	    }
	    System.out.println();
	    //create a second ArrayList and pass names into its constructor
	    ArrayList<String> names2 = new ArrayList<String>(names);
	    System.out.println(names2);
	    //remove index 0 from names, but not from names2
	    names.remove(0);
	    System.out.println(names);
	    System.out.println(names2);
	    
	    //BOO YA! 
	}

}
