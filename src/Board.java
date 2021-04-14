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
		BufferedImage image;
		try {
			image = ImageIO.read(new File("./board.png"));
			JLabel imageLable = new JLabel(new ImageIcon(image));
			
			imageLable.setLocation(0, 0);
			background.add(imageLable);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		background.setVisible(true);
		add(background);
		
	}
	
	
	
	
	
	
	
	private JPanel background = new JPanel();
	
}
