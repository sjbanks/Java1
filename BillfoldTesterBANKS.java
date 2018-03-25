import java.time.LocalDate;
import billfold.Billfold;
import cards.*;

public class BillfoldTesterBANKS {
	//Steven Banks
	public static void main(String[] args) {

	DebitCard myDebit = new DebitCard("Steven Banks", "4521-7896-0000-1594", "1234");
	DriverLicense myDL = new DriverLicense("Steven Banks", "912AA7304", LocalDate.of(2022, 10, 11));
	DriverLicense expiredDL = new DriverLicense("Joe Shmoe", "1234567", LocalDate.of(2016, 03, 13));
	YMCACard myYMCA = new YMCACard("Sailor", "ilovetostayattheYMCA");
	YMCACard me = new YMCACard("Kelli", "1QAZXSW");
	YMCACard husband = new YMCACard("Kelli", "1QAZXSW");
	
	Billfold myWallet = new Billfold();
	myWallet.addCard(myDebit);
	myWallet.addCard(myDL);
	System.out.println(myWallet.formatCards());
	
	Billfold wallet2 = new Billfold();
	wallet2.addCard(expiredDL);
	wallet2.addCard(myYMCA);
	System.out.println("Number of expired cards: " + wallet2.getExpiredCardCount());
	
	System.out.println(me.equals(husband));
	
	}
}	
