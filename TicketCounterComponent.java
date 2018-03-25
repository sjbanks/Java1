import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

public class TicketCounterComponent extends JComponent{
	//Steven Banks
	
	private int tickets = 75;
	private int sold;
	
	public TicketCounterComponent (int ticketNum){
		setTickets(ticketNum);
		setSold(0);
		setPreferredSize(new Dimension(500,500));
	}
	
	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold += sold;
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(50, 75, (tickets * 5), 50); //I wanted to make an outline for the bar, making it prettier? I guess
		g.setColor(Color.RED);
		g.fillRect(50, 75, ((tickets * 5) - (sold * 5)), 50); //reduced the 10 to 5 so it would make the bar decreasing more noticeable
		//System.out.println("" + tickets + " " + sold);
		//System.out.println("" + (tickets * 10 - (sold * 10)));
	}
	
}
