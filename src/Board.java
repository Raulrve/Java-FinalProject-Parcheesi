import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Board extends JFrame{
	
	public Board(int playerNumber) {
		players = playerNumber;
		setBoard();
		setPlayers(playerNumber);
		userInterface();
		startGame();
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
			//amarillo 
			
			try {
				image = ImageIO.read(new File("./Images/Yellow1.png"));
				
				JLabel yellow1label = new JLabel(new ImageIcon(image));
				yellow1label.setLocation(0, 0);
				yellow1label.setBackground(null);
				yellow1.add(yellow1label);
				yellow1.setSize(25,30);
				yellow1.setOpaque(false);
				yellow1.setLocation(yellowb[0]);
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
				yellow2.setLocation(yellowb[1]);
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
				yellow3.setLocation(yellowb[2]);
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
				yellow4.setLocation(yellowb[3]);
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
				red1.setLocation(redb[0]);
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
				red2.setLocation(redb[1]);
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
				red3.setLocation(redb[2]);
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
				red4.setLocation(redb[3]);
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
                green1.setLocation(greenb[0]);
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
                green2.setLocation(greenb[1]);
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
                green3.setLocation(greenb[2]);
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
                green4.setLocation(greenb[3]);
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
                blue1.setLocation(blueb[0]);
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
                blue2.setLocation(blueb[1]);
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
                blue3.setLocation(blueb[2]);
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
                blue4.setLocation(blueb[3]);
                layeredPane.add(blue4, layeredPane.MODAL_LAYER);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
		}
	}
	public void userInterface() {
		//show current player
		currentPlayerPanel.setLayout(null);
		currentPlayerPanel.setLocation(0,0);
		currentPlayerPanel.setSize(468,100);
		currentPlayerPanel.setBackground(Color.LIGHT_GRAY);
		currentPlayerPanel.setBorder(border);
		
		playerName.setSize(300,100);
		playerName.setLocation(150,10);
		playerName.setFont(new Font("Calibri",Font.BOLD,50));
		
		
		currentPlayerPanel.add(playerName);
		layeredPane.add(currentPlayerPanel, layeredPane.PALETTE_LAYER);
		
		
		//show dice
		dicePanel.setLayout(null);
		dicePanel.setLocation(0,100);
		dicePanel.setSize(468,250);
		dicePanel.setBackground(Color.LIGHT_GRAY);
		dicePanel.setBorder(border);
		setDice();
		
		
		
		pleaseRoll.setSize(200,50);
		pleaseRoll.setLocation(150,10);
		pleaseRoll.setFont(new Font("Calibri",Font.BOLD,30));
		dicePanel.add(pleaseRoll);
		layeredPane.add(dicePanel, layeredPane.PALETTE_LAYER);
		
		
		
			
		
		
		movePanel.setLayout(null);
		movePanel.setLocation(0,350);
		movePanel.setSize(468,362);
		movePanel.setBackground(Color.LIGHT_GRAY);
		movePanel.setBorder(border);
		
		layeredPane.add(movePanel, layeredPane.PALETTE_LAYER);
	}
	
	public void setDice() {
		BufferedImage image;
		//dado 6 izquierda
		try {
			image = ImageIO.read(new File("./Images/Dado6.png"));
			
			JLabel dadolabel = new JLabel(new ImageIcon(image));
			dadolabel.setLocation(0, 0);
			dadolabel.setBackground(null);
			dadoizquierda6.add(dadolabel);
			dadoizquierda6.setSize(100,110);
			dadoizquierda6.setOpaque(false);
			dadoizquierda6.setLocation(110,200);
			dadoizquierda6.setVisible(true);
			layeredPane.add(dadoizquierda6, layeredPane.MODAL_LAYER);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//dado 5 izquierda
		try {
			image = ImageIO.read(new File("./Images/Dado5.png"));
			
			JLabel dadolabel = new JLabel(new ImageIcon(image));
			dadolabel.setLocation(0, 0);
			dadolabel.setBackground(null);
			dadoizquierda5.add(dadolabel);
			dadoizquierda5.setSize(100,110);
			dadoizquierda5.setOpaque(false);
			dadoizquierda5.setLocation(110,200);
			dadoizquierda5.setVisible(false);
			layeredPane.add(dadoizquierda5, layeredPane.MODAL_LAYER);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//dado 4 izquierda
		
		try {
			image = ImageIO.read(new File("./Images/Dado4.png"));
			
			JLabel dadolabel = new JLabel(new ImageIcon(image));
			dadolabel.setLocation(0, 0);
			dadolabel.setBackground(null);
			dadoizquierda4.add(dadolabel);
			dadoizquierda4.setSize(100,110);
			dadoizquierda4.setOpaque(false);
			dadoizquierda4.setLocation(110,200);
			dadoizquierda4.setVisible(false);
			layeredPane.add(dadoizquierda4, layeredPane.MODAL_LAYER);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//dado 3 izquierda
		
		try {
			image = ImageIO.read(new File("./Images/Dado3.png"));
			
			JLabel dadolabel = new JLabel(new ImageIcon(image));
			dadolabel.setLocation(0, 0);
			dadolabel.setBackground(null);
			dadoizquierda3.add(dadolabel);
			dadoizquierda3.setSize(100,110);
			dadoizquierda3.setOpaque(false);
			dadoizquierda3.setLocation(110,200);
			dadoizquierda3.setVisible(false);
			layeredPane.add(dadoizquierda3, layeredPane.MODAL_LAYER);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//dado 2 izquierda
		
		try {
			image = ImageIO.read(new File("./Images/Dado2.png"));
			
			JLabel dadolabel = new JLabel(new ImageIcon(image));
			dadolabel.setLocation(0, 0);
			dadolabel.setBackground(null);
			dadoizquierda2.add(dadolabel);
			dadoizquierda2.setSize(100,110);
			dadoizquierda2.setOpaque(false);
			dadoizquierda2.setLocation(110,200);
			dadoizquierda2.setVisible(false);
			layeredPane.add(dadoizquierda2, layeredPane.MODAL_LAYER);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//dado 1 izquierda
		try {
			image = ImageIO.read(new File("./Images/Dado1.png"));
			
			JLabel dadolabel = new JLabel(new ImageIcon(image));
			dadolabel.setLocation(0, 0);
			dadolabel.setBackground(null);
			dadoizquierda1.add(dadolabel);
			dadoizquierda1.setSize(100,110);
			dadoizquierda1.setOpaque(false);
			dadoizquierda1.setLocation(110,200);
			dadoizquierda1.setVisible(false);
			layeredPane.add(dadoizquierda1, layeredPane.MODAL_LAYER);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// dado 6 derecha
		try {
			image = ImageIO.read(new File("./Images/Dado6.png"));
			
			JLabel dadolabel = new JLabel(new ImageIcon(image));
			dadolabel.setLocation(0, 0);
			dadolabel.setBackground(null);
			dadoderecha6.add(dadolabel);
			dadoderecha6.setSize(100,110);
			dadoderecha6.setOpaque(false);
			dadoderecha6.setLocation(250,200);
			dadoderecha6.setVisible(true);
			layeredPane.add(dadoderecha6, layeredPane.MODAL_LAYER);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// dado 5 derecha
		try {
			image = ImageIO.read(new File("./Images/Dado5.png"));
			
			JLabel dadolabel = new JLabel(new ImageIcon(image));
			dadolabel.setLocation(0, 0);
			dadolabel.setBackground(null);
			dadoderecha5.add(dadolabel);
			dadoderecha5.setSize(100,110);
			dadoderecha5.setOpaque(false);
			dadoderecha5.setLocation(250,200);
			dadoderecha5.setVisible(false);
			layeredPane.add(dadoderecha5, layeredPane.MODAL_LAYER);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		
		// dado 4 derecha
		try {
			image = ImageIO.read(new File("./Images/Dado4.png"));
			
			JLabel dadolabel = new JLabel(new ImageIcon(image));
			dadolabel.setLocation(0, 0);
			dadolabel.setBackground(null);
			dadoderecha4.add(dadolabel);
			dadoderecha4.setSize(100,110);
			dadoderecha4.setOpaque(false);
			dadoderecha4.setLocation(250,200);
			dadoderecha4.setVisible(false);
			layeredPane.add(dadoderecha4, layeredPane.MODAL_LAYER);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		
		// dado 3 derecha
		try {
			image = ImageIO.read(new File("./Images/Dado3.png"));
			
			JLabel dadolabel = new JLabel(new ImageIcon(image));
			dadolabel.setLocation(0, 0);
			dadolabel.setBackground(null);
			dadoderecha3.add(dadolabel);
			dadoderecha3.setSize(100,110);
			dadoderecha3.setOpaque(false);
			dadoderecha3.setLocation(250,200);
			dadoderecha3.setVisible(false);
			layeredPane.add(dadoderecha3, layeredPane.MODAL_LAYER);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		
		// dado 2 derecha
		try {
			image = ImageIO.read(new File("./Images/Dado2.png"));
			
			JLabel dadolabel = new JLabel(new ImageIcon(image));
			dadolabel.setLocation(0, 0);
			dadolabel.setBackground(null);
			dadoderecha2.add(dadolabel);
			dadoderecha2.setSize(100,110);
			dadoderecha2.setOpaque(false);
			dadoderecha2.setLocation(250,200);
			dadoderecha2.setVisible(false);
			layeredPane.add(dadoderecha2, layeredPane.MODAL_LAYER);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		
		// dado 1 derecha
		try {
			image = ImageIO.read(new File("./Images/Dado1.png"));
			
			JLabel dadolabel = new JLabel(new ImageIcon(image));
			dadolabel.setLocation(0, 0);
			dadolabel.setBackground(null);
			dadoderecha1.add(dadolabel);
			dadoderecha1.setSize(100,110);
			dadoderecha1.setOpaque(false);
			dadoderecha1.setLocation(250,200);
			dadoderecha1.setVisible(false);
			layeredPane.add(dadoderecha1, layeredPane.MODAL_LAYER);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		
		
		
		
	}
	
	
	
	
	public void startGame() {
		playerName.setForeground(Color.yellow);
		
		endTurn.setLocation(150,650);
		endTurn.setSize(150,50);
		endTurn.setBackground(Color.pink);
		endTurn.setFont(new Font("Calibri",Font.BOLD,20));
		endTurn.setVisible(false);
		layeredPane.add(endTurn, layeredPane.POPUP_LAYER);
		endTurn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				stopDice();
				dadoizquierda6.setVisible(true);
				dadoderecha6.setVisible(true);
				
				showDice1.setVisible(false);
				showDice2.setVisible(false);
				currentPlayer++;
				nextPlayer();
			}
		});
		
		
		showDice1.setSize(130,130);
		showDice1.setLocation(80,500);
		showDice1.setBackground(backgroundColor);
		showDice1.setVisible(false);
		showDice1.setFont(new Font("Calibri",Font.BOLD,70));
		layeredPane.add(showDice1, layeredPane.POPUP_LAYER);
		
		showDice2.setSize(130,130);
		showDice2.setLocation(240,500);
		showDice2.setBackground(backgroundColor);
		showDice2.setVisible(false);
		showDice2.setFont(new Font("Calibri",Font.BOLD,70));
		layeredPane.add(showDice2, layeredPane.POPUP_LAYER);
		
		
		rollDice.setLocation(150,230);
		rollDice.setSize(159,50);
		rollDice.setBackground(Color.cyan);
		rollDice.setFont(new Font("Calibri",Font.BOLD,30));
		layeredPane.add(rollDice, layeredPane.POPUP_LAYER);
		rollDice.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dice1 = rand.nextInt(6) + 1;
				dice2 = rand.nextInt(6) + 1;
				rollDice.setVisible(false);
				stopDice();
				int diceSum = dice1 + dice2;
				
				//set left dice
				if(dice1 == 1) {
					dadoizquierda1.setVisible(true);
				}
				else if(dice1 == 2) {
					dadoizquierda2.setVisible(true);
				}
				
				else if(dice1 == 3) {
					dadoizquierda3.setVisible(true);
				}
				
				else if(dice1 == 4) {
					dadoizquierda4.setVisible(true);
				}
				
				else if(dice1 == 5) {
					dadoizquierda5.setVisible(true);
				}
				
				else if(dice1 == 6) {
					dadoizquierda6.setVisible(true);
				}
				
				//set right dice
				if(dice2 == 1) {
					dadoderecha1.setVisible(true);
				}
				else if(dice2 == 2) {
					dadoderecha2.setVisible(true);
				}
				
				else if(dice2 == 3) {
					dadoderecha3.setVisible(true);
				}
				
				else if(dice2 == 4) {
					dadoderecha4.setVisible(true);
				}
				
				else if(dice2 == 5) {
					dadoderecha5.setVisible(true);
				}
				
				else if(dice2 == 6) {
					dadoderecha6.setVisible(true);
				}
				
				
				
				if(first) {
					if(currentPlayer == 1) {
						firstSum += diceSum;
						firstPlayer = 1;
						
					}
					else {
						if(diceSum > firstSum) {
							firstSum = diceSum;
							firstPlayer = currentPlayer;
						}
					}
					if(currentPlayer == players) {
						first = false;
						currentPlayer = firstPlayer -1;
					}
					
					endTurn.setVisible(true);
				}
				
				else {
				
				showDice1.setVisible(true);
				showDice1.setText(String.valueOf(dice1));
				
				
				showDice2.setVisible(true);
				showDice2.setText(String.valueOf(dice2));
				
				
				}
				
			}
			
			
		});
		
		
		
		
	}
	public void nextPlayer() {
		endTurn.setVisible(false);
		rollDice.setVisible(true);
		if(currentPlayer == players +1) {
			currentPlayer = 1;
		}
		
		if(players ==  2) {
			if(currentPlayer == 1) {
				playerName.setText("Player 1");
				playerName.setForeground(Color.yellow);
			}
			else if(currentPlayer == 2) {
				playerName.setText("Player 2");
				playerName.setForeground(Color.red);
			}
			
		}
		
		else if(players == 3) {
			if(currentPlayer == 1) {
				playerName.setText("Player 1");
				playerName.setForeground(Color.yellow);
			}
			else if(currentPlayer == 2) {
				playerName.setText("Player 2");
				playerName.setForeground(Color.blue);
			}
			else if(currentPlayer == 3) {
				playerName.setText("Player 3");
				playerName.setForeground(Color.red);
			}
		}
		
		else if(players == 4) {
			if(currentPlayer == 1) {
				playerName.setText("Player 1");
				playerName.setForeground(Color.yellow);
			}
			else if(currentPlayer == 2) {
				playerName.setText("Player 2");
				playerName.setForeground(Color.blue);
			}
			else if(currentPlayer == 3) {
				playerName.setText("Player 3");
				playerName.setForeground(Color.red);
			}
			else if(currentPlayer == 4) {
				playerName.setText("Player 4");
				playerName.setForeground(Color.green);
			}
			
			
		}
		
	}
	
	public void stopDice() {
		dadoizquierda1.setVisible(false);
		dadoizquierda2.setVisible(false);
		dadoizquierda3.setVisible(false);
		dadoizquierda4.setVisible(false);
		dadoizquierda5.setVisible(false);
		dadoizquierda6.setVisible(false);
		
		dadoderecha1.setVisible(false);
		dadoderecha2.setVisible(false);
		dadoderecha3.setVisible(false);
		dadoderecha4.setVisible(false);
		dadoderecha5.setVisible(false);
		dadoderecha6.setVisible(false);
		
	}
	
	public void diceShow(int x , int y) {}
	
	
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
	
	private JPanel dadoizquierda1 = new JPanel();
	private JPanel dadoizquierda2 = new JPanel();
	private JPanel dadoizquierda3 = new JPanel();
	private JPanel dadoizquierda4 = new JPanel();
	private JPanel dadoizquierda5 = new JPanel();
	private JPanel dadoizquierda6 = new JPanel();
	
	private JPanel dadoderecha1 = new JPanel();
	private JPanel dadoderecha2 = new JPanel();
	private JPanel dadoderecha3 = new JPanel();
	private JPanel dadoderecha4 = new JPanel();
	private JPanel dadoderecha5 = new JPanel();
	private JPanel dadoderecha6 = new JPanel();
	
	
	private Point[] yellowb = {new Point(603,553), new Point(553,553),
								new Point(553,603), new Point(603,603)};
	
	private Point[] redb = {new Point(1028,130), new Point(1078,130),
							new Point(1028,80), new Point(1078,80)};
	
	private Point[] greenb = {new Point(1028,553), new Point(1028,603),
								new Point(1078,553), new Point(1078,603)};
	
	private Point[] blueb = {new Point(603,130), new Point(603,80),
								new Point(553,80), new Point(553,130)};
	
	
	
	private boolean first = true;
	private Random rand = new Random();
	private JButton endTurn = new JButton("End Turn");
	private JButton rollDice = new JButton("Roll Dice!");
	private JLabel pleaseRoll = new JLabel("Roll the dice!");
	private JLabel playerName = new JLabel("Player 1");
	private JPanel movePanel = new JPanel();
	private JPanel dicePanel = new JPanel();
	private JPanel currentPlayerPanel = new JPanel();
	private JPanel boardPanel = new JPanel();
	private Color backgroundColor = new Color(250,225,192);
	private JPanel background = new JPanel();
	static Border border = new LineBorder(Color.BLACK, 5, true);
	JLayeredPane layeredPane = new JLayeredPane();
	private int players;
	private int currentPlayer = 1;
	private int firstPlayer;
	private int firstSum = 0;
	private int dice1;
	private int dice2;
	private JButton showDice1 = new JButton();
	private JButton showDice2 = new JButton();
	
	
	private Point[][] boardp = {{new Point(591,395), new Point(591,433)},
			{new Point(620,395), new Point(620,433)},
			{new Point(648,395), new Point(648,433)},

			{new Point(681,395), new Point(681,433)},
			{new Point(752,473), new Point(717,473)},

			{new Point(752,505), new Point(717,505)},
			{new Point(752,534), new Point(717,534)},
			{new Point(752,562), new Point(717,562)},
			{new Point(752,591), new Point(717,591)},
			{new Point(752,620), new Point(717,620)},
			{new Point(752,650), new Point(717,650)},
			{new Point(752,679), new Point(717,679)},

			{new Point(829,679), new Point(794,679)},

			{new Point(871,679), new Point(906,679)},
			{new Point(871,650), new Point(906,650)},
			{new Point(871,620), new Point(906,620)},
			{new Point(871,591), new Point(906,591)},
			{new Point(871,562), new Point(906,562)},
			{new Point(871,534), new Point(906,534)},
			{new Point(871,505), new Point(906,505)},
			
			{new Point(871,473), new Point(906,473)},
			{new Point(947,398), new Point(947,436)},

			{new Point(980,398), new Point(980,436)},
			{new Point(1008,398), new Point(1008,436)},
			{new Point(1037,398), new Point(1037,436)},
			{new Point(1066,398), new Point(1066,436)},
			{new Point(1095,398), new Point(1095,436)},
			{new Point(1124,398), new Point(1124,436)},
			{new Point(1155,398), new Point(1155,436)},
			
			{new Point(1155,322), new Point(1555,360)},
			
			{new Point(1155,282), new Point(1155,244)},
			{new Point(1124,282), new Point(1124,244)},
			{new Point(1095,282), new Point(1095,244)},
			{new Point(1066,282), new Point(1066,244)},
			{new Point(1037,282), new Point(1037,244)},
			{new Point(1008,282), new Point(1008,244)},
			{new Point(980,282), new Point(980,244)},
			
			{new Point(947,282), new Point(947,244)},
			{new Point(873,206), new Point(908,206)},

			{new Point(873,174), new Point(908,174)},
			{new Point(873,145), new Point(908,145)},
			{new Point(873,117), new Point(908,177)},
			{new Point(873,88), new Point(908,88)},
			{new Point(873,59), new Point(908,59)},
			{new Point(873,30), new Point(908,30)},
			{new Point(873,0), new Point(908,0)},
			
			{new Point(796,0), new Point(831,0)},
			
			{new Point(754,0), new Point(719,0)},
			{new Point(754,30), new Point(719,30)},
			{new Point(754,59), new Point(719,59)},
			{new Point(754,88), new Point(719,88)},
			{new Point(754,117), new Point(719,117)},
			{new Point(754,145), new Point(719,145)},
			{new Point(754,174), new Point(719,174)},
			
			{new Point(754,206), new Point(719,206)},
			{new Point(681,279), new Point(681,241)},
			
			{new Point(648,279), new Point(648,241)},
			{new Point(620,279), new Point(620,241)},
			{new Point(591,279), new Point(591,241)},
			{new Point(562,279), new Point(562,241)},
			{new Point(533,279), new Point(533,241)},
			{new Point(504,279), new Point(504,241)},
			{new Point(473,279), new Point(473,241)},
			
			{new Point(473,355), new Point(473,317)},
			
			{new Point(473,395), new Point(473,433)},
			{new Point(503,395), new Point(503,433)},
			{new Point(533,395), new Point(533,433)},
			{new Point(562,395), new Point(562,433)},
};
	
}
