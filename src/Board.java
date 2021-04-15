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
		background.setBackground(backgroundColor);
		setSize(1500,940);
		JPanel imagePanel = new JPanel();
		BufferedImage image;
		try {
			image = ImageIO.read(new File("./board2.png"));
			
			JLabel imageLable = new JLabel(new ImageIcon(image));
			imageLable.setLocation(588, 0);
			imageLable.setSize(897,900);
			background.add(imageLable);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		add(background);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	
	
	
	
	
	private Color backgroundColor = new Color(250,225,192);
	private JPanel background = new JPanel();
	
}
