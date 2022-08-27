package com.tesuan.pokemon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class WaterTypeGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WaterTypeGUI frame = new WaterTypeGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WaterTypeGUI() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 947, 628);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 51, 204), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				JPanel panel_2 = new JPanel();
				panel_2.setBounds(10, 11, 912, 567);
				contentPane.add(panel_2);
				panel_2.setBorder(new LineBorder(new Color(0, 0, 51), 2, true));
				panel_2.setBackground(new Color(65, 105, 225));
				panel_2.setLayout(null);
				
				JCheckBox chckbxSquirtle = new JCheckBox("    Squirtle");
				chckbxSquirtle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            	if(chckbxSquirtle.isSelected()) {
				        	if(User.pokemonList.size()<3)
								User.pokemonList.add(chckbxSquirtle.getText().trim());
							else
								chckbxSquirtle.setSelected(false);
				        }else if(!chckbxSquirtle.isSelected()) {
				        	int x = User.pokemonList.indexOf(chckbxSquirtle.getText().trim());
				        	User.pokemonList.remove(x);
				        }
					 
					
					
					System.out.println("Elements of ArrayList are:");
	        for (int i = 0; i < User.pokemonList.size(); i++) {
	            System.out.println(User.pokemonList.get(i) + " ");
	        }

            }

        });
				chckbxSquirtle.setForeground(new Color(240, 255, 240));
				chckbxSquirtle.setBackground(new Color(0, 102, 204));
				chckbxSquirtle.setFont(new Font("Tahoma", Font.BOLD, 18));
				chckbxSquirtle.setBounds(374, 182, 152, 27);
				panel_2.add(chckbxSquirtle);
				
				JCheckBox chckbxFroakie = new JCheckBox("    Froakie");
				chckbxFroakie.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            	if(chckbxFroakie.isSelected()) {
				        	if(User.pokemonList.size()<3)
								User.pokemonList.add(chckbxFroakie.getText().trim());
							else
								chckbxFroakie.setSelected(false);
				        }else if(!chckbxFroakie.isSelected()) {
				        	int x = User.pokemonList.indexOf(chckbxFroakie.getText().trim());
				        	User.pokemonList.remove(x);
				        }
					 
					
					
					System.out.println("Elements of ArrayList are:");
	        for (int i = 0; i < User.pokemonList.size(); i++) {
	            System.out.println(User.pokemonList.get(i) + " ");
	        }

            }

        });
				chckbxFroakie.setForeground(new Color(240, 255, 240));
				chckbxFroakie.setFont(new Font("Tahoma", Font.BOLD, 18));
				chckbxFroakie.setBackground(new Color(0, 102, 204));
				chckbxFroakie.setBounds(374, 219, 152, 27);
				panel_2.add(chckbxFroakie);
				
				JCheckBox chckbxTentacruel = new JCheckBox("    Tentacruel");
				chckbxTentacruel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            	if(chckbxTentacruel.isSelected()) {
				        	if(User.pokemonList.size()<3)
								User.pokemonList.add(chckbxTentacruel.getText().trim());
							else
								chckbxTentacruel.setSelected(false);
				        }else if(!chckbxTentacruel.isSelected()) {
				        	int x = User.pokemonList.indexOf(chckbxTentacruel.getText().trim());
				        	User.pokemonList.remove(x);
				        }
					 
					
					
					System.out.println("Elements of ArrayList are:");
	        for (int i = 0; i < User.pokemonList.size(); i++) {
	            System.out.println(User.pokemonList.get(i) + " ");
	        }

            }

        });
				chckbxTentacruel.setForeground(new Color(240, 255, 240));
				chckbxTentacruel.setFont(new Font("Tahoma", Font.BOLD, 18));
				chckbxTentacruel.setBackground(new Color(0, 102, 204));
				chckbxTentacruel.setBounds(373, 257, 152, 27);
				panel_2.add(chckbxTentacruel);
				
				JCheckBox chckbxMudkip = new JCheckBox("    Mudkip");
				chckbxMudkip.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            	if(chckbxMudkip.isSelected()) {
				        	if(User.pokemonList.size()<3)
								User.pokemonList.add(chckbxMudkip.getText().trim());
							else
								chckbxMudkip.setSelected(false);
				        }else if(!chckbxMudkip.isSelected()) {
				        	int x = User.pokemonList.indexOf(chckbxMudkip.getText().trim());
				        	User.pokemonList.remove(x);
				        }
            	

    			System.out.println("Elements of ArrayList are:");
    	        for (int i = 0; i < User.pokemonList.size(); i++) {
    	            System.out.println(User.pokemonList.get(i) + " ");
    	        }
            }

        });
				chckbxMudkip.setForeground(new Color(240, 255, 240));
				chckbxMudkip.setFont(new Font("Tahoma", Font.BOLD, 18));
				chckbxMudkip.setBackground(new Color(0, 102, 204));
				chckbxMudkip.setBounds(374, 295, 152, 27);
				panel_2.add(chckbxMudkip);
				
				JCheckBox chckbxPiplup = new JCheckBox("    Piplup");
				chckbxPiplup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	
            	if(chckbxPiplup.isSelected()) {
				        	if(User.pokemonList.size()<3)
								User.pokemonList.add(chckbxPiplup.getText().trim());
							else
								chckbxPiplup.setSelected(false);
				        }else if(!chckbxPiplup.isSelected()) {
				        	int x = User.pokemonList.indexOf(chckbxPiplup.getText().trim());
				        	User.pokemonList.remove(x);
				        }
            	

    			System.out.println("Elements of ArrayList are:");
    	        for (int i = 0; i < User.pokemonList.size(); i++) {
    	            System.out.println(User.pokemonList.get(i) + " ");
    	        }

            }

        });
				chckbxPiplup.setForeground(new Color(240, 255, 240));
				chckbxPiplup.setFont(new Font("Tahoma", Font.BOLD, 18));
				chckbxPiplup.setBackground(new Color(0, 102, 204));
				chckbxPiplup.setBounds(375, 331, 152, 27);
				panel_2.add(chckbxPiplup);
				
				JButton btnReturn = new JButton("Return");
				btnReturn.setForeground(Color.LIGHT_GRAY);
				btnReturn.setFont(new Font("Tahoma", Font.BOLD, 15));
				btnReturn.setBackground(new Color(0, 0, 102));
				btnReturn.setBounds(793, 524, 109, 32);
				panel_2.add(btnReturn);
				
				JLabel lblNewLabel_1 = new JLabel("New label");
				lblNewLabel_1.setIcon(new ImageIcon("src/wttt.png"));
				lblNewLabel_1.setBounds(467, 30, 433, 77);
				panel_2.add(lblNewLabel_1);
				
				JLabel lblNewLabel = new JLabel("New label");
				lblNewLabel.setIcon(new ImageIcon("src/watr.png"));
				lblNewLabel.setBounds(3, 3, 912, 567);
				panel_2.add(lblNewLabel);
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
//				ChooseYourAgent cya = new ChooseYourAgent();
//				cya.setVisible(true);

			}

		});
	}
}