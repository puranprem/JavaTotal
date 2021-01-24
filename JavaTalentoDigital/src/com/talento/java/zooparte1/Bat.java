package com.talento.java.zooparte1;

public class Bat extends Mamma1 {
	
	public Bat(Integer energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
//		this.energyLevel =300;
		System.out.println("iaarrrrkkkk, iaarrrrkkkk");
		this.setEnergyLevel(getEnergyLevel()-50);
	}
	public void eatHumans() {
		System.out.println("Bueno, no importa");
		this.setEnergyLevel(getEnergyLevel()-25);
	}
	
	public void atackTown() {
		System.out.println("fuego, fuego, ...la ciudad se qeuma");
		this.setEnergyLevel(getEnergyLevel()-100);
	}

}
