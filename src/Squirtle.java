package com.tesuan.pokemon;

public class Squirtle extends Pokemon implements WaterType{


    public Squirtle() {
        super("Squirtle", "WaterType", 2, WaterType.ATTACK_NAME, WaterType.ATTACK_DMG, WaterType.SPECIAL_ATTACKS, WaterType.SPECIAL_ATTACK_DMG);

    }

    public double specialAttackDmg(Pokemon p) {
        int x = (int)(Math.random()*(2-0+1)+0);
        if(p.type == "FireType") {
            return SPECIAL_ATTACK_DMG[x]+SPECIAL_ATTACK_DMG[x]*0.5;
        }
        return 0.2*SPECIAL_ATTACK_DMG[x];
    }

    public double attackDmg() {
        int x = (int)(Math.random()*(1-0+1)+0);
        return ATTACK_DMG[x];
    }
}
