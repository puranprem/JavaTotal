package com.talento.java.javabasic;

import java.util.ArrayList;

public class JavaBasicTesting {

	public static void main(String[] args) {
		JavaBasic jV = new JavaBasic(); // instacia de la clase JAvaBasic
		//jV.metodoArray();// acá estamos accediendo de la instancia creadada
		
		//jV.metodoArrayImpares();
		
		// 4.-
		
		//int [] arre={1,3,5,7,9,13};		
		//jV.recorrerArreglo(arre);
	

 		// 5.-Encontrar Máximo
		//int [] array = {-3,-5,-7};
		//jV.encontrarMaximo(array);
		
		// 5.-Imprimir promedio
		//int [] printProm = {2,10,3};
		//jV.obtenerPromedio(printProm);
		
		//jV.arregloDeImpares(); //forma 1 		
		//ArrayList<Integer> retornoDeY = jV.arregloDeImpares2(); forma 2 con se haría con retorno
		//System.out.println(retornoDeY);
		
		// 8.- 
		//int [] arre= {1,3,5,7};
		//int x = 3;
		//jV.mayorQueY(arre, x);
		
		// 9.-
//		int [] paraCuadrados={1,5,10,-2};
//		jV.valoresCuadrados(paraCuadrados);
//		
//		int [] paraCuadrados2={1,5,10,-2};
//		jV.valoresCuadrados2(paraCuadrados2);
//		
		int [] pasarANegativos={1,5,10,-2};
//		jV.numerosNegativos(pasarANegativos);
//		
//		int [] pasarANegativos2={1,5,10,-2};
//		jV.numerosNegativos2(pasarANegativos2);
//		
//		int []  mMP = {1,5,10,-2};
//		jV.minMaxProm (mMP);
//		
		int []cV= {1,5,10,7,-2};
		jV.cambiaValores(cV);
		
	}// llaves de cierre , no borrar.
}