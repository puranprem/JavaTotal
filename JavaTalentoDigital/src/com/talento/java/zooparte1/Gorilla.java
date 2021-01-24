package com.talento.java.zooparte1;

public class Gorilla extends Mamma1{

	public void throwSomething() {
		System.out.println("El Gorila ha lanzado algo");
		this.setEnergyLevel(getEnergyLevel()-5);

	}
	public void eatBanans() {
		System.out.println("El nivel de satisfacion del Gorila es: "+getEnergyLevel());
		this.setEnergyLevel(getEnergyLevel()+10);
	}
	public void climb() {
		System.out.println("El Gorila ha trepado a  la cima de un árbol");
		this.setEnergyLevel(getEnergyLevel()-10);
	}


}
