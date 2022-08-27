package com.tesuan.pokemon;

public class Pokemon {
	
	protected String Name;
	protected String type;
	protected int id;
	protected double health = 100;
	protected boolean heal = false;
	
	
	protected String[] attack;
	protected double[] attackDamage;
	protected String[] specialAttack;
	protected double[] specialAttackDamage;
	
	public Pokemon(String name, String type, int id, String[] attack, double[] attackDamage,
			String[] specialAttack, double[] specialAttackDamage) {
		super();
		Name = name;
		this.type = type;
		this.id = id;
		this.attack = attack;
		this.attackDamage = attackDamage;
		this.specialAttack = specialAttack;
		this.specialAttackDamage = attackDamage;
	}
	
	
	
	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getHealth() {
		return health;
	}



	public void setHealth(double health) {
		this.health = health;
	}



	public boolean isHeal() {
		return heal;
	}



	public void setHeal(boolean heal) {
		this.heal = heal;
	}



	public String[] getAttack() {
		return attack;
	}



	public void setAttack(String[] attack) {
		this.attack = attack;
	}



	public double[] getAttackDamage() {
		return attackDamage;
	}



	public void setAttackDamage(double[] attackDamage) {
		this.attackDamage = attackDamage;
	}



	public String[] getSpecialAttack() {
		return specialAttack;
	}



	public void setSpecialAttack(String[] specialAttack) {
		this.specialAttack = specialAttack;
	}



	public double[] getSpecialAttackDamage() {
		return specialAttackDamage;
	}



	public void setSpecialAttackDamage(double[] specialAttackDamage) {
		this.specialAttackDamage = specialAttackDamage;
	}



	public double specialAttackDmg(Pokemon p) {
		return 0;
	}
	
	public double attackDmg() {
		return 0;
	}
	
	public void damageTaken(double dmg) {
		this.health-= dmg;
	}
	
	public void useHeal() {
		if(!this.heal) {
			if(this.health<=60) {
				this.health+=40;
				this.heal = true;
			}else
				this.health = 100;
		}
			
	}
	
	public boolean isFainted() {
		if(this.health<=0)
			return true;
		else
			return false;
	}	
	
	
	
}
