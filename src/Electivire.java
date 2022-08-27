package com.tesuan.pokemon;

public class Electivire extends Pokemon implements ElectricType{
	
	public Electivire() {
		super("Electivire", "ElectricType", 3, ElectricType.ATTACK_NAME, ElectricType.ATTACK_DMG, ElectricType.SPECIAL_ATTACKS, ElectricType.SPECIAL_ATTACK_DMG);

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
