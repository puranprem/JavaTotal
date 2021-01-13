package com.talento.java.ProyectoClass;

public class ProjectTesting {

	public static void main(String[] args) {
		Project p = new Project("j");
		System.out.println(p.getNombre());
		p.setNombre("l");
		System.out.println(p.getNombre());
		
	}

}
