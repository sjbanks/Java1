import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class TrafficPanel extends JPanel{
	//Steven Banks
	private static final long serialVersionUID = 1L;
	
	private int lightState = 1;
	
	public void changeColor() {
		lightState++;
		
		if (lightState > 3) {
			lightState = 1;
		}
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(new Color(0, 0, 0));
		g.fillRect(50, 30, 190, 395);
		g.setColor(new Color(0, 100, 0));
		g.fillOval(90, 295, 100, 100);
		g.setColor(new Color(100, 100, 0));
		g.fillOval(90, 178, 100, 100);
		g.setColor(new Color(100, 0, 0));
		g.fillOval(90, 60, 100, 100);
		
		
		switch(lightState) {
		case 1:
			g.setColor(new Color(0, 255, 0));
			g.fillOval(90, 295, 100, 100);
			break;
		case 2:
			g.setColor(new Color(255, 255, 0));
			g.fillOval(90, 178, 100, 100);
			break;
		case 3:
			g.setColor(new Color(255, 0, 0));
			g.fillOval(90, 60, 100, 100);
			break;
		}
	}
	
	
}
