package com.talento.java.maestrodeobjetos;

public class HumanTest {

	public static void main(String[] args) {
		Wizard wizard  = new Wizard();
		System.out.println(wizard.getIntelligence());

		Ninja atakador = new Ninja();
		System.out.println("Stealth:"+atakador.getStealth());
		
		wizard.attack(atakador);
		System.out.println("Health:"+wizard.getHealth());
		
		atakador.steal(wizard);
		System.out.println("Health ninja: "+atakador.getHealth());
    wizard.fireBall(atakador);
		
		System.out.println("Healt del ninja: "+atakador.getHealth());
	}

}