import javax.swing.JFrame;

public class BankAccountViewer {
	//Steven Banks
	public static void main(String[] args) {
		final double INITIAL = 1000;
		BankAccount myAccount = new BankAccount(INITIAL);
		
		JFrame frame = new BankAccountFrame(myAccount);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
