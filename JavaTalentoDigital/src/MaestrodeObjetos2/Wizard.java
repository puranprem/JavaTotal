package MaestrodeObjetos2;

public class Wizard extends Human{

	public Wizard() {
		super(3,3,8, 50);
		// TODO Auto-generated constructor stub
	}
	
	
	/*Wizard: Agregar un m�todo heal(Human) que aumentar� la salud del otro Human
	  en los puntos de intelligence que tenga el Wizard.*/
	
	public void heal (Human sanado) {
		sanado.setHealth(sanado.getHealth()+this.getIntelligence());

	}

}
