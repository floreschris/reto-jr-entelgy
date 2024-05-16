package com.entelgy.model;

public class Perro extends Animal {

	public Perro(String nombre, int edad, String raza, int tiempoDeVida) {
		super(nombre, edad, raza, tiempoDeVida, "Perro");
	}

	@Override
	public void realizarSonido() {
		System.out.println("Ladra");
	}

	@Override
	protected String sonido() {
		return "ladra";
	}

}
