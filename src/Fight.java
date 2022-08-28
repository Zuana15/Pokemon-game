package com.tesuan.pokemon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JProgressBar;

import java.util.*;

public class Fight extends JFrame {

	private JPanel contentPane;
//	static Pokemon userPokemon1, userPokemon2, userPokemon3;
//	static Pokemon botPokemon1, botPokemon2, botPokemon3;
	static Boolean userPlay = true, compPlay = false;
	static ArrayList <Pokemon> pokemons = new ArrayList();
	
	
	/**
	 * Launch the application.
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception, NullPointerException {
		
		pokemons.add(new Squirtle());
		
		pokemons.add(new Froakie());

		pokemons.add(new Tentacruel());

		pokemons.add(new Mudkip());

		pokemons.add(new Piplup());

		pokemons.add(new Charizard());

		pokemons.add(new Magmar());

		pokemons.add(new Blaziken());

		pokemons.add(new Growlith());

		pokemons.add(new Bulbasaur());

		
		pokemons.add(new Sceptile());
		pokemons.add(new Torterra());

		pokemons.add(new Snivy());

		pokemons.add(new Chikorita());
		pokemons.add(new Pikachu());
		pokemons.add(new Manectric());

		pokemons.add(new Electivire());
		 

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fight frame = new Fight();
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
	Pokemon userPokemon1, userPokemon2, userPokemon3;
	Pokemon botPokemon1, botPokemon2, botPokemon3;
	public Fight() {
//		Pokemon userPokemon1 = null, userPokemon2= null, userPokemon3= null;
//		 Pokemon botPokemon1= null, botPokemon2= null, botPokemon3= null;
		 
		
		String[] arr = new String[18];
		arr[0] = "Pikachu";
		arr[1] = "Manectric";
		arr[2] = "Electivire";
		arr[3]="Blaziken";
		arr[4]="Charizard";
		arr[5]="Magmar";
		arr[6]="Moltres";
		arr[7]="Growlith";
		arr[8]="Piplup";
		arr[9]="Squirtle";
		arr[10]="Froakie";
		arr[11]="Tentacruel";
		arr[12]="Mudkip";
		arr[13]="Bulbasaur";
		arr[14]="Sceptile";
		arr[15]="Torterra";
		arr[16]="Snivy";
		arr[17]="Chikorita"; 
		
		int u = (int)(Math.random()*(17-0+1)+0);
		int v = (int)(Math.random()*(17-0+1)+0);
		int w = (int)(Math.random()*(17-0+1)+0);
		
		String xx = arr[u];
		String yy = arr[v];
		String zz= arr[w];
		
		String x = User.pokemonList.get(0);
		System.out.println(x);
		String y = User.pokemonList.get(1);
		System.out.println(y);
		String z = User.pokemonList.get(2);
		System.out.println(z);


		String img1, img2, img3, botimg1, botimg2, botimg3;
		
//		for(Pokemon pokemon: pokemons) {
//			if(pokemon.Name == x) {
//				userPokemon1 = pokemon;
//				}			 
//		}
// 	    for(Pokemon pokemon: pokemons) {
// 			 if(pokemon.Name == y) {
//				userPokemon2 = pokemon;
//			}
// 		}
// 	    for(Pokemon pokemon: pokemons) {
// 			if(pokemon.Name == z) {
//				userPokemon3 = pokemon;
//			}
// 		}
// 		for(Pokemon pokemon: pokemons) {
// 			 if(pokemon.Name == a) {
//				botPokemon1 = pokemon;
//			}
// 		}
// 		for(Pokemon pokemon: pokemons) {
// 			
//			  if(pokemon.Name == b) {
//				botPokemon2 = pokemon;
//			}
// 		}
// 		for(Pokemon pokemon: pokemons) {
// 			 if(pokemon.Name == c) {
//				botPokemon3 = pokemon;
//			}
// 		}
//		//userPokemon1=;
//		//Arraylist <Pokemon> pokemons = all pokemons
//		//for(pokemon in pokemons):
//		//if(pokemon.name == x){
//		//userpokemon1 = pokemon
//		
		
		
		
		if(x.equals("Pikachu")) {
			//System.out.println(x);
			userPokemon1 = new Pikachu();
			//System.out.println(userPokemon1.Name +" Object name");
		}else if(x.equals("Manectric")) {
			userPokemon1 = new Manectric();
		}else if(x.equals("Electivire")) {
			userPokemon1 = new Electivire();
		}
		else if(x.equals("Piplup")) {
			userPokemon1 = new Piplup();
		}else if(x.equals("Squirtle")) {
			userPokemon1 = new Squirtle();
		}else if(x.equals("Froakie")) {
			userPokemon1 = new Froakie();
		}else if(x.equals("Tentacruel")) {
			userPokemon1 = new Tentacruel();
		}else if(x.equals("Mudkip")) {
			userPokemon1 = new Mudkip();
		}
		else if(x.equals("Bulbasaur")) {
			userPokemon1 = new Bulbasaur();
		}else if(x.equals("Sceptile")) {
			userPokemon1 = new Sceptile();
		}else if(x.equals("Torterra")) {
			userPokemon1 = new Torterra();
		}else if(x.equals("Snivy")) {
			userPokemon1 = new Snivy();
		}else if(x.equals("Chikorita")) {
			userPokemon1 = new Chikorita();
		}
		else if(x.equals("Blaziken")) {
			userPokemon1 = new Blaziken();
		}else if(x.equals("Charizard")) {
			userPokemon1 = new Charizard();
		}else if(x.equals("Magmar")) {
			userPokemon1 = new Magmar();
		}else if(x.equals("Moltres")) {
			userPokemon1 = new Moltres();
		}else if(x.equals("Growlith")) {
			userPokemon1 = new Growlith();
		}
		
		// Pokemon No. 2
		
		
		if(y.equals("Pikachu")) {
			//System.out.println(x);
			userPokemon2 = new Pikachu();
			//System.out.println(userPokemon1.Name +" Object name");
		}else if(y.equals("Manectric")) {
			userPokemon2 = new Manectric();
		}else if(y.equals("Electivire")) {
			userPokemon2 = new Electivire();
		}
		else if(y.equals("Piplup")) {
			userPokemon2 = new Piplup();
		}else if(y.equals("Squirtle")) {
			userPokemon2 = new Squirtle();
		}else if(y.equals("Froakie")) {
			userPokemon2 = new Froakie();
		}else if(y.equals("Tentacruel")) {
			userPokemon2 = new Tentacruel();
		}else if(y.equals("Mudkip")) {
			userPokemon2 = new Mudkip();
		}
		else if(y.equals("Bulbasaur")) {
			userPokemon2 = new Bulbasaur();
		}else if(y.equals("Sceptile")) {
			userPokemon2 = new Sceptile();
		}else if(y.equals("Torterra")) {
			userPokemon2 = new Torterra();
		}else if(y.equals("Snivy")) {
			userPokemon2 = new Snivy();
		}else if(y.equals("Chikorita")) {
			userPokemon2 = new Chikorita();
		}
		else if(y.equals("Blaziken")) {
			userPokemon2 = new Blaziken();
		}else if(y.equals("Charizard")) {
			userPokemon2 = new Charizard();
		}else if(y.equals("Magmar")) {
			userPokemon2 = new Magmar();
		}else if(y.equals("Moltres")) {
			userPokemon2 = new Moltres();
		}else if(y.equals("Growlith")) {
			userPokemon2 = new Growlith();
		}
		
		// Pokemon No. 3
		
		
		if(z.equals("Pikachu")) {
			//System.out.println(x);
			userPokemon3 = new Pikachu();
			//System.out.println(userPokemon1.Name +" Object name");
		}else if(z.equals("Manectric")) {
			userPokemon3 = new Manectric();
		}else if(z.equals("Electivire")) {
			userPokemon3 = new Electivire();
		}
		else if(z.equals("Piplup")) {
			userPokemon3 = new Piplup();
		}else if(z.equals("Squirtle")) {
			userPokemon3 = new Squirtle();
		}else if(z.equals("Froakie")) {
			userPokemon3 = new Froakie();
		}else if(z.equals("Tentacruel")) {
			userPokemon3 = new Tentacruel();
		}else if(z.equals("Mudkip")) {
			userPokemon3 = new Mudkip();
		}
		else if(z.equals("Bulbasaur")) {
			userPokemon3 = new Bulbasaur();
		}else if(z.equals("Sceptile")) {
			userPokemon3 = new Sceptile();
		}else if(z.equals("Torterra")) {
			userPokemon3 = new Torterra();
		}else if(z.equals("Snivy")) {
			userPokemon3 = new Snivy();
		}else if(z.equals("Chikorita")) {
			userPokemon3 = new Chikorita();
		}
		else if(z.equals("Blaziken")) {
			userPokemon3 = new Blaziken();
		}else if(z.equals("Charizard")) {
			userPokemon3 = new Charizard();
		}else if(z.equals("Magmar")) {
			userPokemon3 = new Magmar();
		}else if(z.equals("Moltres")) {
			userPokemon3 = new Moltres();
		}else if(z.equals("Growlith")) {
			userPokemon3 = new Growlith();
		}
			
		
// 		CALL CLASS FOR BOTS POKEMON
		
			
		
		if(xx.equals("Pikachu")) {
			botPokemon1 = new Pikachu();
		}else if(xx.equals("Manectric")) {
			botPokemon1 = new Manectric();
		}else if(xx.equals("Electivire")) {
			botPokemon1 = new Electivire();
		}
		else if(xx.equals("Piplup")) {
			botPokemon1 = new Piplup();
		}else if(xx.equals("Squirtle")) {
			botPokemon1 = new Squirtle();
		}else if(xx.equals("Froakie")) {
			botPokemon1 = new Froakie();
		}else if(xx.equals("Tentacruel")) {
			botPokemon1 = new Tentacruel();
		}else if(xx.equals("Mudkip")) {
			botPokemon1 = new Mudkip();
		}
		else if(xx.equals("Bulbasaur")) {
			botPokemon1 = new Bulbasaur();
		}else if(xx.equals("Sceptile")) {
			botPokemon1 = new Sceptile();
		}else if(xx.equals("Torterra")) {
			botPokemon1 = new Torterra();
		}else if(xx.equals("Snivy")) {
			botPokemon1 = new Snivy();
		}else if(xx.equals("Chikorita")) {
			botPokemon1 = new Chikorita();
		}
		else if(xx.equals("Blaziken")) {
			botPokemon1 = new Blaziken();
		}else if(xx.equals("Charizard")) {
			botPokemon1 = new Charizard();
		}else if(xx.equals("Magmar")) {
			botPokemon1 = new Magmar();
		}else if(xx.equals("Moltres")) {
			botPokemon1 = new Moltres();
		}else if(xx.equals("Growlith")) {
			botPokemon1 = new Growlith();
		}
		
		
		// Pokemon No. 2
		
		
		if(yy.equals("Pikachu")) {
			botPokemon2 = new Pikachu();
		}else if(yy.equals("Manectric")) {
			botPokemon2 = new Manectric();
		}else if(yy.equals("Electivire")) {
			botPokemon2 = new Electivire();
		}
		else if(yy.equals("Piplup")) {
			botPokemon2 = new Piplup();
		}else if(yy.equals("Squirtle")) {
			botPokemon2 = new Squirtle();
		}else if(yy.equals("Froakie")) {
			botPokemon2 = new Froakie();
		}else if(yy.equals("Tentacruel")) {
			botPokemon2 = new Tentacruel();
		}else if(yy.equals("Mudkip")) {
			botPokemon2 = new Mudkip();
		}
		else if(yy.equals("Bulbasaur")) {
			botPokemon2 = new Bulbasaur();
		}else if(yy.equals("Sceptile")) {
			botPokemon2 = new Sceptile();
		}else if(yy.equals("Torterra")) {
			botPokemon2 = new Torterra();
		}else if(yy.equals("Snivy")) {
			botPokemon2 = new Snivy();
		}else if(yy.equals("Chikorita")) {
			botPokemon2 = new Chikorita();
		}
		else if(yy.equals("Blaziken")) {
			botPokemon2 = new Blaziken();
		}else if(yy.equals("Charizard")) {
			botPokemon2 = new Charizard();
		}else if(yy.equals("Magmar")) {
			botPokemon2 = new Magmar();
		}else if(yy.equals("Moltres")) {
			botPokemon2 = new Moltres();
		}else if(yy.equals("Growlith")) {
			botPokemon2 = new Growlith();
		}
		
		// Pokemon No. 3
		
		
		if(zz.equals("Pikachu")) {
			botPokemon3 = new Pikachu();
		}else if(zz.equals("Manectric")) {
			botPokemon3 = new Manectric();
		}else if(zz.equals("Electivire")) {
			botPokemon3 = new Electivire();
		}
		else if(zz.equals("Piplup")) {
			botPokemon3 = new Piplup();
		}else if(zz.equals("Squirtle")) {
			botPokemon3 = new Squirtle();
		}else if(zz.equals("Froakie")) {
			botPokemon3 = new Froakie();
		}else if(zz.equals("Tentacruel")) {
			botPokemon3 = new Tentacruel();
		}else if(zz.equals("Mudkip")) {
			botPokemon3 = new Mudkip();
		}
		else if(zz.equals("Bulbasaur")) {
			botPokemon3 = new Bulbasaur();
		}else if(zz.equals("Sceptile")) {
			botPokemon3 = new Sceptile();
		}else if(zz.equals("Torterra")) {
			botPokemon3 = new Torterra();
		}else if(zz.equals("Snivy")) {
			botPokemon3 = new Snivy();
		}else if(zz.equals("Chikorita")) {
			botPokemon3 = new Chikorita();
		}
		else if(zz.equals("Blaziken")) {
			botPokemon3 = new Blaziken();
		}else if(zz.equals("Charizard")) {
			botPokemon3 = new Charizard();
		}else if(zz.equals("Magmar")) {
			botPokemon3 = new Magmar();
		}else if(zz.equals("Moltres")) {
			botPokemon3 = new Moltres();
		}else if(zz.equals("Growlith")) {
			botPokemon3 = new Growlith();
		}
		
		
		img1 = "src/Poki/" + userPokemon1.Name + ".png";
		img2 = "src/Poki/" + userPokemon2.Name + ".png";
		img3 = "src/Poki/" + userPokemon3.Name + ".png";
		
		botimg1 = "src/Poki/" + botPokemon1.Name + "2.png";
		botimg2 = "src/Poki/" + botPokemon2.Name + "2.png";
		botimg3 = "src/Poki/" + botPokemon3.Name + "2.png";
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1035, 834);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 51, 204), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 128, 128));
		panel.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panel.setBounds(10, 11, 999, 777);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSend = new JLabel("");
		lblSend.setForeground(new Color(240, 255, 255));
		lblSend.setBounds(20, 244, 199, 27);
		panel.add(lblSend);
		lblSend.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblSend.setBackground(new Color(0, 0, 0));
		lblSend.setText("You sent " + userPokemon1.Name);
		//userPokemon1.Name
		JLabel lblBotSend = new JLabel("You sent <dynamic>");
		lblBotSend.setForeground(new Color(224, 255, 255));
		lblBotSend.setBounds(535, 244, 199, 27);
		panel.add(lblBotSend);
		lblBotSend.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblBotSend.setBackground(new Color(0, 0, 0));
		lblBotSend.setText("Opponent sent " + botPokemon1.Name);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(173, 216, 230));
			panel_1.setBounds(10, 170, 468, 58);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblUserFeed = new JLabel("feed");
			lblUserFeed.setBounds(10, 0, 330, 27);
			panel_1.add(lblUserFeed);
			lblUserFeed.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblUserFeed.setBackground(new Color(144, 238, 144));
			
			JPanel panel_1_1 = new JPanel();
			panel_1_1.setBackground(new Color(255, 182, 193));
			panel_1_1.setLayout(null);
			panel_1_1.setBounds(521, 170, 468, 58);
			panel.add(panel_1_1);
			//botPokemon1.Name
			JLabel lblBotFeed = new JLabel("feed");
			lblBotFeed.setBounds(10, 0, 330, 27);
			panel_1_1.add(lblBotFeed);
			lblBotFeed.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblBotFeed.setBackground(new Color(144, 238, 144));
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(new Color(0, 0, 0));
			panel_2.setBounds(10, 287, 979, 479);
			panel.add(panel_2);
			panel_2.setLayout(null);
				
				
				JLabel lblbotPokemonImg = new JLabel("");
				lblbotPokemonImg.setBounds(652, 117, 216, 263);
				panel_2.add(lblbotPokemonImg);
				lblbotPokemonImg.setIcon(new ImageIcon(botimg1));
				
				JLabel lbluserPokemonImg = new JLabel("");
				lbluserPokemonImg.setBounds(247, 117, 216, 263);
				panel_2.add(lbluserPokemonImg);
				lbluserPokemonImg.setIcon(new ImageIcon(img1));
			
			
			
			

			
			
			
			
				
				
				JButton btnheal = new JButton(" ");
				btnheal.setIcon(new ImageIcon("src/Heal.png"));
				btnheal.setBounds(160, 332, 70, 70);
				panel_2.add(btnheal);
				btnheal.setSelectedIcon(new ImageIcon("src/Heal.png"));
				
				JButton btnspAttack = new JButton(" ");
				btnspAttack.setIcon(new ImageIcon("src/sattkbtn.png"));
				btnspAttack.setBounds(22, 334, 120, 120);
				panel_2.add(btnspAttack);
				btnspAttack.setSelectedIcon(new ImageIcon("src/sattkbtn.png"));
				
				JLabel lblNewLabel_1 = new JLabel("New label");
				lblNewLabel_1.setBounds(427, 11, 125, 63);
				panel_2.add(lblNewLabel_1);
				lblNewLabel_1.setIcon(new ImageIcon("src/vs.png"));
				
				JLabel lblNewLabel_3 = new JLabel("New label");
				lblNewLabel_3.setIcon(new ImageIcon("src/playgr.png"));
				lblNewLabel_3.setBounds(10, 11, 959, 457);
				panel_2.add(lblNewLabel_3);
				
				
				
				
				
				
	
				
				JPanel panel_3 = new JPanel();
				panel_3.setBounds(10, 124, 468, 43);
				panel.add(panel_3);
				panel_3.setLayout(null);
				
				JProgressBar userHealthBar = new JProgressBar();
				userHealthBar.setBounds(10, 11, 448, 21);
				panel_3.add(userHealthBar);
				userHealthBar.setForeground(new Color(0, 255, 127));
				
				JPanel panel_3_1 = new JPanel();
				panel_3_1.setLayout(null);
				panel_3_1.setBounds(521, 124, 468, 43);
				panel.add(panel_3_1);
				
				JProgressBar botHealthBar = new JProgressBar();
				botHealthBar.setBounds(10, 11, 448, 21);
				panel_3_1.add(botHealthBar);
				botHealthBar.setForeground(new Color(220, 20, 60));
				
				JPanel panel_4 = new JPanel();
				panel_4.setBackground(new Color(0, 139, 139));
				panel_4.setBounds(10, 233, 468, 47);
				panel.add(panel_4);
				
				JPanel panel_4_1 = new JPanel();
				panel_4_1.setBackground(new Color(250, 128, 114));
				panel_4_1.setBounds(521, 233, 468, 47);
				panel.add(panel_4_1);
				
				JLabel lblNewLabel = new JLabel("New label");
				lblNewLabel.setIcon(new ImageIcon("src/batttle.png"));
				lblNewLabel.setBounds(165, 25, 649, 86);
				panel.add(lblNewLabel);
				
				JLabel lblNewLabel_2 = new JLabel("You");
				lblNewLabel_2.setForeground(new Color(255, 255, 255));
				lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
				lblNewLabel_2.setBounds(43, 63, 90, 69);
				panel.add(lblNewLabel_2);
				
				JLabel lblNewLabel_2_1 = new JLabel("Opponent");
				lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
				lblNewLabel_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
				lblNewLabel_2_1.setBounds(821, 63, 190, 69);
				panel.add(lblNewLabel_2_1);
				
				JLabel lblNewLabel_4 = new JLabel("New label");
				lblNewLabel_4.setIcon(new ImageIcon("src/wood9977.png"));
				lblNewLabel_4.setBounds(0, 0, 999, 777);
				panel.add(lblNewLabel_4);
		
		
		
		

		
		
		JButton btnattack = new JButton("");
		btnattack.setIcon(new ImageIcon("src/attkbttn.png"));
		btnattack.setBounds(22, 200, 100, 100);
		panel_2.add(btnattack);
		btnattack.setSelectedIcon(new ImageIcon("src/attkbttn.png"));
		
		btnattack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblSend.setText(" ");
				
				
				lblBotSend.setText(" ");
				
				
				if(!userPokemon1.isFainted()) {
					if(userPlay) {
						if(!botPokemon1.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon1.attackDmg();
							botPokemon1.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon1.getHealth());
							lblUserFeed.setText(userPokemon1.Name + " hit " + botPokemon1.Name + " for " + dmg + " damage!");
							if(botPokemon1.isFainted()) {
								lblBotFeed.setText(botPokemon1.Name + " has fainted!");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								lblBotSend.setText("Bot has sent " + botPokemon2.Name);
						
								lblbotPokemonImg.setIcon(new ImageIcon(botimg2));
								botHealthBar.setValue((int)botPokemon2.getHealth());
							}
//							try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon1.attackDmg();
								userPokemon1.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon1.getHealth());
								lblBotFeed.setText(botPokemon1.Name + " hit " + userPokemon1.Name + " for " + dmg1 + " damage!");
								if(userPokemon1.isFainted()) {
									lblUserFeed.setText(userPokemon1.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
						
									lbluserPokemonImg.setIcon(new ImageIcon(img2));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
								
							}else {
								double dmg1 = botPokemon1.specialAttackDmg(userPokemon1);
								userPokemon1.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon1.getHealth());
								lblBotFeed.setText(botPokemon1.Name + " hit " + userPokemon1.Name + " for " + dmg1 + " damage!");
								if(userPokemon1.isFainted()) {
									lblUserFeed.setText(userPokemon1.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
						
									lbluserPokemonImg.setIcon(new ImageIcon(img2));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
							}
							
						
							
						}else if(!botPokemon2.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon1.attackDmg();
							botPokemon2.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon2.getHealth());
							lblUserFeed.setText(userPokemon1.Name + " hit " + botPokemon2.Name + " for " + dmg + " damage!");
							if(botPokemon2.isFainted()) {
								lblBotFeed.setText(botPokemon2.Name + " has fainted!");
								try {
									Thread.sleep(2000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								lblBotSend.setText("Bot has sent " + botPokemon3.Name);
				
								lblbotPokemonImg.setIcon(new ImageIcon(botimg3));
								botHealthBar.setValue((int)botPokemon3.getHealth());
							}
//							try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon2.attackDmg();
								userPokemon1.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon1.getHealth());
								lblBotFeed.setText(botPokemon2.Name + " hit " + userPokemon1.Name + " for " + dmg1 + " damage!");
								if(userPokemon1.isFainted()) {
									lblUserFeed.setText(userPokemon1.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
							
									lbluserPokemonImg.setIcon(new ImageIcon(img2));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
								
							}else {
								double dmg1 = botPokemon2.specialAttackDmg(userPokemon1);
								userPokemon1.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon1.getHealth());
								lblBotFeed.setText(botPokemon2.Name + " hit " + userPokemon1.Name + " for " + dmg1 + " damage!");
								if(userPokemon1.isFainted()) {
									lblUserFeed.setText(userPokemon1.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
								
									lbluserPokemonImg.setIcon(new ImageIcon(img2));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
							}
							
						
							
						}else if(!botPokemon3.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon1.attackDmg();
							botPokemon3.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon3.getHealth());
							lblUserFeed.setText(userPokemon1.Name + " hit " + botPokemon3.Name + " for " + dmg + " damage!");
							if(botPokemon3.isFainted()) {
								lblBotFeed.setText(botPokemon3.Name + " has fainted!");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								dispose();
								Win w = new Win();
								w.setVisible(true);									
							}
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon3.attackDmg();
								userPokemon1.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon1.getHealth());
								lblBotFeed.setText(botPokemon3.Name + " hit " + userPokemon1.Name + " for " + dmg1 + " damage!");
								if(userPokemon1.isFainted()) {
									lblBotFeed.setText(userPokemon1.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
							
									lbluserPokemonImg.setIcon(new ImageIcon(img2));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
								
							}else {
								double dmg1 = botPokemon3.specialAttackDmg(userPokemon1);
								userPokemon1.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon1.getHealth());
								lblBotFeed.setText(botPokemon3.Name + " hit " + userPokemon1.Name + " for " + dmg1 + " damage!");
								if(userPokemon1.isFainted()) {
									lblBotFeed.setText(userPokemon1.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
								
									lbluserPokemonImg.setIcon(new ImageIcon(img2));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
							}
							
						
							
						}
													
					}
					
	// For second PokemON
					
				}else if(!userPokemon2.isFainted()) {
					if(userPlay) {
						if(!botPokemon1.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon2.attackDmg();
							botPokemon1.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon1.getHealth());
							lblUserFeed.setText(userPokemon2.Name + " hit " + botPokemon1.Name + " for " + dmg + " damage!");
							if(botPokemon1.isFainted()) {
								lblBotFeed.setText(botPokemon1.Name + " has fainted!");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								lblBotSend.setText("Bot has sent " + botPokemon2.Name);
								
								lblbotPokemonImg.setIcon(new ImageIcon(botimg2));
								botHealthBar.setValue((int)botPokemon2.getHealth());
							}
//							try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon1.attackDmg();
								userPokemon1.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon2.getHealth());
								lblBotFeed.setText(botPokemon1.Name + " hit " + userPokemon1.Name + " for " + dmg1 + " damage!");
								if(userPokemon2.isFainted()) {
									lblUserFeed.setText(userPokemon2.Name + " has fainted!");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon3.Name);
								
									lbluserPokemonImg.setIcon(new ImageIcon(img3));
									userHealthBar.setValue((int)userPokemon3.getHealth());
								}
								
							}else {
								double dmg1 = botPokemon1.specialAttackDmg(userPokemon2);
								userPokemon2.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon2.getHealth());
								lblBotFeed.setText(botPokemon1.Name + " hit " + userPokemon1.Name + " for " + dmg1 + " damage!");
								if(userPokemon2.isFainted()) {
									lblUserFeed.setText(userPokemon2.Name + " has fainted!");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon3.Name);
								
									lbluserPokemonImg.setIcon(new ImageIcon(img3));
									userHealthBar.setValue((int)userPokemon3.getHealth());
								}
							}
							
						
							
						}else if(!botPokemon2.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon2.attackDmg();
							botPokemon2.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon2.getHealth());
							lblUserFeed.setText(userPokemon2.Name + " hit " + botPokemon2.Name + " for " + dmg + " damage!");
							if(botPokemon2.isFainted()) {
								lblBotFeed.setText(botPokemon2.Name + " has fainted!");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								lblBotSend.setText("Bot has sent " + botPokemon3.Name);
							
								lblbotPokemonImg.setIcon(new ImageIcon(botimg3));
								botHealthBar.setValue((int)botPokemon3.getHealth());
							}
//							try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon2.attackDmg();
								userPokemon2.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon2.getHealth());
								lblBotFeed.setText(botPokemon2.Name + " hit " + userPokemon2.Name + " for " + dmg1 + " damage!");
								if(userPokemon2.isFainted()) {
									lblUserFeed.setText(userPokemon2.Name + " has fainted!");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon3.Name);
								
									lbluserPokemonImg.setIcon(new ImageIcon(img3));
									userHealthBar.setValue((int)userPokemon3.getHealth());
								}
								
							}else {
								double dmg1 = botPokemon2.specialAttackDmg(userPokemon2);
								userPokemon2.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon2.getHealth());
								lblBotFeed.setText(botPokemon2.Name + " hit " + userPokemon2.Name + " for " + dmg1 + " damage!");
								if(userPokemon2.isFainted()) {
									lblUserFeed.setText(userPokemon2.Name + " has fainted!");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon3.Name);
								
									lbluserPokemonImg.setIcon(new ImageIcon(img3));
									userHealthBar.setValue((int)userPokemon3.getHealth());
								}
							}
							
						
							
						}else if(!botPokemon3.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon2.attackDmg();
							botPokemon3.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon3.getHealth());
							lblUserFeed.setText(userPokemon2.Name + " hit " + botPokemon3.Name + " for " + dmg + " damage!");
							if(botPokemon3.isFainted()) {
								lblBotFeed.setText(botPokemon3.Name + " has fainted!");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								dispose();
								Win w = new Win();
								w.setVisible(true);									
							}
//							try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon3.attackDmg();
								userPokemon2.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon2.getHealth());
								lblBotFeed.setText(botPokemon3.Name + " hit " + userPokemon2.Name + " for " + dmg1 + " damage!");
								if(userPokemon2.isFainted()) {
									lblBotFeed.setText(userPokemon2.Name + " has fainted!");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon3.Name);
								
									lbluserPokemonImg.setIcon(new ImageIcon(img3));
									userHealthBar.setValue((int)userPokemon3.getHealth());
								}
								
							}else {
								double dmg1 = botPokemon3.specialAttackDmg(userPokemon1);
								userPokemon2.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon2.getHealth());
								lblBotFeed.setText(botPokemon3.Name + " hit " + userPokemon2.Name + " for " + dmg1 + " damage!");
								if(userPokemon2.isFainted()) {
									lblBotFeed.setText(userPokemon2.Name + " has fainted!");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon3.Name);
									
									lbluserPokemonImg.setIcon(new ImageIcon(img3));
									userHealthBar.setValue((int)userPokemon3.getHealth());
								}
							}
							
						
							
						}
													
					}
		// FOR THIRD POKEMOn
				}else if(!userPokemon3.isFainted()) {
					if(userPlay) {
						if(!botPokemon1.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon3.attackDmg();
							botPokemon1.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon1.getHealth());
							lblUserFeed.setText(userPokemon3.Name + " hit " + botPokemon1.Name + " for " + dmg + " damage!");
							if(botPokemon1.isFainted()) {
								lblBotFeed.setText(botPokemon1.Name + " has fainted!");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								lblBotSend.setText("Bot has sent " + botPokemon2.Name);
							
								lblbotPokemonImg.setIcon(new ImageIcon(botimg2));
								botHealthBar.setValue((int)botPokemon2.getHealth());
							}
//							try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon1.attackDmg();
								userPokemon3.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon3.getHealth());
								lblBotFeed.setText(botPokemon1.Name + " hit " + userPokemon3.Name + " for " + dmg1 + " damage!");
								if(userPokemon3.isFainted()) {
									lblUserFeed.setText(userPokemon3.Name + " has fainted!");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									dispose();
									Lose l = new Lose();
									l.setVisible(true);
									
								}
								
							}else {
								double dmg1 = botPokemon1.specialAttackDmg(userPokemon3);
								userPokemon3.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon3.getHealth());
								lblBotFeed.setText(botPokemon1.Name + " hit " + userPokemon3.Name + " for " + dmg1 + " damage!");
								if(userPokemon3.isFainted()) {
									lblUserFeed.setText(userPokemon3.Name + " has fainted!");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									dispose();
									Lose l = new Lose();
									l.setVisible(true);
								}
							}
							
						
							
						}else if(!botPokemon2.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon3.attackDmg();
							botPokemon2.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon2.getHealth());
							lblUserFeed.setText(userPokemon3.Name + " hit " + botPokemon2.Name + " for " + dmg + " damage!");
							if(botPokemon2.isFainted()) {
								lblBotFeed.setText(botPokemon2.Name + " has fainted!");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								lblBotSend.setText("Bot has sent " + botPokemon3.Name);
								
								lblbotPokemonImg.setIcon(new ImageIcon(botimg3));
								botHealthBar.setValue((int)botPokemon3.getHealth());
							}
//							try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon2.attackDmg();
								userPokemon3.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon3.getHealth());
								lblBotFeed.setText(botPokemon2.Name + " hit " + userPokemon3.Name + " for " + dmg1 + " damage!");
								if(userPokemon3.isFainted()) {
									lblUserFeed.setText(userPokemon3.Name + " has fainted!");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									dispose();
									Lose l = new Lose();
									l.setVisible(true);
								}
								
							}else {
								double dmg1 = botPokemon2.specialAttackDmg(userPokemon3);
								userPokemon3.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon3.getHealth());
								lblBotFeed.setText(botPokemon2.Name + " hit " + userPokemon3.Name + " for " + dmg1 + " damage!");
								if(userPokemon3.isFainted()) {
									lblUserFeed.setText(userPokemon3.Name + " has fainted!");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									dispose();
									Lose l = new Lose();
									l.setVisible(true);
								}
							}
							
						
							
						}else if(!botPokemon3.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon3.attackDmg();
							botPokemon3.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon3.getHealth());
							lblUserFeed.setText(userPokemon3.Name + " hit " + botPokemon3.Name + " for " + dmg + " damage!");
							if(botPokemon3.isFainted()) {
								lblBotFeed.setText(botPokemon3.Name + " has fainted!");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								dispose();
								Win w = new Win();
								w.setVisible(true);									
							}
//							try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon3.attackDmg();
								userPokemon3.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon3.getHealth());
								lblBotFeed.setText(botPokemon3.Name + " hit " + userPokemon3.Name + " for " + dmg1 + " damage!");
								if(userPokemon3.isFainted()) {
									lblBotFeed.setText(userPokemon3.Name + " has fainted!");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									dispose();
									Lose l = new Lose();
									l.setVisible(true);
								}
								
							}else {
								double dmg1 = botPokemon3.specialAttackDmg(userPokemon3);
								userPokemon3.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon3.getHealth());
								lblBotFeed.setText(botPokemon3.Name + " hit " + userPokemon3.Name + " for " + dmg1 + " damage!");
								if(userPokemon3.isFainted()) {
									lblBotFeed.setText(userPokemon3.Name + " has fainted!");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									dispose();
									Lose l = new Lose();
									l.setVisible(true);
								}
							}
							
						
							
						}
													
					}
				}
				
				
				
		
				
				
				
				
			}

		});
		
		btnspAttack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblSend.setText(" ");
				
				
				lblBotSend.setText(" ");
				
				
				if(!userPokemon1.isFainted()) {
					if(userPlay) {
						if(!botPokemon1.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon1.specialAttackDmg(botPokemon1);
							botPokemon1.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon1.getHealth());
							lblUserFeed.setText(userPokemon1.Name + " hit " + botPokemon1.Name + " for " + dmg + " damage!");
							if(botPokemon1.isFainted()) {
								lblBotFeed.setText(botPokemon1.Name + " has fainted!");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								lblBotSend.setText("Bot has sent " + botPokemon2.Name);
								lblbotPokemonImg.setIcon(new ImageIcon(botimg2));
								botHealthBar.setValue((int)botPokemon2.getHealth());
							}
//							try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon1.attackDmg();
								userPokemon1.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon1.getHealth());
								lblBotFeed.setText(botPokemon1.Name + " hit " + userPokemon1.Name + " for " + dmg1 + " damage!");
								if(userPokemon1.isFainted()) {
									lblUserFeed.setText(userPokemon1.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
									lbluserPokemonImg.setIcon(new ImageIcon(img2));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
								
							}else {
								double dmg1 = botPokemon1.specialAttackDmg(userPokemon1);
								userPokemon1.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon1.getHealth());
								lblBotFeed.setText(botPokemon1.Name + " hit " + userPokemon1.Name + " for " + dmg1 + " damage!");
								if(userPokemon1.isFainted()) {
									lblUserFeed.setText(userPokemon1.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
									lbluserPokemonImg.setIcon(new ImageIcon(img2));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
							}
							
						
							
						}else if(!botPokemon2.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon1.specialAttackDmg(botPokemon2);
							botPokemon2.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon2.getHealth());
							lblUserFeed.setText(userPokemon1.Name + " hit " + botPokemon2.Name + " for " + dmg + " damage!");
							if(botPokemon2.isFainted()) {
								lblBotFeed.setText(botPokemon2.Name + " has fainted!");
								try {
									Thread.sleep(2000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								lblBotSend.setText("Bot has sent " + botPokemon3.Name);
								lblbotPokemonImg.setIcon(new ImageIcon(botimg3));
								botHealthBar.setValue((int)botPokemon3.getHealth());
							}
//							try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon2.attackDmg();
								userPokemon1.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon1.getHealth());
								lblBotFeed.setText(botPokemon2.Name + " hit " + userPokemon1.Name + " for " + dmg1 + " damage!");
								if(userPokemon1.isFainted()) {
									lblUserFeed.setText(userPokemon1.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
									lbluserPokemonImg.setIcon(new ImageIcon(img2));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
								
							}else {
								double dmg1 = botPokemon2.specialAttackDmg(userPokemon1);
								userPokemon1.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon1.getHealth());
								lblBotFeed.setText(botPokemon2.Name + " hit " + userPokemon1.Name + " for " + dmg1 + " damage!");
								if(userPokemon1.isFainted()) {
									lblUserFeed.setText(userPokemon1.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
									lbluserPokemonImg.setIcon(new ImageIcon(img2));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
							}
							
						
							
						}else if(!botPokemon3.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon1.specialAttackDmg(botPokemon3);
							botPokemon3.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon3.getHealth());
							lblUserFeed.setText(userPokemon1.Name + " hit " + botPokemon3.Name + " for " + dmg + " damage!");
							if(botPokemon3.isFainted()) {
								lblBotFeed.setText(botPokemon3.Name + " has fainted!");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								dispose();
								Win w = new Win();
								w.setVisible(true);									
							}
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon3.attackDmg();
								userPokemon1.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon1.getHealth());
								lblBotFeed.setText(botPokemon3.Name + " hit " + userPokemon1.Name + " for " + dmg1 + " damage!");
								if(userPokemon1.isFainted()) {
									lblBotFeed.setText(userPokemon1.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
									lbluserPokemonImg.setIcon(new ImageIcon(img2));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
								
							}else {
								double dmg1 = botPokemon3.specialAttackDmg(userPokemon1);
								userPokemon1.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon1.getHealth());
								lblBotFeed.setText(botPokemon3.Name + " hit " + userPokemon1.Name + " for " + dmg1 + " damage!");
								if(userPokemon1.isFainted()) {
									lblBotFeed.setText(userPokemon1.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
									lbluserPokemonImg.setIcon(new ImageIcon(img2));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
							}
							
						
							
						}
													
					}
					
	// For second PokemON
					
				}else if(!userPokemon2.isFainted()) {
					if(userPlay) {
						if(!botPokemon1.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon2.specialAttackDmg(botPokemon1);
							botPokemon1.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon1.getHealth());
							lblUserFeed.setText(userPokemon2.Name + " hit " + botPokemon1.Name + " for " + dmg + " damage!");
							if(botPokemon1.isFainted()) {
								lblBotFeed.setText(botPokemon1.Name + " has fainted!");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								lblBotSend.setText("Bot has sent " + botPokemon2.Name);
								lblbotPokemonImg.setIcon(new ImageIcon(botimg2));
								botHealthBar.setValue((int)botPokemon2.getHealth());
							}
//							try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon1.attackDmg();
								userPokemon2.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon2.getHealth());
								lblBotFeed.setText(botPokemon1.Name + " hit " + userPokemon2.Name + " for " + dmg1 + " damage!");
								if(userPokemon2.isFainted()) {
									lblUserFeed.setText(userPokemon2.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
									lbluserPokemonImg.setIcon(new ImageIcon(img3));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
								
							}else {
								double dmg1 = botPokemon1.specialAttackDmg(userPokemon2);
								userPokemon2.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon2.getHealth());
								lblBotFeed.setText(botPokemon1.Name + " hit " + userPokemon2.Name + " for " + dmg1 + " damage!");
								if(userPokemon2.isFainted()) {
									lblUserFeed.setText(userPokemon2.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
									lbluserPokemonImg.setIcon(new ImageIcon(img3));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
							}
							
						
							
						}else if(!botPokemon2.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon2.specialAttackDmg(botPokemon2);
							botPokemon2.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon2.getHealth());
							lblUserFeed.setText(userPokemon2.Name + " hit " + botPokemon2.Name + " for " + dmg + " damage!");
							if(botPokemon2.isFainted()) {
								lblBotFeed.setText(botPokemon2.Name + " has fainted!");
								try {
									Thread.sleep(2000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								lblBotSend.setText("Bot has sent " + botPokemon3.Name);
								lblbotPokemonImg.setIcon(new ImageIcon(botimg3));
								botHealthBar.setValue((int)botPokemon3.getHealth());
							}
//							try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon2.attackDmg();
								userPokemon2.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon2.getHealth());
								lblBotFeed.setText(botPokemon2.Name + " hit " + userPokemon2.Name + " for " + dmg1 + " damage!");
								if(userPokemon2.isFainted()) {
									lblUserFeed.setText(userPokemon2.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
									lbluserPokemonImg.setIcon(new ImageIcon(img3));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
								
							}else {
								double dmg1 = botPokemon2.specialAttackDmg(userPokemon2);
								userPokemon2.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon2.getHealth());
								lblBotFeed.setText(botPokemon2.Name + " hit " + userPokemon2.Name + " for " + dmg1 + " damage!");
								if(userPokemon2.isFainted()) {
									lblUserFeed.setText(userPokemon2.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
									lbluserPokemonImg.setIcon(new ImageIcon(img3));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
							}
							
						
							
						}else if(!botPokemon3.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon2.specialAttackDmg(botPokemon3);
							botPokemon3.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon3.getHealth());
							lblUserFeed.setText(userPokemon2.Name + " hit " + botPokemon3.Name + " for " + dmg + " damage!");
							if(botPokemon3.isFainted()) {
								lblBotFeed.setText(botPokemon3.Name + " has fainted!");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								dispose();
								Win w = new Win();
								w.setVisible(true);									
							}
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon3.attackDmg();
								userPokemon2.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon2.getHealth());
								lblBotFeed.setText(botPokemon3.Name + " hit " + userPokemon2.Name + " for " + dmg1 + " damage!");
								if(userPokemon2.isFainted()) {
									lblBotFeed.setText(userPokemon2.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
									lbluserPokemonImg.setIcon(new ImageIcon(img3));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
								
							}else {
								double dmg1 = botPokemon3.specialAttackDmg(userPokemon1);
								userPokemon2.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon2.getHealth());
								lblBotFeed.setText(botPokemon3.Name + " hit " + userPokemon2.Name + " for " + dmg1 + " damage!");
								if(userPokemon2.isFainted()) {
									lblBotFeed.setText(userPokemon2.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									lblSend.setText("You sent " + userPokemon2.Name);
									lbluserPokemonImg.setIcon(new ImageIcon(img3));
									userHealthBar.setValue((int)userPokemon2.getHealth());
								}
							}
							
						
							
						}
													
					
													
					}
		// FOR THIRD POKEMOn
				}else if(!userPokemon3.isFainted()) {
					if(userPlay) {
						if(!botPokemon1.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon3.specialAttackDmg(botPokemon1);
							botPokemon1.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon1.getHealth());
							lblUserFeed.setText(userPokemon3.Name + " hit " + botPokemon1.Name + " for " + dmg + " damage!");
							if(botPokemon1.isFainted()) {
								lblBotFeed.setText(botPokemon1.Name + " has fainted!");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								lblBotSend.setText("Bot has sent " + botPokemon2.Name);
								lblbotPokemonImg.setIcon(new ImageIcon(botimg2));
								botHealthBar.setValue((int)botPokemon2.getHealth());
							}
//							try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon1.attackDmg();
								userPokemon3.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon3.getHealth());
								lblBotFeed.setText(botPokemon1.Name + " hit " + userPokemon3.Name + " for " + dmg1 + " damage!");
								if(userPokemon3.isFainted()) {
									lblUserFeed.setText(userPokemon3.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									dispose();
									Lose l = new Lose();
									l.setVisible(true);
									
								
								}
								
							}else {
								double dmg1 = botPokemon1.specialAttackDmg(userPokemon3);
								userPokemon3.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon3.getHealth());
								lblBotFeed.setText(botPokemon1.Name + " hit " + userPokemon3.Name + " for " + dmg1 + " damage!");
								if(userPokemon3.isFainted()) {
									lblUserFeed.setText(userPokemon3.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									dispose();
									Lose l = new Lose();
									l.setVisible(true);
								}
							}
							
						
							
						}else if(!botPokemon2.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon3.specialAttackDmg(botPokemon2);
							botPokemon2.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon2.getHealth());
							lblUserFeed.setText(userPokemon3.Name + " hit " + botPokemon2.Name + " for " + dmg + " damage!");
							if(botPokemon2.isFainted()) {
								lblBotFeed.setText(botPokemon2.Name + " has fainted!");
								try {
									Thread.sleep(2000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								lblBotSend.setText("Bot has sent " + botPokemon3.Name);
								lblbotPokemonImg.setIcon(new ImageIcon(botimg3));
								botHealthBar.setValue((int)botPokemon3.getHealth());
							}
//							try {
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon2.attackDmg();
								userPokemon3.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon3.getHealth());
								lblBotFeed.setText(botPokemon2.Name + " hit " + userPokemon3.Name + " for " + dmg1 + " damage!");
								if(userPokemon3.isFainted()) {
									lblUserFeed.setText(userPokemon3.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									dispose();
									Lose l = new Lose();
									l.setVisible(true);
								}
								
							}else {
								double dmg1 = botPokemon2.specialAttackDmg(userPokemon3);
								userPokemon3.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon3.getHealth());
								lblBotFeed.setText(botPokemon2.Name + " hit " + userPokemon3.Name + " for " + dmg1 + " damage!");
								if(userPokemon3.isFainted()) {
									lblUserFeed.setText(userPokemon3.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									dispose();
									Lose l = new Lose();
									l.setVisible(true);
								}
							}
							
						
							
						}else if(!botPokemon3.isFainted()) {
		//					lblFeed.setText(botPokemon1.Name + " has fainted!");
							double dmg = userPokemon3.specialAttackDmg(botPokemon3);
							botPokemon3.damageTaken(dmg);
							botHealthBar.setValue((int)botPokemon3.getHealth());
							lblUserFeed.setText(userPokemon3.Name + " hit " + botPokemon3.Name + " for " + dmg + " damage!");
							if(botPokemon3.isFainted()) {
								lblBotFeed.setText(botPokemon3.Name + " has fainted!");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								dispose();
								Win w = new Win();
								w.setVisible(true);									
							}
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							int x = (int)(Math.random()*(1-0+1)+0);
							if(x==1) {
								double dmg1 = botPokemon3.attackDmg();
								userPokemon3.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon3.getHealth());
								lblBotFeed.setText(botPokemon3.Name + " hit " + userPokemon3.Name + " for " + dmg1 + " damage!");
								if(userPokemon3.isFainted()) {
									lblBotFeed.setText(userPokemon3.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									dispose();
									Lose l = new Lose();
									l.setVisible(true);
								}
								
							}else {
								double dmg1 = botPokemon3.specialAttackDmg(userPokemon3);
								userPokemon3.damageTaken(dmg1);
								userHealthBar.setValue((int)userPokemon3.getHealth());
								lblBotFeed.setText(botPokemon3.Name + " hit " + userPokemon3.Name + " for " + dmg1 + " damage!");
								if(userPokemon3.isFainted()) {
									lblBotFeed.setText(userPokemon3.Name + " has fainted!");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									dispose();
									Lose l = new Lose();
									l.setVisible(true);
								}
							}
														
						}
																										
					}
							
				}
								
			}

		});
		
		
		btnheal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!userPokemon1.isFainted()) {
					userPokemon1.useHeal();
					userHealthBar.setValue((int)userPokemon1.getHealth());
				}else if(!userPokemon2.isFainted()) {
					userPokemon2.useHeal();
					userHealthBar.setValue((int)userPokemon2.getHealth());
				}else if(!userPokemon3.isFainted()) {
					userPokemon3.useHeal();
					userHealthBar.setValue((int)userPokemon3.getHealth());
				}
				
			}

		});
	
		
		
		
		
	}
}