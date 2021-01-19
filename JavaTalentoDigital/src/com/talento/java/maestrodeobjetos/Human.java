package com.talento.java.maestrodeobjetos;

public class Human {
	private int strength = 3;
	private int stealth= 3;
	private int inteligence= 3;
	private int health= 100;
	
	public void attack () {
		health = health-strength;
		System.out.println(health);
	}
	

}
