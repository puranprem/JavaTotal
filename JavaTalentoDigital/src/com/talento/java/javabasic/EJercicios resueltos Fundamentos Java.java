EJercicios resueltos Fundamentos Java:


//VAlores Cuadrados

import java.util.ArrayList;

public class EjerciciosBasicos {
	/*
	Dado cualquier arreglo x, digamos [1,5,10,-2]
	escribir un método que multiplique cada valor en el arreglo por sí mismo. 
	Cuando el método haya terminado, 
	el arreglo x debe contener valores que han sido elevados al cuadrado, digamos [1,25,100,4].*/
	
	public void valoresAlCuadrado(int[] arreglo) {
		//para recorrer y asignar el nuevo valor
		for (int i = 0; i < arreglo.length; i++) {
			
			arreglo[i] = (int) Math.pow(arreglo[i], 2);
		}
		//solo se imprimira la asignacion de memoria, no se mostrará el detalle del arreglo
		System.out.println("int[] arreglo  "+arreglo);
		
		//recorrer el for para imprimir los elementos
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("elemento: "+arreglo[i]);
		}
		
	}
	
	public void valoresAlCuadrado2( ArrayList<Integer> arreglo) {
		for (int i = 0; i < arreglo.size(); i++) {
			
			arreglo.set(i, (int) Math.pow(arreglo.get(i), 2));
			//arreglo.set(index, element);
			//arreglo.get(index);
		}
		System.out.println("ArrayList<Integer> arreglo "+arreglo);
	}
}

//MAIN:

import java.util.ArrayList;

public class MainBasicos {

	public static void main(String[] args) {
		
		EjerciciosBasicos eb = new EjerciciosBasicos();//invocacion
		
		int[] arreglo = {1,5,10,-2};
		
		ArrayList<Integer> arreglo2 = new ArrayList<Integer>();
		arreglo2.add(1);
		arreglo2.add(5);
		arreglo2.add(10);
		arreglo2.add(-2);
		
		eb.valoresAlCuadrado(arreglo);
		
		eb.valoresAlCuadrado2(arreglo2);
		
		
	}

}



// ******* FIZZBUZZ*******



public class FizzBuzz {

	public void validarEntero(int numero) {
		//condicionales
		if(numero%3 == 0 && numero%5 == 0) {
			System.out.println("FizzBuzz");
		}else if (numero%3 == 0) {
			System.out.println("Fizz");
		}else if (numero%5 == 0 ) {
			System.out.println("Buzz");
		}else {
			System.out.println("el numero es:"+numero);
		}
	}
}

// MAIN FIZBBUZZ
package cl.coding.java.fizzbuzz;

import java.util.Scanner;

public class MainFizzBuzz {

	public static void main(String[] args) {
		/* Escribir un programa que tomará un entero y 
		mostrará en pantalla Fizz si el número es divisible por 3,
		Buzz si el número es divisible por 5,
		FizzBuzz si el número es divisible por 3 y 5 y 
		para el resto de los casos mostrará el número que se ingresó.*/
		
		FizzBuzz fz = new FizzBuzz();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		
		try {
			
			int numeroIngresado = sc.nextInt();
			fz.validarEntero(numeroIngresado);
			
		} catch (Exception e) {
			System.out.println("Chaolin!!");
		}

		//String caracter = sc.next();
		
	}

}
