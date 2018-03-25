import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccountFrame extends JFrame {
	//Steven Banks
	
	private BankAccount account;
	private final int FIELD_WIDTH = 10;
	private final int PANEL_WIDTH = 400;
	private final int PANEL_HEIGHT = 100;
	private JLabel amount = new JLabel("Amount: ");
	private JTextField amountfield = new JTextField(FIELD_WIDTH);
	private JButton withdraw = new JButton("Withdraw");
	private JButton deposit = new JButton("Deposit");
	private JLabel balance = new JLabel("Balance: ");
	
	public BankAccountFrame(BankAccount b) {
		account = b;
		depositListener d = new depositListener();
		deposit.addActionListener(d);
		withdrawListener w = new withdrawListener();
		withdraw.addActionListener(w);
		JPanel controlPanel = new JPanel();
		controlPanel.add(amount);
		controlPanel.add(amountfield);
		controlPanel.add(withdraw);
		controlPanel.add(deposit);
		controlPanel.add(balance);
		add(controlPanel);
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
	}
	
	class depositListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent d) {
			String a = amountfield.getText();
			double depositAmount = Double.parseDouble(a);
			account.deposit(depositAmount);
			balance.setText("Balance: " + account.getBalance());
		}
	}
	class withdrawListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent w) {
			String b = amountfield.getText();
			double withdrawAmount = Double.parseDouble(b);
			account.withdraw(withdrawAmount);
			balance.setText("Balance: " + account.getBalance());
		}
	}
	
	
	
	
}
