package com.tesuan.pokemon;

public class Snivy extends Pokemon implements GrassType {
	
	public Snivy() {
		super("Snivy", "GrassType", 4, GrassType.ATTACK_NAME, GrassType.ATTACK_DMG, GrassType.SPECIAL_ATTACKS, GrassType.SPECIAL_ATTACK_DMG);
		// TODO Auto-generated constructor stub
	}
	
	public double specialAttackDmg(Pokemon p) {
		int x = (int)(Math.random()*(2-0+1)+0);
		if(p.type == "ElectricType") {			
			return SPECIAL_ATTACK_DMG[x]+SPECIAL_ATTACK_DMG[x]*0.5;
		}
		return 0.2*SPECIAL_ATTACK_DMG[x];
	}
	
	public double attackDmg() {
		int x = (int)(Math.random()*(1-0+1)+0);
		return ATTACK_DMG[x];
	}
}
