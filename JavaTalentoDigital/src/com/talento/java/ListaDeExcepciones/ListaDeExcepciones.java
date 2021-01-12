package com.talento.java.ListaDeExcepciones;

import java.util.ArrayList;

public class ListaDeExcepciones {
	
	void pruebaDeExcepciones () {
	
		
		try {
			ArrayList <Object> myList =new ArrayList <Object>();
			myList.add("13");
			myList.add("Hola Mundo");
			myList.add(48);
			myList.add("Adios Mundo");
			
			for (int i=0 ; i< myList.size(); i++) {
				int castedValue = (int)myList.get(i);
				System.out.println(myList);
			
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e + "no es un String");
			}
		
		}
		
	}

