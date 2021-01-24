package com.talento.java.zooparte1;

public class BatTester {

	public static void main(String[] args) {
		Bat b = new Bat(300);
		System.out.println(b.getEnergyLevel());
		b.setEnergyLevel(500);
		System.out.println(b.getEnergyLevel());
		b.atackTown();
		b.atackTown();
		b.atackTown();
		b.eatHumans();
		b.eatHumans();
		b.fly();
		b.fly();
		b.diplayEnergy();
	}

}
