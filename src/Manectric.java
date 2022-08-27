package com.tesuan.pokemon;

public class Manectric extends Pokemon implements ElectricType{
	
	public Manectric() {
		super("Manectric", "ElectricType", 2, ElectricType.ATTACK_NAME, ElectricType.ATTACK_DMG, ElectricType.SPECIAL_ATTACKS, ElectricType.SPECIAL_ATTACK_DMG);

	}
	
	public double specialAttackDmg(Pokemon p) {
		int x = (int)(Math.random()*(2-0+1)+0);
		if(p.type == "WaterType") {			
			return SPECIAL_ATTACK_DMG[x]+SPECIAL_ATTACK_DMG[x]*0.5;
		}
		return 0.2*SPECIAL_ATTACK_DMG[x];
	}
	
	public double attackDmg() {
		int x = (int)(Math.random()*(1-0+1)+0);
		return ATTACK_DMG[x];
	}
}
