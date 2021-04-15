import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Board extends JFrame{
	
	public Board(int playerNumber) {
		setBoard();
	}
	
	public void setBoard() {
		
		setTitle("Parcheesi");
		setResizable(false);
		background.setLayout(null);
		background.setBackground(backgroundColor);
		background.setSize(1200,751);
		setSize(1200,751);
		layeredPane.add(background, layeredPane.DEFAULT_LAYER);

		BufferedImage image;
		try {
			image = ImageIO.read(new File("./Images/board2.png"));
			
			JLabel imageLable = new JLabel(new ImageIcon(image));
			imageLable.setLocation(0, 0);

			boardPanel.setLocation(466,-9);
			boardPanel.setSize(718,720);
			boardPanel.add(imageLable);
			layeredPane.add(boardPanel, layeredPane.PALETTE_LAYER);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		
		add(layeredPane);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
	}
	public void setPlayers(int playerNumber) {
		
	}
	
	
	
	
	
	private JPanel boardPanel = new JPanel();
	private Color backgroundColor = new Color(250,225,192);
	private JPanel background = new JPanel();
	JLayeredPane layeredPane = new JLayeredPane();
	
}
