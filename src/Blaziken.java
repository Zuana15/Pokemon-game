package com.tesuan.pokemon;

public class Blaziken extends Pokemon implements FireType{

	public Blaziken() {
		super("Blaziken", "FireType", 1, FireType.ATTACK_NAME, FireType.ATTACK_DMG, FireType.SPECIAL_ATTACKS, FireType.SPECIAL_ATTACK_DMG);
		
	}
	
	public double specialAttackDmg(Pokemon p) {
		int x = (int)(Math.random()*(2-0+1)+0);
		if(p.type == "GrassType") {			
			return SPECIAL_ATTACK_DMG[x]+SPECIAL_ATTACK_DMG[x]*0.5;
		}
		return 0.2*SPECIAL_ATTACK_DMG[x];
	}
	
	public double attackDmg() {
		int x = (int)(Math.random()*(1-0+1)+0);
		return ATTACK_DMG[x];
	}
	
}
