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



public class ElectricTypeGUI extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElectricTypeGUI frame = new ElectricTypeGUI();
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
	public ElectricTypeGUI() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 942, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 51, 204), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
        
        		JPanel panel_2 = new JPanel();
        		panel_2.setBounds(7, 6, 912, 567);
        		contentPane.add(panel_2);
        		panel_2.setBorder(new LineBorder(new Color(0, 0, 51), 2, true));
        		panel_2.setBackground(new Color(255, 255, 224));
        		panel_2.setLayout(null);
        		
        		JCheckBox chckbxPikachu = new JCheckBox("    Pikachu");
        		chckbxPikachu.setBackground(new Color(255, 255, 204));
        		chckbxPikachu.setFont(new Font("Tahoma", Font.BOLD, 18));
        		chckbxPikachu.setBounds(366, 210, 152, 27);
        		panel_2.add(chckbxPikachu);
        		
       
        		chckbxPikachu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 if(chckbxPikachu.isSelected()) {
			        	if(User.pokemonList.size()<3)
							User.pokemonList.add(chckbxPikachu.getText().trim());
						else
							chckbxPikachu.setSelected(false);
			        }else if(!chckbxPikachu.isSelected()) {
			        	int x = User.pokemonList.indexOf(chckbxPikachu.getText().trim());
			        	User.pokemonList.remove(x);
			        }
				 
				
				
				System.out.println("Elements of ArrayList are:");
		        for (int i = 0; i < User.pokemonList.size(); i++) {
		            System.out.println(User.pokemonList.get(i) + " ");
		        }

			}

		});
        		
        		        JCheckBox chckbxManectric = new JCheckBox("    Manectric");
        		        chckbxManectric.setFont(new Font("Tahoma", Font.BOLD, 18));
        		        chckbxManectric.setBackground(new Color(255, 255, 204));
        		        chckbxManectric.setBounds(366, 251, 152, 27);
        		        panel_2.add(chckbxManectric);
        		        
        		         chckbxManectric.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 if(chckbxManectric.isSelected()) {
			        	if(User.pokemonList.size()<3)
			        		User.pokemonList.add(chckbxManectric.getText().trim());
						else
							chckbxManectric.setSelected(false);
			        }else if(!chckbxManectric.isSelected()) {
			        	int x = User.pokemonList.indexOf(chckbxManectric.getText().trim());
			        	User.pokemonList.remove(x);
			        }
				
				
				System.out.println("Elements of ArrayList are:");
		        for (int i = 0; i < User.pokemonList.size(); i++) {
		            System.out.println(User.pokemonList.get(i) + " ");
		        }

			}

		});
        		         
        		                 JCheckBox chckbxElectivire = new JCheckBox("    Electivire");
        		                 chckbxElectivire.setFont(new Font("Tahoma", Font.BOLD, 18));
        		                 chckbxElectivire.setBackground(new Color(255, 255, 204));
        		                 chckbxElectivire.setBounds(366, 291, 152, 27);
        		                 panel_2.add(chckbxElectivire);
        		                 
        		                 
        		                 chckbxElectivire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 
				 if(chckbxElectivire.isSelected()) {
			        	if(User.pokemonList.size()<3)
			        		User.pokemonList.add(chckbxElectivire.getText().trim());
						else
							chckbxElectivire.setSelected(false);
			        }else if(!chckbxElectivire.isSelected()) {
			        	int x = User.pokemonList.indexOf(chckbxElectivire.getText().trim());
			        	User.pokemonList.remove(x);
			        }
				
//				if(user.pokemonList.size()<3)
//					user.pokemonList.add(chckbxElectivire.getText().trim());
//				else
//					chckbxElectivire.setSelected(false);
				
				System.out.println("Elements of ArrayList are:");
		        for (int i = 0; i < User.pokemonList.size(); i++) {
		            System.out.println(User.pokemonList.get(i) + " ");
		        }

			}

		});
        		                 
        		                         JButton btnReturn = new JButton("Return");
        		                         btnReturn.setForeground(Color.LIGHT_GRAY);
        		                         btnReturn.setFont(new Font("Tahoma", Font.BOLD, 15));
        		                         btnReturn.setBackground(Color.BLACK);
        		                         btnReturn.setBounds(791, 521, 108, 34);
        		                         panel_2.add(btnReturn);
        		                         
        		                         		JLabel lblElectric = new JLabel(" ");
        		                         		lblElectric.setIcon(new ImageIcon("src/frrrr.png"));
        		                         		lblElectric.setBounds(509, 42, 433, 77);
        		                         		panel_2.add(lblElectric);
        		                         		lblElectric.setForeground(new Color(102, 0, 102));
        		                         		lblElectric.setFont(new Font("Tahoma", Font.BOLD, 20));
        		                         		lblElectric.setHorizontalAlignment(SwingConstants.CENTER);
        		                         		
        		                         		JLabel lblNewLabel = new JLabel("New label");
        		                         		lblNewLabel.setIcon(new ImageIcon("src/Ele.png"));
        		                         		lblNewLabel.setBounds(2, 1, 912, 567);
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