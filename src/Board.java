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
		BufferedImage image;
		if(playerNumber >= 2) {
			//amarillo 1
			
			try {
				image = ImageIO.read(new File("./Images/Yellow1.png"));
				
				JLabel yellow1label = new JLabel(new ImageIcon(image));
				yellow1label.setLocation(0, 0);
				yellow1label.setBackground(null);
				yellow1.add(yellow1label);
				yellow1.setSize(25,30);
				yellow1.setOpaque(false);
				yellow1.setLocation(600,550);
				layeredPane.add(yellow1, layeredPane.MODAL_LAYER);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				image = ImageIO.read(new File("./Images/Yellow2.png"));
				
				JLabel yellow2label = new JLabel(new ImageIcon(image));
				yellow2label.setLocation(0, 0);
				yellow2label.setBackground(null);
				yellow2.add(yellow2label);
				yellow2.setSize(25,30);
				yellow2.setOpaque(false);
				yellow2.setLocation(550,550);
				layeredPane.add(yellow2, layeredPane.MODAL_LAYER);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				image = ImageIO.read(new File("./Images/Yellow3.png"));
				
				JLabel yellow3label = new JLabel(new ImageIcon(image));
				yellow3label.setLocation(0, 0);
				yellow3label.setBackground(null);
				yellow3.add(yellow3label);
				yellow3.setSize(25,30);
				yellow3.setOpaque(false);
				yellow3.setLocation(550,600);
				layeredPane.add(yellow3, layeredPane.MODAL_LAYER);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				image = ImageIO.read(new File("./Images/Yellow4.png"));
				
				JLabel yellow4label = new JLabel(new ImageIcon(image));
				yellow4label.setLocation(0, 0);
				yellow4label.setBackground(null);
				yellow4.add(yellow4label);
				yellow4.setSize(25,30);
				yellow4.setOpaque(false);
				yellow4.setLocation(600,600);
				layeredPane.add(yellow4, layeredPane.MODAL_LAYER);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			//rojo
			try {
				image = ImageIO.read(new File("./Images/Red1.png"));
				
				JLabel red1label = new JLabel(new ImageIcon(image));
				red1label.setLocation(0, 0);
				red1label.setBackground(null);
				red1.add(red1label);
				red1.setSize(25,30);
				red1.setOpaque(false);
				red1.setLocation(1020,130);
				layeredPane.add(red1, layeredPane.MODAL_LAYER);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				image = ImageIO.read(new File("./Images/Red2.png"));
				
				JLabel red2label = new JLabel(new ImageIcon(image));
				red2label.setLocation(0, 0);
				red2label.setBackground(null);
				red2.add(red2label);
				red2.setSize(25,30);
				red2.setOpaque(false);
				red2.setLocation(1070,130);
				layeredPane.add(red2, layeredPane.MODAL_LAYER);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				image = ImageIO.read(new File("./Images/Red3.png"));
				
				JLabel red3label = new JLabel(new ImageIcon(image));
				red3label.setLocation(0, 0);
				red3label.setBackground(null);
				red3.add(red3label);
				red3.setSize(25,30);
				red3.setOpaque(false);
				red3.setLocation(1020,80);
				layeredPane.add(red3, layeredPane.MODAL_LAYER);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				image = ImageIO.read(new File("./Images/Red4.png"));
				
				JLabel red4label = new JLabel(new ImageIcon(image));
				red4label.setLocation(0, 0);
				red4label.setBackground(null);
				red4.add(red4label);
				red4.setSize(25,30);
				red4.setOpaque(false);
				red4.setLocation(1070,80);
				layeredPane.add(red4, layeredPane.MODAL_LAYER);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
		}
		if(playerNumber >= 3) {
			//verde
			try {
                image = ImageIO.read(new File("./Images/Green1.png"));

                JLabel green1label = new JLabel(new ImageIcon(image));
                green1label.setLocation(0, 0);
                green1label.setBackground(null);
                green1.add(green1label);
                green1.setSize(25,30);
                green1.setOpaque(false);
                green1.setLocation(1020,550);
                layeredPane.add(green1, layeredPane.MODAL_LAYER);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

            try {
                image = ImageIO.read(new File("./Images/Green2.png"));

                JLabel green2label = new JLabel(new ImageIcon(image));
                green2label.setLocation(0, 0);
                green2label.setBackground(null);
                green2.add(green2label);
                green2.setSize(25,30);
                green2.setOpaque(false);
                green2.setLocation(1020,600);
                layeredPane.add(green2, layeredPane.MODAL_LAYER);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

            try {
                image = ImageIO.read(new File("./Images/Green3.png"));

                JLabel green3label = new JLabel(new ImageIcon(image));
                green3label.setLocation(0, 0);
                green3label.setBackground(null);
                green3.add(green3label);
                green3.setSize(25,30);
                green3.setOpaque(false);
                green3.setLocation(1070,550);
                layeredPane.add(green3, layeredPane.MODAL_LAYER);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            try {
                image = ImageIO.read(new File("./Images/Green4.png"));

                JLabel green4label = new JLabel(new ImageIcon(image));
                green4label.setLocation(0, 0);
                green4label.setBackground(null);
                green4.add(green4label);
                green4.setSize(25,30);
                green4.setOpaque(false);
                green4.setLocation(1070,600);
                layeredPane.add(green4, layeredPane.MODAL_LAYER);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
			
		}
		if(playerNumber >= 4) {
			//azul
			try {
                image = ImageIO.read(new File("./Images/Blue1.png"));

                JLabel Blue1Label = new JLabel(new ImageIcon(image));
                Blue1Label.setLocation(0, 0);
                Blue1Label.setBackground(null);
                blue1.add(Blue1Label);
                blue1.setSize(25,30);
                blue1.setOpaque(false);
                blue1.setLocation(600,130);
                layeredPane.add(blue1, layeredPane.MODAL_LAYER);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            try {
                image = ImageIO.read(new File("./Images/Blue2.png"));

                JLabel Blue2Label = new JLabel(new ImageIcon(image));
                Blue2Label.setLocation(0, 0);
                Blue2Label.setBackground(null);
                blue2.add(Blue2Label);
                blue2.setSize(25,30);
                blue2.setOpaque(false);
                blue2.setLocation(600,80);
                layeredPane.add(blue2, layeredPane.MODAL_LAYER);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            try {
                image = ImageIO.read(new File("./Images/Blue3.png"));

                JLabel Blue3Label = new JLabel(new ImageIcon(image));
                Blue3Label.setLocation(0, 0);
                Blue3Label.setBackground(null);
                blue3.add(Blue3Label);
                blue3.setSize(25,30);
                blue3.setOpaque(false);
                blue3.setLocation(550,80);
                layeredPane.add(blue3, layeredPane.MODAL_LAYER);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            try {
                image = ImageIO.read(new File("./Images/Blue4.png"));

                JLabel Blue4Label = new JLabel(new ImageIcon(image));
                Blue4Label.setLocation(0, 0);
                Blue4Label.setBackground(null);
                blue4.add(Blue4Label);
                blue4.setSize(25,30);
                blue4.setOpaque(false);
                blue4.setLocation(550,130);
                layeredPane.add(blue4, layeredPane.MODAL_LAYER);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
			
			
			
			
			
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
