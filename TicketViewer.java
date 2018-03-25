import java.awt.Component;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class TicketViewer {
	//Steven Banks
	public static void main(String[] args) {
		
		TicketCounter myCounter = new TicketCounter();
		JFrame frame = new TicketCounterFrame(myCounter);
		frame.setTitle("TicketCounterBANKS");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
