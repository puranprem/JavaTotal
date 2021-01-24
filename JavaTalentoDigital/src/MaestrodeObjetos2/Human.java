package MaestrodeObjetos2;

public class Human {
	private Integer strength = 3;
	private Integer stealth = 3;
	private Integer intelligence = 3;
	private Integer health = 100;



	public Human(Integer strength, Integer stealth, Integer intelligence, Integer health) {
		super();
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
		this.health = health;
	}
	
	
	
	public Human() {
		// TODO Auto-generated constructor stub
	}



	public Integer attack(Human atakador) {
		
//		this.setHealth( this.getHealth() -	atakador.getStrength());
		//reducir el atributo health del humano atacado 
		//por los puntos de strength del humano atacante.
		
		this.health = this.health - atakador.getStrength();
		return this.health;
	}

	
	
	
	//getters and setters
	public final Integer getStrength() {
		return strength;
	}

	public final void setStrength(Integer strength) {
		this.strength = strength;
	}

	public final Integer getStealth() {
		return stealth;
	}

	public final void setStealth(Integer stealth) {
		this.stealth = stealth;
	}

	public final Integer getIntelligence() {
		return intelligence;
	}

	public final void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public final Integer getHealth() {
		return health;
	}

	public final void setHealth(Integer health) {
		this.health = health;
	}
	
}
