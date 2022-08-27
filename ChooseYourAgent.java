package com.tesuan.pokemon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class ChooseYourAgent extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseYourAgent frame = new ChooseYourAgent();
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
	public ChooseYourAgent() {
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 542);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 51, 204), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				JPanel panel_2 = new JPanel();
				panel_2.setBounds(10, 11, 856, 481);
				contentPane.add(panel_2);
				panel_2.setBorder(new LineBorder(new Color(0, 0, 51), 2, true));
				panel_2.setBackground(new Color(221, 160, 221));
				panel_2.setLayout(null);
				
				JTextPane txtpnimportantRememberIf = new JTextPane();
				txtpnimportantRememberIf.setFont(new Font("Tahoma", Font.PLAIN, 9));
				txtpnimportantRememberIf.setText("⚠Important:\r\nRemember if you choose a \r\nPokemon you can delete \r\nthat inside the type but \r\nonce you get back you can \r\nnot go to that again. You \r\ncan reset your pokemons \r\nthen choose again!\r\nPokemons will be sent \r\nautomatically one after another chronologically\r\nwhen a Pokemon dies!\r\nEnjoy the game!");
				txtpnimportantRememberIf.setBounds(10, 321, 123, 149);
				panel_2.add(txtpnimportantRememberIf);
				
				JButton btnWaterType = new JButton("WaterType");
				btnWaterType.setForeground(new Color(0, 0, 153));
				btnWaterType.setBackground(new Color(0, 204, 255));
				btnWaterType.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
				btnWaterType.setBounds(202, 175, 158, 38);
				panel_2.add(btnWaterType);
				
					btnWaterType.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							
							WaterTypeGUI watertypeGUI = new WaterTypeGUI();
							watertypeGUI.setVisible(true);
							btnWaterType.setEnabled(false);
						}

					});
					
					
					JButton btnFireType = new JButton("FireType");
					btnFireType.setForeground(new Color(255, 153, 0));
					btnFireType.setBackground(new Color(204, 51, 51));
					btnFireType.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
					btnFireType.setBounds(487, 175, 158, 38);
					panel_2.add(btnFireType);
					btnFireType.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							
							FireTypeGUI firetypeGUI = new FireTypeGUI();
							firetypeGUI.setVisible(true);
							btnFireType.setEnabled(false);

						}

					});
					
					JButton btnGrassType = new JButton("GrassType");
					btnGrassType.setForeground(new Color(0, 102, 102));
					btnGrassType.setBackground(new Color(0, 255, 153));
					btnGrassType.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
					btnGrassType.setBounds(202, 232, 158, 38);
					panel_2.add(btnGrassType);
					btnGrassType.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							
							GrassTypeGUI grasstypeGUI = new GrassTypeGUI();
							grasstypeGUI.setVisible(true);
							btnGrassType.setEnabled(false);
						}

					});
					
					JButton btnElectricType = new JButton("ElectricType");
					btnElectricType.setForeground(new Color(0, 0, 0));
					btnElectricType.setBackground(new Color(255, 255, 153));
					btnElectricType.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
					btnElectricType.setBounds(487, 232, 158, 38);
					panel_2.add(btnElectricType);
					
					
		btnElectricType.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						ElectricTypeGUI electrictypeGUI = new ElectricTypeGUI();
						electrictypeGUI.setVisible(true);
						btnElectricType.setEnabled(false);
					}

		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 9));
		
		btnReset.setBounds(389, 209, 66, 38);
		panel_2.add(btnReset);
		

		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				btnElectricType.setEnabled(true);
				btnFireType.setEnabled(true);
				btnWaterType.setEnabled(true);
				btnGrassType.setEnabled(true);
				
				User.pokemonList.clear();
				System.out.println("Elements of ArrayList are:");
		        for (int i = 0; i < User.pokemonList.size(); i++) {
		            System.out.println(User.pokemonList.get(i) + " ");
		        }
				
			}

		});
		
		
		JButton btnStartBattle = new JButton("Start Battle");
		btnStartBattle.setIcon(new ImageIcon("src/Fight.png"));
		btnStartBattle.setBounds(347, 292, 156, 60);
		panel_2.add(btnStartBattle);
		
				JLabel lblSimpleCalculator = new JLabel(" ");
				lblSimpleCalculator.setIcon(new ImageIcon("src/chooseyouragent.png"));
				lblSimpleCalculator.setBounds(10, 29, 610, 117);
				panel_2.add(lblSimpleCalculator);
				lblSimpleCalculator.setForeground(new Color(102, 0, 102));
				lblSimpleCalculator.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblSimpleCalculator.setHorizontalAlignment(SwingConstants.CENTER);
				
				JLabel lblNewLabel = new JLabel("New label");
				lblNewLabel.setIcon(new ImageIcon("src/choose.png"));
				lblNewLabel.setBounds(3, 2, 851, 478);
				panel_2.add(lblNewLabel);
		
		
		
		btnStartBattle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(User.pokemonList.size() == 3) {
												
					dispose();
					Fight f = new Fight();
					f.setVisible(true);
				}
				
			}

		});
		
	}
}