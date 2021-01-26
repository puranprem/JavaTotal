package com.java.talento.cuentadebanco;

public class BankTester {

	public static void main(String[] args) {
		
		BankAcount cuenta1 = new BankAcount();
		System.out.println("Cuenta 1: "+cuenta1.getNumeroCuenta());
		cuenta1.depositoCtaCte(0);
		System.out.println("Saldo en cuenta de Corriente "+ cuenta1.depositoCtaCte(100));
		System.out.println("Saldo en cuenta de Corriente "+ cuenta1.depositoCtaCte(800));
		System.out.println("*****");
		
		BankAcount cuenta2 = new BankAcount();
		System.out.println("Cuenta 2: "+cuenta2.getNumeroCuenta());
		System.out.println("Saldo en cuenta de Corriente "+cuenta2.depositoCtaCte(200));
		System.out.println("*****");
		
		BankAcount cuenta3 = new BankAcount();
		System.out.println("Cuenta 3: "+cuenta3.getNumeroCuenta());
		System.out.println("Saldo en cuenta de Ahorro "+cuenta3.depositoCtaAhorro(38.5));
		System.out.println("Saldo en cuenta de Ahorro "+cuenta3.depositoCtaAhorro(38.5));
		System.out.println("Saldo en cuenta de Ahorro luego del giro "+cuenta3.retiroCtaAhorro(7));
		System.out.println("*****");
		
		System.out.println("Numero de cuentas creadas: "+BankAcount.contadorCuentas);
	
		System.out.println("saldo total en banco: " + BankAcount.dineroAlmacenado);

	}

}
