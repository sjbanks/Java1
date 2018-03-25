import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TicketCounterFrame extends JFrame {
	//Steven Banks
	private static final long serialVersionUID = 1L;
	
	
	private TicketCounter counter;
	private final int MIN_TIX = 1;
	private final int MAX_TIX = 6;
	private final int FIELD_WIDTH = 10;
	private final int PANEL_WIDTH = 500;
	private final int PANEL_HEIGHT = 300;
	private JLabel amount = new JLabel("Enter how many tickets you'd like to purchase (1-6):");
	private JTextField tAmount = new JTextField(FIELD_WIDTH);
	private JButton pTickets = new JButton("Purchase tickets");
	private JLabel tRemaining = new JLabel("");
	private JLabel soldOut = new JLabel("");
	private JPanel controlPanel;
	private TicketCounterComponent component;
	
	public TicketCounterFrame(TicketCounter t) {
		counter = t;
		purchaseListener a = new purchaseListener();
		pTickets.addActionListener(a);
		controlPanel = new JPanel();
		component = new TicketCounterComponent(75);
		controlPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		controlPanel.setSize(PANEL_WIDTH,PANEL_HEIGHT);
		controlPanel.add(amount);
		controlPanel.add(tAmount);
		controlPanel.add(pTickets);
		controlPanel.add(tRemaining);
		controlPanel.add(soldOut);
		controlPanel.add(component);
		add(controlPanel);
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		
	}
	
	class purchaseListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent p) {
			try {
				String a = tAmount.getText();
				int purchaseAmount = Integer.parseInt(a);
					if (purchaseAmount >= MIN_TIX && purchaseAmount <= MAX_TIX) {
						tRemaining.setText(counter.purchase(purchaseAmount));
						tAmount.setText("");
						component.setSold(purchaseAmount);
						repaint();
						controlPanel.repaint();
							if (component.getSold() == 75) { 
								//I couldn't figure out how to remove the action listener from the button, so I removed the button! 
								soldOut.setText("Sold Out!");
								controlPanel.remove(pTickets);
							}
					}
					else if (purchaseAmount < MIN_TIX) {
						tRemaining.setText("Please enter a number greater than 0.");
						tAmount.setText("");
					}
					else if (purchaseAmount > MAX_TIX) {
						tRemaining.setText("6 is the max available per order.");
						tAmount.setText("");
					}
					
			}
			catch (NumberFormatException exception) {
				tRemaining.setText("Please enter a number.");
				tAmount.setText("");
			}
			
		}
		
	}
		
			
}
