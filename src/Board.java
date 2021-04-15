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
		setPlayers(playerNumber);
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
		if(playerNumber >= 2) {
			//amarillo
			BufferedImage image;
			try {
				image = ImageIO.read(new File("./Images/Yellow1.png"));
				
				JLabel yellow1label = new JLabel(new ImageIcon(image));
				yellow1label.setLocation(0, 0);
				yellow1label.setBackground(null);
				yellow1.add(yellow1label);
				yellow1.setSize(25,30);
				yellow1.setOpaque(false);
				yellow1.setLocation(500,600);
				layeredPane.add(yellow1, layeredPane.MODAL_LAYER);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			//rojo
			
		}
		if(playerNumber >= 3) {
			//verde
			
		}
		if(playerNumber >= 4) {
			//azul
			
		}
		
		
	}
	
	
	
	
	private JPanel yellow1 = new JPanel();
	private JPanel yellow2 = new JPanel();
	private JPanel yellow3 = new JPanel();
	private JPanel yellow4 = new JPanel();
	private JPanel red1 = new JPanel();
	private JPanel red2 = new JPanel();
	private JPanel red3 = new JPanel();
	private JPanel red4 = new JPanel();
	private JPanel green1 = new JPanel();
	private JPanel green2 = new JPanel();
	private JPanel green3 = new JPanel();
	private JPanel green4 = new JPanel();
	private JPanel blue1 = new JPanel();
	private JPanel blue2 = new JPanel();
	private JPanel blue3 = new JPanel();
	private JPanel blue4 = new JPanel();
	
	
	
	
	
	private JPanel boardPanel = new JPanel();
	private Color backgroundColor = new Color(250,225,192);
	private JPanel background = new JPanel();
	JLayeredPane layeredPane = new JLayeredPane();
	
}
