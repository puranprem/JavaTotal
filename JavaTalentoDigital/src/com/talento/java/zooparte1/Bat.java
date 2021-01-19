package com.talento.java.zooparte1;

public class Bat extends Mamma1 {
	public void fly() {
		this.energyLevel =300;
		System.out.println("iaarrrrkkkk, iaarrrrkkkk");
		this.energyLevel=-50;
	}
	public void eatHumans() {
		System.out.println("Bueno, no importa");
		this.energyLevel=this.energyLevel-25;
	}
	
	public void atackTown() {
		System.out.println("fuego, fuego, ...la ciudad se qeuma");
		this.energyLevel=this.energyLevel-100;
	}

}
