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

public class GrassTypeGUI extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GrassTypeGUI frame = new GrassTypeGUI();
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
	public GrassTypeGUI() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 946, 625);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 51, 204), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 128, 128));
		panel.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panel.setBounds(10, 11, 912, 567);
		contentPane.add(panel);
		panel.setLayout(null);
        
        		JLabel lblGrass = new JLabel(" ");
        		lblGrass.setIcon(new ImageIcon("src/grrgr.png"));
        		lblGrass.setBounds(512, 32, 433, 77);
        		panel.add(lblGrass);
        		lblGrass.setForeground(new Color(102, 0, 102));
        		lblGrass.setFont(new Font("Tahoma", Font.BOLD, 20));
        		lblGrass.setHorizontalAlignment(SwingConstants.CENTER);
        		

        

        JButton btnReturn = new JButton("Return");
        btnReturn.setBounds(792, 521, 109, 35);
        panel.add(btnReturn);
        btnReturn.setForeground(Color.LIGHT_GRAY);
        btnReturn.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnReturn.setBackground(new Color(0, 51, 51));
        
        JCheckBox chckbxBulbasaur = new JCheckBox("    Bulbasaur");
        chckbxBulbasaur.setBounds(392, 193, 152, 27);
        panel.add(chckbxBulbasaur);
        chckbxBulbasaur.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            	 if(chckbxBulbasaur.isSelected()) {
        	        	if(User.pokemonList.size()<3)
        					User.pokemonList.add(chckbxBulbasaur.getText().replaceAll(" ", ""));
        				else
        					chckbxBulbasaur.setSelected(false);
        	        }else if(!chckbxBulbasaur.isSelected()) {
        	        	int x = User.pokemonList.indexOf(chckbxBulbasaur.getText().replaceAll(" ", ""));
        	        	User.pokemonList.remove(x);
        	        }
        		 
        		
        		
        		System.out.println("Elements of ArrayList are:");
                for (int i = 0; i < User.pokemonList.size(); i++) {
                    System.out.println(User.pokemonList.get(i) + " ");
                }

            }

        });
        chckbxBulbasaur.setForeground(new Color(47, 79, 79));
        chckbxBulbasaur.setBackground(new Color(0, 255, 153));
        chckbxBulbasaur.setFont(new Font("Tahoma", Font.BOLD, 18));
        
        JCheckBox chckbxSceptile = new JCheckBox("    Sceptile");
        chckbxSceptile.setBounds(392, 230, 152, 27);
        panel.add(chckbxSceptile);
        chckbxSceptile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            	if(chckbxSceptile.isSelected()) {
                	if(User.pokemonList.size()<3)
        				User.pokemonList.add(chckbxSceptile.getText().replaceAll(" ", ""));
        			else
        				chckbxSceptile.setSelected(false);
                }else if(!chckbxSceptile.isSelected()) {
                	int x = User.pokemonList.indexOf(chckbxSceptile.getText().replaceAll(" ", ""));
                	User.pokemonList.remove(x);
                }
        	 
        	
        	
        	System.out.println("Elements of ArrayList are:");
	        for (int i = 0; i < User.pokemonList.size(); i++) {
	            System.out.println(User.pokemonList.get(i) + " ");
	        }

            }

        });
        chckbxSceptile.setForeground(new Color(47, 79, 79));
        chckbxSceptile.setFont(new Font("Tahoma", Font.BOLD, 18));
        chckbxSceptile.setBackground(new Color(0, 255, 153));
        
        JCheckBox chckbxTorterra = new JCheckBox("    Torterra");
        chckbxTorterra.setBounds(392, 268, 152, 27);
        panel.add(chckbxTorterra);
        chckbxTorterra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            	if(chckbxTorterra.isSelected()) {
                	if(User.pokemonList.size()<3)
        				User.pokemonList.add(chckbxTorterra.getText().replaceAll(" ", ""));
        			else
        				chckbxTorterra.setSelected(false);
                }else if(!chckbxTorterra.isSelected()) {
                	int x = User.pokemonList.indexOf(chckbxTorterra.getText().replaceAll(" ", ""));
                	User.pokemonList.remove(x);
                }
        	 
        	
        	
        	System.out.println("Elements of ArrayList are:");
	        for (int i = 0; i < User.pokemonList.size(); i++) {
	            System.out.println(User.pokemonList.get(i) + " ");
	        }

            }

        });
        chckbxTorterra.setForeground(new Color(47, 79, 79));
        chckbxTorterra.setFont(new Font("Tahoma", Font.BOLD, 18));
        chckbxTorterra.setBackground(new Color(0, 255, 153));
        
        JCheckBox chckbxSnivy = new JCheckBox("    Snivy");
        chckbxSnivy.setBounds(392, 308, 152, 27);
        panel.add(chckbxSnivy);
        chckbxSnivy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            	if(chckbxSnivy.isSelected()) {
                	if(User.pokemonList.size()<3)
        				User.pokemonList.add(chckbxSnivy.getText().replaceAll(" ", ""));
        			else
        				chckbxSnivy.setSelected(false);
                }else if(!chckbxSnivy.isSelected()) {
                	int x = User.pokemonList.indexOf(chckbxSnivy.getText().replaceAll(" ", ""));
                	User.pokemonList.remove(x);
                }
        	 
        	
        	
        	System.out.println("Elements of ArrayList are:");
	        for (int i = 0; i < User.pokemonList.size(); i++) {
	            System.out.println(User.pokemonList.get(i) + " ");
	        }

            }

        });
        chckbxSnivy.setForeground(new Color(47, 79, 79));
        chckbxSnivy.setFont(new Font("Tahoma", Font.BOLD, 18));
        chckbxSnivy.setBackground(new Color(0, 255, 153));
        
        JCheckBox chckbxChikorita = new JCheckBox("    Chikorita");
        chckbxChikorita.setBounds(392, 346, 152, 27);
        panel.add(chckbxChikorita);
        chckbxChikorita.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            	if(chckbxChikorita.isSelected()) {
                	if(User.pokemonList.size()<3)
        				User.pokemonList.add(chckbxChikorita.getText().replaceAll(" ", ""));
        			else
        				chckbxChikorita.setSelected(false);
                }else if(!chckbxChikorita.isSelected()) {
                	int x = User.pokemonList.indexOf(chckbxChikorita.getText().replaceAll(" ", ""));
                	User.pokemonList.remove(x);
                }
        	 
        	
        	
        	System.out.println("Elements of ArrayList are:");
	        for (int i = 0; i < User.pokemonList.size(); i++) {
	            System.out.println(User.pokemonList.get(i) + " ");
	        }

            }

        });
        chckbxChikorita.setForeground(new Color(47, 79, 79));
        chckbxChikorita.setFont(new Font("Tahoma", Font.BOLD, 18));
        chckbxChikorita.setBackground(new Color(0, 255, 153));
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("src/gr.png"));
        lblNewLabel.setBounds(2, 0, 909, 567);
        panel.add(lblNewLabel);
        btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
//				ChooseYourAgent cya = new ChooseYourAgent();
//				cya.setVisible(true);

			}

		});

	}
}