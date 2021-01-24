package com.talento.java.zooparte1;

public class Mamma1 {
	private Integer energyLevel = 100;
	
	public int diplayEnergy() {
		System.out.println(energyLevel);
		return this.energyLevel;
	}

	public Mamma1(Integer energyLevel) {
		super();
		this.energyLevel = energyLevel;
	}

	public Mamma1() {
		super();
	}

	public final Integer getEnergyLevel() {
		return energyLevel;
	}

	public final void setEnergyLevel(Integer energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
}
