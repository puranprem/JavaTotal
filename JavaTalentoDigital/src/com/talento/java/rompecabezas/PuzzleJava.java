package com.talento.java.rompecabezas;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PuzzleJava {
	//	1.-Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32. 
	//	El método también debe retornar un arreglo que incluya solo los números que son mayores a 10 
	//	(Por ejemplo cuando envía el arreglo anterior, debe retornar un arreglo con los valores de 13,25,32).
	
	
	
	int [] acti1 () {
		
		int[] arreglo1 = {3,5,1,2,7,9,8,13,25,32};
		int j=0;
		for(int i=0; i<arreglo1.length;i++) {
			if(arreglo1[i]>10) {
				j=j+1; //por lo tanto ahora j tiene el valor del largo del nuevo arreglo: 3
			}			
		}	
		int[]arreglo2 = new int [j];
		int k = 0;
		for(int i=0; i<arreglo1.length;i++) {
			if(arreglo1[i]>10) {
				arreglo2[k]=arreglo1[i];
				k=k+1;
			}			
		}
		System.out.println(arreglo2);
		return arreglo2;
	}
	
	//Forma con ArrayList
	ArrayList<Integer> acti1_1(){
		ArrayList<Integer> arreglo3 = new ArrayList<Integer>();
		int[] arreglo = {3,5,1,2,7,9,8,13,25,32};
		for( int i=0; i < arreglo.length; i++) {
			if(arreglo[i]>10){
				arreglo3.add(arreglo[i]);
			}		}
		return arreglo3;
	}
	
		
//		2.-	Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. OK
//			Mezcle el arreglo e imprima el nombre de cada persona. Haga que el método también devuelva un arreglo 
//			con los nombres que tienes más de 5 caracteres.
			ArrayList<String>  acti2 () {
			ArrayList<String> arregloX = new ArrayList<String>();
			//ArrayList<String> = new ArrayList({, "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};//Cómo hacer para pasar un ArrayList completo?
			arregloX.add("Nancy");
			arregloX.add("Fujibayashi");
			arregloX.add("Momochi");
			arregloX.add("Ishikawa");
			System.out.println(arregloX);
			
			Collections.shuffle(arregloX);	 
			Collections.sort(arregloX); 	 
			
			for (String variable : arregloX) {
				System.out.println(variable);
				if(variable.length()>5) {
					
				}
			}
			
			for (int i=0 ; i < arregloX.size() ; i++) {
				
				String variable = arregloX.get(i);
				arregloX.set(0, "Pepa");
			}
			
		
			return arregloX;
			
			}
			
//			3.-Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo debe tener 26 valores).
//			Mezcle el arreglo y, después de mezclarlo, imprima la última letra del arreglo. 
//			También debe imprimir la primera letra del arreglo. 
//			Si la primera letra del arreglo es una vocal, haga que muestre un mensaje.
//			Para mezclar una colección, puede utilizar el método shuffle de la clase 
//			Collections.
				
			char[] acti3(){
				
					char[] alfabeto = new char[26];
					alfabeto[0]='A';
					for(int i=1;i<26;i++){
						alfabeto[i]=(char)('A'+i);
						}
					System.out.println(alfabeto);
					return alfabeto;			
			}
			
//		4.-	Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100.
//			Para obtener un número entero aleatorio, puede utilizar el método nextInt de la clase Random. 
//			Documentación de la Clase Random.
		
			int [] acti4() {
				int [] numeros =new int [10];
				
				for (int i=0 ; i<numeros.length; i++) {
					int aleatorio =(int) (Math.random()*100);
					numeros[i] = aleatorio;
					System.out.println(aleatorio);
				}	
			
				return numeros;
			}
			
//			5.- Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 y hacer que estén ordenados 
//			(mostrar el número más pequeño en el principio del arreglo). Imprimir todos los números del arreglo.
//			Luego, Imprimir el valor mínimo del arreglo, así como el valor máximo.
//			Para ordenar una colección, puede utilizar el   método sort de la clase Collections.
			
////			ArrayList<Integer> acti5() {
////				ArrayList<Integer> arreAle = new ArrayList<Integer>();	
//			int [] acti5 (){
//				int[] arreAle = new int [45];
//				for (int i=0 ; i<9; i++) {
//					int aleatorio =(int) (Math.random()*100)+55; // como hacer para que imprima desde el 55 yq que al sumrle llegará hastaejl 155
////					arreAle.add(aleatorio) ;
//					
//					arreAle[i]=aleatorio;
////					System.out.println("Este es el numero menor "+ min);
////					System.out.println(aleatorio);
//					
//				}	
//				Arrays.sort(arreAle);
//				System.out.println(arreAle);
//				return arreAle;
//			}
			
			ArrayList <Integer> acti5_2(){
				
				ArrayList <Integer> genDev = new ArrayList <Integer>();
				for (int i = 0; i < 10; i++) {
					Integer aleatorio =(int) ((Math.random()*(100-55))+55);
					genDev.add(aleatorio);					
				}
				//Arreglo ordenado ascendente. y con reverseOrder se puede ordenas de manera descendente.
				//Collections.sort(genDev,Collections.reverseOrder()); 
				Collections.sort(genDev);
				System.out.println(genDev);
				System.out.println(Collections.min(genDev)+" "+Collections.max(genDev));
				
				
				
				return genDev;
			}
			
//			6.- Crear una cadena aleatoria con 5 caracteres de longitud.
			
			//cadena como arreglo
			char[] acti6(){
				
			char[] cadena = new char[5];
				cadena[0]='A';
				String palabra = "";
				for(int i=0;i<5;i++){
					cadena[i]=(char) ('A'+ (Math.random()*25));
					palabra=palabra+(char) ('A'+ (Math.random()*(25)));
										}
				System.out.println(palabra);
				
							
				return cadena;		
				
			}
			
			// cadena como char. *** ¿como hace  para que se impriman hacia el lado?
			char acti6_1(){
				
				char cadena ='A';
					for(int i=0;i<5;i++){
						cadena=(char) ('A'+ (Math.random()*25));
						System.out.println(cadena);
					}
					
												
					return cadena;		
					
				}
			
			
//			7.- Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres de longitud.
			

			void  acti7 () {
				ArrayList<String> arregloX = new ArrayList<String>();
					
				for(int index=0 ; index<10 ; index++) {
					String palabra ="";
					for (int i = 0; i < 5; i++) {
						
						palabra=palabra+(char) ('A'+ (Math.random()*(25)));
						
					}
					arregloX.add(palabra);
				
				
				}
				System.out.println(arregloX);
					
			
			}
			
			
			
			
			
			
			
			
			
			
		
			 
} // cierre final, no borrar