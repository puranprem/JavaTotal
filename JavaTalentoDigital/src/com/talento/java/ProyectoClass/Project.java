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
//Crear una instancia de método que se llame elevatorPitch que devolverá nombre y descripcion separados por dos puntos ( : ).
//Sobrecargar el método constructor en tres diferentes formas:
//public Project() { }
//public Project(String name) { }
//public Project(String name, String description) { }
//Crear getter y setter para cada campo.
//Crear el archivo ProjectTest que hará las pruebas a toda la funcionalidad.
//Desafíos Opcionales
//Agregar una variable initialCost de tipo double y tenga su propio getter and setter.
//Agregar esto en el paréntesis de elevatorPitch después del nombre, ejemplo nombre (cost): descripcion 
//Crear una clase Portfolio que tendrá un Arraylist de Project en el campo projects. Utilizar Generics para asegurarse que esos son objetos de tipo Project.
//Agregar los métodos apropiados de getter y setter y el constructor para que funcione.
//Agregar el método getPortfolioCost para calcular y devolver el costo total del portafolio completo.
//Agregar el método showPortfolio que mostrará en pantalla todos los proyectos en formato elevator Pitches, seguido del costo total.
//Files