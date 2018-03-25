
public class PizzaTesterBANKS implements PizzaConstants{
	//Steven Banks
	public static void main(String[] args) {
		System.out.println("Welcome to " + COMPANY);
		System.out.println(getSpecial());
		
		Pizza myPizza = new Pizza("mushroom", "large", 9.99);
		myPizza.setDescription("A wicked good pie. \n");
		System.out.println(myPizza.repeatOrder());
		
		Pizza yourPizza = new Pizza("pepperoni", "extra large", 13.99);
		yourPizza.setDescription("You call this a pizza? This ain't no pizza. \n");
		System.out.println(yourPizza.repeatOrder());
		
		Pizza mikePizza = Pizza.quickOrder("mushroom");
		System.out.println("Mike's pizza: " + mikePizza.repeatOrder());
		
		Order kelli = new Order();
		kelli.addToOrder(myPizza);
		kelli.addToOrder(yourPizza);
		System.out.println(kelli.getTotalPrice());
		
		//Pizza thirdPizza = new Pizza("pepperoni", "extra small", 7.99);
		//System.out.println(thirdPizza.repeatOrder());
		
	}
	public static String getSpecial() {
		return "Today's special is a large 1-topping pizza for $7.99";
	}

}
