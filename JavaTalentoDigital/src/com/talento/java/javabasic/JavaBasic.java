package com.talento.java.javabasic;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaBasic {

	
		void metodoArray() {
			for (int i = 0;i<=255;i++ ) {
				System.out.println(i);
			}
		}
		
		void metodoArrayImpares() {
			ArrayList<Integer> arreglo = new ArrayList<Integer>();
			int suma = 0;
			for (int i = 1;i<=255;i+=2 ) {
				System.out.println(i);
				arreglo.add(i);
				suma = suma +i;
			}
			System.out.println(arreglo);
			System.out.println(suma);
		}
		
		//4.- Recorrer un Arreglo Dado un arreglo X, digamos [1,3,5,7,9,13], escriba un método que recorra cada
				//uno de los elementos del arreglo e imprima cada valor. Ser capaz de recorrer cada elemento de un arreglo
				//es extremadamente importante.
		
		void recorrerArreglo( int [] arreglo) {			
			for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
			}			
		}				


		// 5.- Encontrar el Máximo
		// Escribir un método que tome un arreglo e imprima el valor máximo en el arreglo. 
		// Su método debería funcionar también con todos los números en negativo 
		// (ejemplo [-3,-5,-7]), o incluso una mezcla de números positivos, números negativos y cero.
 
		void encontrarMaximo(int [] arreglo) {			
				   int mayor= arreglo[0];
				   for (int index = 0; index < arreglo.length; index++) {
				      if (arreglo[index] > mayor) 
				         mayor=arreglo[index];
				   	}  
				      System.out.println(mayor);
				      
				      
				      
				}
		
		// 6.- Obtener el Promedio
        // Escribir un método que tome un arreglo e imprima el promedio de los valores en el arreglo. 
		// Por ejemplo en un arreglo hay [2,10,3], su método debería Imprimir “Promedio de 5”. 
		// Nuevamente, asegúrese de crear un caso simple y escriba las instrucciones para resolver ese caso primero, 
		//luego pruebe sus instrucciones con casos más complicados.
		
		void obtenerPromedio(int[] arreglo) {
			int suma = 0;
			for (int i = 0; i < arreglo.length; i++ ) {
					suma = suma + arreglo [i];
				}
				System.out.println(suma/arreglo.length);		
			}
			
		
		// 7.- Arreglo con Números Impares

		// Escribir un método que cree un arreglo ‘y’ que contenga todos los números impares entre 1 - 255. 
		//Cuando el método haya terminado, ‘y’ debe tener los valores de [1,3,5,7…255].
		
		
		void arregloDeImpares() {
			ArrayList<Integer> y = new ArrayList<Integer>(); // froma1
			for (int i = 1;i<=255;i+=2 ) {
				y.add(i);
			}
			System.out.println(y);
		}
		
		ArrayList<Integer> arregloDeImpares2() {
			ArrayList<Integer> y = new ArrayList<Integer>();// forma 2 con retorno
			for (int i = 1;i<=255;i+=2 ) {
				y.add(i);
							}
			return y;
		}
		
		// 8.- Mayor que Y
		//Escribir un método que tome un arreglo y devuelva el número de valores mayores a un valor Y dado. 
		//Por ejemplo, si el arreglo es [1,3,5,7] y Y = 3, después de terminar el proceso el método debe 
		//Imprimir el número 2 (ya que hay 2 valores en el arreglo que son mayores que 3).
		
		void mayorQueY(int [] arreglo,int x) {	
			int mayor = 0;
			for (int index = 0; index < arreglo.length; index++) {
			      if (arreglo[index] > x) 
			         mayor++;
			   	}  
			      System.out.println(mayor);
			}
		
		// 9.- Valores al Cuadrado
		//Dado cualquier arreglo x, digamos [1,5,10,-2], escribir un método que multiplique cada valor en el arreglo por sí mismo. 
		//Cuando el método haya terminado, el arreglo x debe contener valores que han sido elevados al cuadrado, digamos [1,25,100,4].
		
		
		// version 1 , todo Double
		void valoresCuadrados (int [] arreglo) {
			ArrayList<Double> x = new ArrayList<Double>();
			for (int index=0 ;index < arreglo.length; index++) {		
				Double a =  Math.pow(arreglo[index], 2);
				x.add(a);
			}
			System.out.println(x);
		}
		
		//version 2 con Integer y transformando Double a int
		void valoresCuadrados2 (int [] arreglo) {
			ArrayList<Integer> x = new ArrayList<Integer>();
			for (int index=0 ;index < arreglo.length; index++) {		
				Integer a =  Double.valueOf(Math.pow(arreglo[index], 2)).intValue(); //transformando Double a int
				x.add(a);
			}
			System.out.println(x);
		}

		
		
		
		
		// 10.- Eliminar Números Negativos

		//Dado un arreglo x, digamos [1,5,10,-2], escribir un método que reemplace cualquier número negativo por 0. 
		//Cuando el método haya terminado, x no debe tener valores negativos, digamos como [1,5,10,0].
		void numerosNegativos(int[]arreglo) {
			for (int index=0 ;index < arreglo.length; index++) {
				if (arreglo[index] < 0) {
					arreglo[index] = 0;
					
				}
				
			}
			System.out.println(Arrays.toString(arreglo));
		}

		//Acortando el If
		
		void numerosNegativos2(int[]arreglo) {
			for (int index=0 ;index < arreglo.length; index++) {
					arreglo[index] = (arreglo[index] < 0)?0:arreglo[index];  // resultado = (condicion)?valor1:valor2; //ver en  http://lineadecodigo.com/java/el-operador-ternario-en-java/ 
		
			}
			System.out.println(Arrays.toString(arreglo));

	
}
				
		
		
		
		// 11.- Mínimo, Máximo y Promedio 
		//Dado un arreglo x, digamos [1,5,10,-2], escribir un método que devuelva un arreglo con el número máximo, 
		//el número mínimo y el valor promedio que hay en el arreglo x. El arreglo devuelto debe contener solo 3 valores [Max, Min, Prom].
		
		void minMaxProm(int[]x) {
			ArrayList<Double> arregloMMP = new ArrayList<Double>();
			double mayor = x[0];
			double menor = x[0];
			double sum = 0;
			for (int index=0 ;index < x.length; index++) {
				sum = sum +x[index];
				if(mayor>x[index]) {
					mayor=x[index];
					
					}
				if(menor<x[index])
					menor = x[index];
				}
		arregloMMP.add(mayor);
		arregloMMP.add(menor);
		arregloMMP.add(sum/x.length);
		System.out.println((arregloMMP.toString()));
			}
			
		
		
		
		
		// 12.- Cambiando los Valores del Arreglo
		//Dado un arreglo x, digamos [1,5,10,7,-2], escribir un método que cambie cada valor por el valor que sigue. 
		//Por ejemplo, cuando el método haya terminado, un arreglo x [1,5,10,7,-2] se convertirá en [5,10,7,-2,0]. 
		//Observe que el último número es 0. El método no necesita ajustarse para los valores que están fuera de los límites.
		
		
		void cambiaValores(int [] arreglo) {	
			
			for (int index = 0; index < arreglo.length-1; index++) {
			      
			      arreglo[index]=arreglo[index+1];
			   	}  
			      
			      arreglo[arreglo.length-1]=0;
			      System.out.println(Arrays.toString(arreglo));
			}
		
		
		
		
	} //llave de cierre no borrar
