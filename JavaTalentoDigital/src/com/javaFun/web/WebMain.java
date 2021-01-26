package com.javaFun.web;

public class WebMain {

	public static void main(String[] args) {

		Web.visitantes++;
		Web.visitantes++;
		System.out.println(Web.visitantes);
		
		
		Web web = new Web();
		web.setNombre("Coding");
		//web.setVisitantes(7);
		
		System.out.println(web.getNombre());
		//System.out.println(web.getVisitantes());

		//llamado al metodo
		web.mostrarDatos();
		
		Web.visitantes++;
		web.mostrarDatos();
		
	}

}
