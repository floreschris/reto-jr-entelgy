package com.entelgy.model;

public class Gato extends Animal {

	public Gato(String nombre, int edad, String raza, int tiempoDeVida) {
		super(nombre, edad, raza, tiempoDeVida, "Gato");
	}

	@Override
	public void realizarSonido() {
		System.out.println("Maullar");
	}

	@Override
	protected String sonido() {
		return "maulla";
	}

}
