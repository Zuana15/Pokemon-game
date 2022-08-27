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

public class FireTypeGUI extends JFrame {

	private JPanel contentPane;
	User user = new User();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FireTypeGUI frame = new FireTypeGUI();
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
	public FireTypeGUI() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 623);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 51, 204), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
        
        		JPanel panel_2 = new JPanel();
        		panel_2.setBounds(8, 7, 912, 567);
        		contentPane.add(panel_2);
        		panel_2.setBorder(new LineBorder(new Color(0, 0, 51), 2, true));
        		panel_2.setBackground(new Color(255, 127, 80));
        		panel_2.setLayout(null);
        		
        		JCheckBox chckbxCharizard = new JCheckBox("    Charizard");
        		chckbxCharizard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                
            	 if(chckbxCharizard.isSelected()) {
        			        	if(User.pokemonList.size()<3)
        							User.pokemonList.add(chckbxCharizard.getText().trim());
        						else
        							chckbxCharizard.setSelected(false);
        			        }else if(!chckbxCharizard.isSelected()) {
        			        	int x = User.pokemonList.indexOf(chckbxCharizard.getText().trim());
        			        	User.pokemonList.remove(x);
        			        }
        				 
        				
        				
        				System.out.println("Elements of ArrayList are:");
        		        for (int i = 0; i < User.pokemonList.size(); i++) {
        		            System.out.println(User.pokemonList.get(i) + " ");
        		        }

            }

        });
        		chckbxCharizard.setForeground(new Color(255, 255, 0));
        		chckbxCharizard.setBackground(new Color(153, 0, 51));
        		chckbxCharizard.setFont(new Font("Tahoma", Font.BOLD, 18));
        		chckbxCharizard.setBounds(373, 178, 152, 27);
        		panel_2.add(chckbxCharizard);
        		
        		
        		JCheckBox chckbxMagmar = new JCheckBox("    Magmar");
        		chckbxMagmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            	 if(chckbxMagmar.isSelected()) {
        			        	if(User.pokemonList.size()<3)
        							User.pokemonList.add(chckbxMagmar.getText().trim());
        						else
        							chckbxMagmar.setSelected(false);
        			        }else if(!chckbxMagmar.isSelected()) {
        			        	int x = User.pokemonList.indexOf(chckbxMagmar.getText().trim());
        			        	User.pokemonList.remove(x);
        			        }
            	 System.out.println("Elements of ArrayList are:");
 		        for (int i = 0; i < User.pokemonList.size(); i++) {
 		            System.out.println(User.pokemonList.get(i) + " ");
 		        }

            }

        });
        		chckbxMagmar.setForeground(new Color(255, 255, 0));
        		chckbxMagmar.setFont(new Font("Tahoma", Font.BOLD, 18));
        		chckbxMagmar.setBackground(new Color(153, 0, 51));
        		chckbxMagmar.setBounds(373, 215, 152, 27);
        		panel_2.add(chckbxMagmar);
        		
        		JCheckBox chckbxMoltres = new JCheckBox("    Moltres");
        		chckbxMoltres.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            	 if(chckbxMoltres.isSelected()) {
        			        	if(User.pokemonList.size()<3)
        							User.pokemonList.add(chckbxMoltres.getText().trim());
        						else
        							chckbxMoltres.setSelected(false);
        			        }else if(!chckbxMoltres.isSelected()) {
        			        	int x = User.pokemonList.indexOf(chckbxMoltres.getText().trim());
        			        	User.pokemonList.remove(x);
        			        }
            	 System.out.println("Elements of ArrayList are:");
 		        for (int i = 0; i < User.pokemonList.size(); i++) {
 		            System.out.println(User.pokemonList.get(i) + " ");
 		        }
            }

        });
        		chckbxMoltres.setForeground(new Color(255, 255, 0));
        		chckbxMoltres.setFont(new Font("Tahoma", Font.BOLD, 18));
        		chckbxMoltres.setBackground(new Color(153, 0, 51));
        		chckbxMoltres.setBounds(373, 253, 152, 27);
        		panel_2.add(chckbxMoltres);
        		
        		JCheckBox chckbxBlaziken = new JCheckBox("    Blaziken");
        		chckbxBlaziken.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            	if(chckbxBlaziken.isSelected()) {
        		        	if(User.pokemonList.size()<3)
        						User.pokemonList.add(chckbxBlaziken.getText().trim());
        					else
        						chckbxBlaziken.setSelected(false);
        		        }else if(!chckbxBlaziken.isSelected()) {
        		        	int x = User.pokemonList.indexOf(chckbxBlaziken.getText().trim());
        		        	User.pokemonList.remove(x);
        		        }
            	System.out.println("Elements of ArrayList are:");
        		        for (int i = 0; i < User.pokemonList.size(); i++) {
        		            System.out.println(User.pokemonList.get(i) + " ");
        		        }


            }

        });
        		chckbxBlaziken.setForeground(new Color(255, 255, 0));
        		chckbxBlaziken.setFont(new Font("Tahoma", Font.BOLD, 18));
        		chckbxBlaziken.setBackground(new Color(153, 0, 51));
        		chckbxBlaziken.setBounds(373, 293, 152, 27);
        		panel_2.add(chckbxBlaziken);
        		
        		JCheckBox chckbxGrowlith = new JCheckBox("    Growlith");
        		chckbxGrowlith.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            	if(chckbxGrowlith.isSelected()) {
        		        	if(User.pokemonList.size()<3)
        						User.pokemonList.add(chckbxGrowlith.getText().trim());
        					else
        						chckbxGrowlith.setSelected(false);
        		        }else if(!chckbxGrowlith.isSelected()) {
        		        	int x = User.pokemonList.indexOf(chckbxGrowlith.getText().trim());
        		        	User.pokemonList.remove(x);
        		        }
            	System.out.println("Elements of ArrayList are:");
        		        for (int i = 0; i < User.pokemonList.size(); i++) {
        		            System.out.println(User.pokemonList.get(i) + " ");
        		        }

            }

        });
        		chckbxGrowlith.setForeground(new Color(255, 255, 0));
        		chckbxGrowlith.setFont(new Font("Tahoma", Font.BOLD, 18));
        		chckbxGrowlith.setBackground(new Color(153, 0, 51));
        		chckbxGrowlith.setBounds(373, 331, 152, 27);
        		panel_2.add(chckbxGrowlith);
        		
        		JButton btnReturn = new JButton("Return");
        		btnReturn.setForeground(Color.LIGHT_GRAY);
        		btnReturn.setFont(new Font("Tahoma", Font.BOLD, 15));
        		btnReturn.setBackground(new Color(102, 0, 0));
        		btnReturn.setBounds(787, 518, 105, 32);
        		panel_2.add(btnReturn);
        		
        				JLabel lblFire = new JLabel("FireType");
        				lblFire.setIcon(new ImageIcon("src/frrrire.png"));
        				lblFire.setBounds(532, 28, 420, 77);
        				panel_2.add(lblFire);
        				lblFire.setForeground(new Color(102, 0, 102));
        				lblFire.setFont(new Font("Tahoma", Font.BOLD, 20));
        				lblFire.setHorizontalAlignment(SwingConstants.CENTER);
        				
        				JLabel lblNewLabel = new JLabel("New label");
        				lblNewLabel.setIcon(new ImageIcon("src/fr.png"));
        				lblNewLabel.setBounds(2, 2, 912, 567);
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