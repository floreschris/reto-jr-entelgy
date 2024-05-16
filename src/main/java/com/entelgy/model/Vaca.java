package com.entelgy.model;

public class Vaca extends Animal{

	public Vaca(String nombre, int edad, String raza, int tiempoDeVida) {
		super(nombre, edad, raza, tiempoDeVida, "Vaca");
	}

	@Override
	public void realizarSonido() {
		System.out.println("Mugir");
	}

	@Override
	protected String sonido() {
		return "muge";
	}
}
