import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class InitialMenu extends JFrame{
	
	
	
	
	
	
	
	
	
	public void Title() {
		
		
	}
	
	public void createBackground() {
		
		Color backgroundColor = new Color(250,225,192);
		
		JPanel background = new JPanel();
		background.setLayout(null);
		background.setBackground(backgroundColor);
		
		setSize(1400,800);
		add(background);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel playerNumber = new JPanel();
		
		playerNumber.setLocation(700,600);
		playerNumber.setSize(200,200);
		playerNumber.setBackground(backgroundColor);
		JLabel howMany = new JLabel("Please choose how many players ");
		
		playerNumber.add(howMany);
		background.add(playerNumber);
		
		
		
	}
	
	
}



