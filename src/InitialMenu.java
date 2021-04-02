import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class InitialMenu extends JFrame{
	
	
	public void choosePlayers() {
		
		JPanel playerNumber = new JPanel();
		
		playerNumber.setLocation(400,500);
		playerNumber.setSize(600,200);
		playerNumber.setBackground(backgroundColor);
		JLabel howMany = new JLabel("Please choose a number of players");
		howMany.setFont(new Font("Calibri",Font.PLAIN,25));
		
		playerNumber.add(howMany);
		background.add(playerNumber);
		
	}
	
	public void createBackground() {
		
		
		background.setLayout(null);
		background.setBackground(backgroundColor);
		
		setSize(1400,800);
		add(background);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private Color backgroundColor = new Color(250,225,192);
	private JPanel background = new JPanel();
	private int playerNumber;
	
	
}



