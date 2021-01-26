package com.java.talento.cuentadebanco;

public class BankAcount {
	private String numeroCuenta;
	private double saldoCuenta; //Cta. Cte.
	private double saldoCuentaAhorros;
	public static int contadorCuentas = 0;
	public static double dineroAlmacenado=0;
	
	
	//Métodos
	
	//Generador de numero de cuenta
	private String generadorNumeroCuenta() {
		
							
			String numeroAleatorioCuenta ="";
			
				for(int i=0;i<10;i++){
					int aleatorio = (int) Math.floor((Math.random()*8+1));
					
					numeroAleatorioCuenta=  (numeroAleatorioCuenta +""+ aleatorio);
					
				}
				
				return numeroAleatorioCuenta;	
				
			}
	
//	Crear un método que permita al usuario depositar dinero en su cuenta corriente o 
//	cuenta de ahorros, asegúrese de aumentar el total de dinero almacenado.
	
	//DEPOSITOS
	
	public double depositoCtaCte(double deposito) {
		this.saldoCuenta= this.saldoCuenta+deposito;
		this.dineroAlmacenado = this.dineroAlmacenado + deposito;
		return this.saldoCuenta;
	}	
	
	public double depositoCtaAhorro(double deposito) {
		this.dineroAlmacenado = this.dineroAlmacenado + deposito;
		this.saldoCuentaAhorros= this.saldoCuentaAhorros+deposito;
		return this.saldoCuentaAhorros;
	}	
		
	
	// RETIROS
	
	public double retiroCtaCte(double giro) {
		this.dineroAlmacenado = this.dineroAlmacenado - giro;
		
		this.saldoCuenta= this.saldoCuenta-giro;
		return this.saldoCuenta;
	}	
	
	public double retiroCtaAhorro(double giro) {
		this.dineroAlmacenado = this.dineroAlmacenado - giro;
		this.saldoCuentaAhorros= this.saldoCuentaAhorros-giro;
		return this.saldoCuentaAhorros;
	}	
	
	
	// VER SALDOS
	
	public double cartola() {
		

		return saldoCuenta;
		
	}
	
//Constructores	
	
	
	
	public BankAcount() {
		
		this.numeroCuenta = generadorNumeroCuenta();
		contadorCuentas++;
	}


	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public double getSaldoCuenta() {
		return saldoCuenta;
	}


	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}


	public double getSaldoCuentaAhorros() {
		return saldoCuentaAhorros;
	}


	public void setSaldoCuentaAhorros(double saldoCuentaAhorros) {
		this.saldoCuentaAhorros = saldoCuentaAhorros;
	}


	// Getters and Setters
	
	

}
