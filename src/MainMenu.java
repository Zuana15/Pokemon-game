package com.tesuan.pokemon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


import javax.swing.JButton;
import javax.swing.ImageIcon;

public class MainMenu extends JFrame {
	
	private JFrame frame;
	private JPanel panel, panel_1, panel_2;
	private JLabel lblHome;
	private JButton btnNewButton;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 654);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 182, 193));
		contentPane.setBorder(new LineBorder(new Color(0, 51, 204), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 153, 153));
		panel.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panel.setBounds(0, 0, 810, 615);
		contentPane.add(panel);
		panel.setLayout(null);
//		
//				JLabel lblSimpleCalculator = new JLabel(" p");
//				lblSimpleCalculator.setIcon(new ImageIcon("src/pkemon.png"));
//				lblSimpleCalculator.setBounds(48, 32, 715, 217);
//				panel.add(lblSimpleCalculator);
//				lblSimpleCalculator.setForeground(new Color(102, 0, 102));
//				lblSimpleCalculator.setFont(new Font("Tahoma", Font.BOLD, 20));
//				lblSimpleCalculator.setHorizontalAlignment(SwingConstants.CENTER);
				
				JButton btnStartGame = new JButton("Start Game");
				btnStartGame.setIcon(new ImageIcon("C:\\Users\\88015\\YaBoiJuan\\Pokemon2\\src\\sddsd.png"));
				btnStartGame.setSelectedIcon(new ImageIcon("src/sddsd.png"));
				btnStartGame.setBounds(503, 265, 262, 122);
				panel.add(btnStartGame);
				
				JButton btnExit = new JButton("Exit");
				btnExit.setIcon(new ImageIcon("C:\\Users\\88015\\YaBoiJuan\\Pokemon2\\src\\sdsffa.png"));
				btnExit.setSelectedIcon(new ImageIcon("src/sdsffa.png"));
				btnExit.setBounds(503, 398, 262, 122);
				panel.add(btnExit);
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setBounds(0, 0, 810, 615);
				panel.add(lblNewLabel);
				lblNewLabel.setIcon(new ImageIcon("src/Bg11.png"));
				
				btnExit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						System.exit(0);
					}

				});
				btnStartGame.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
						ChooseYourAgent cya = new ChooseYourAgent();
						cya.setVisible(true);

					}

				});
		
		
	}
}