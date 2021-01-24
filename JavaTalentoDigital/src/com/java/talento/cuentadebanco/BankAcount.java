package com.java.talento.cuentadebanco;

public class BankAcount {
	private String numeroCuenta;
	private double saldoCuenta;
	private double saldoCuentaAhorros;
	private static int contadorCuentas = 0;
	private static double dineroAlmacenado=0;
	
	
	//Métodos
	
	private void numeroAleatorioCuenta() {
		
							
			String numeroAleatorioCuenta ="";
			
				for(int i=0;i<10;i++){
					int aleatorio = (int) Math.floor((Math.random()*8+1));
					
					numeroAleatorioCuenta=  (numeroAleatorioCuenta +""+ aleatorio);
					
				}
				System.out.println(numeroAleatorioCuenta);	
				
				/*Integer numeroAleatorio = (int) (Math.random()*(999999999-100000000+1)+100000000);

				System.out.println(numeroAleatorio);*/ // Preguntar por que no se puede agregar un dígito mas
				
			}
				
		
	
	
	// Constructores
	public BankAcount () {
		
	}
	
	public BankAcount (String cuenta,double saldo,double ahorro) {
		
	}
	
	public BankAcount(String numeroCuenta, Double saldoCuenta, Double saldoCuentaAhorros) {
		this.numeroCuenta = numeroCuenta;
		this.saldoCuenta = saldoCuenta;
		this.saldoCuentaAhorros = saldoCuentaAhorros;
		
	}
	
	// Getters and Setters
	public final String getNumeroCuenta() {
		return numeroCuenta;
	}
	public final Double getSaldoCuenta() {
		return saldoCuenta;
	}
	public final Double getSaldoCuentaAhorros() {
		return saldoCuentaAhorros;
	}
	public static final int getContadorCuentas() {
		return contadorCuentas;
	}

	public static double getDineroAlmacenado() {
		return dineroAlmacenado;
	}

	public static void setDineroAlmacenado(double dineroAlmacenado) {
		BankAcount.dineroAlmacenado = dineroAlmacenado;
	}
	

}
