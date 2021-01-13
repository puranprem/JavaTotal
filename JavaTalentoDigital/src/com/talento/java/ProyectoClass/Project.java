package com.talento.java.ProyectoClass;

public class Project {
	private String nombre;
	private String descripcion;
	

	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Project() {
		
	}
	

	public Project(String nombre) {
		this.nombre = nombre;
	}
	


	public Project(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}


	public void elevatorPitch() {
		System.out.println(this.nombre +" : "+this.descripcion);
		
	}
	

	
	
	
} // final




//Crear una clase Project que teng
//Crear una instancia de m�todo que se llame elevatorPitch que devolver� nombre y descripcion separados por dos puntos ( : ).
//Sobrecargar el m�todo constructor en tres diferentes formas:
//public Project() { }
//public Project(String name) { }
//public Project(String name, String description) { }
//Crear getter y setter para cada campo.
//Crear el archivo ProjectTest que har� las pruebas a toda la funcionalidad.
//Desaf�os Opcionales
//Agregar una variable initialCost de tipo double y tenga su propio getter and setter.
//Agregar esto en el par�ntesis de elevatorPitch despu�s del nombre, ejemplo nombre (cost): descripcion 
//Crear una clase Portfolio que tendr� un Arraylist de Project en el campo projects. Utilizar Generics para asegurarse que esos son objetos de tipo Project.
//Agregar los m�todos apropiados de getter y setter y el constructor para que funcione.
//Agregar el m�todo getPortfolioCost para calcular y devolver el costo total del portafolio completo.
//Agregar el m�todo showPortfolio que mostrar� en pantalla todos los proyectos en formato elevator Pitches, seguido del costo total.
//Files