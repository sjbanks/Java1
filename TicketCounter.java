
public class TicketCounter {
	//Steven Banks
	
	private int ticketCount = 75;  // set ticketCount to 75 if no value is provided
	private final int MAX_BUY = 6;
	private final int MIN_BUY = 1;
	
	public TicketCounter() {
		setTicketCount(ticketCount);	
	}
	
	public int getTicketCount() {
		return ticketCount;
	}
	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}
	public int getMAX_BUY() {
		return MAX_BUY;
	}
	public int getMIN_BUY() {
		return MIN_BUY;
	}
	
	public String purchase(int amount) {
		
		if (amount > ticketCount) {
			return "There are only " + ticketCount + " tickets left. Please enter a valid number.";
		}
		else {
			int tempAmount = ticketCount - amount;
			ticketCount = tempAmount;
			String remaining = amount + " tickets purchased. " + ticketCount + " tickets remaining.";
			return remaining;
			
		}
	}
}
