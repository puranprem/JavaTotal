package com.talento.java.maestrodeobjetos;

public class Human {

	private Integer strength = 3;
	private Integer	stealth = 3; 
	private Integer	intelligence = 3;
	private Integer health = 100;
	//constructores
	public Human() {
		super();
	}

	public Human(Integer strength, Integer stealth, Integer intelligence, Integer health) {
		super();
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
		this.health = health;
	}
	
	public void attack(Human atakador) {
		//reducir el atributo health del humano atacado 
		//por los puntos de strength del humano atacante.
		this.setHealth( this.getHealth() -	atakador.getStrength());
	}
	


	//set and get
	public Integer getStrength() {
		return strength;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	public Integer getStealth() {
		return stealth;
	}
	public void setStealth(Integer stealth) {
		this.stealth = stealth;
	}
	public Integer getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}
	public Integer getHealth() {
		return health;
	}
	public void setHealth(Integer health) {
		this.health = health;
	}
	
	
}
