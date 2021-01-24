package com.talento.java.maestrodeobjetos;

public class Wizard extends Human{

	public Wizard() {
		super(3,3,8, 50);
		// TODO Auto-generated constructor stub
	}

	public void heal(Human sanado) {
		sanado.setHealth(sanado.getHealth()+this.getIntelligence());
	}
  
  	/*Agregar un método fireBall(Human) 
	que disminuye la salud del otro Human 
	en los puntos de intelligence * 3 que tenga el Wizard*/
	
	public void fireBall(Human humanito) {
		humanito.setHealth(humanito.getHealth()-(this.getIntelligence()*3));
	}

	public void fireBall(Ninja atakador) {
		// TODO Auto-generated method stub
		
	}
}
