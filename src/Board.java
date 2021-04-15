import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Board extends JFrame{
	
	public Board() {
		setBoard();
	}
	
	public void setBoard() {
		
		background.setLayout(null);
		background.setBackground(Color.green);
		
		setSize(1400,800);
		add(background);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
	
	
	
	
	
	
	
	private JPanel background = new JPanel();
	
}
