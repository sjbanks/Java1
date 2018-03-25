import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class TimedResponseBANKS {
	//Steven Banks
	public static void main(String[] args) {
		
		LocalDateTime before = LocalDateTime.now();
		int beforeSec = before.getSecond();
		int beforeMin = before.getMinute();
		
		JOptionPane.showConfirmDialog(null, "Are you a closet Taylor Swift fan?");
		
		LocalDateTime after = LocalDateTime.now();
		int afterSec = after.getSecond();
		int afterMin = after.getMinute();
		
		int difference = (afterMin + afterSec) - (beforeMin +beforeSec);
		
		JOptionPane.showMessageDialog(null, "End seconds: " + afterSec
				+ "\nStart seconds: " + beforeSec + "\nIt took "
				+ difference + " seconds for you to answer.\nWas it a difficult decision?");
	}

}
