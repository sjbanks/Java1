
public class AddressTester {
	//provided by instructor

	public static void main(String[] args) {
		Address home = new Address("123","Main Street","Des Moines", "IA","50321");
		home.print();
		
		System.out.println("----------------");
		
		Address condo = new Address("5643", "Hideaway Mountain", "3C","Nashville", "TN", "37115");
		condo.print();
		
		//For not including a zip
		//Address tester = new Address("456", "Fancy Pants Rd", "Des Moines", "IA", "");
		//tester.print();
		
		//For not including a state
		//Address tester2 = new Address("456", "Fancy Pants Rd", "Des Moines", "", "50314");
		//tester2.print();
	}

}
