import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrafficLight extends JFrame implements ActionListener{
	//Steven Banks
	private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	private JPanel panel;
	private JButton switchButton;
	private TrafficPanel trafficPanel;
	
	public TrafficLight() {
		frame = new JFrame("Traffic Light");
		panel = new JPanel();
		switchButton = new JButton("Switch");
	}
	
	public void launchApp() {
		frame.setSize(300, 500);
		panel.add(switchButton);
		switchButton.addActionListener(this);
		trafficPanel = new TrafficPanel();
		frame.getContentPane().add(trafficPanel);
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();
		trafficLight.launchApp();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == switchButton) {
			trafficPanel.changeColor();
		}
		
	}
	
	
	
}
