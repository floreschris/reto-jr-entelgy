package com.entelgy.model;

public abstract class Animal {
	private String nombre;
	private int edad;
	private String raza;
	private int tiempoDeVida;
	private String tipo;

	public Animal(String nombre, int edad, String raza, int tiempo_de_Vida, String tipo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		tiempoDeVida = tiempo_de_Vida;
		this.tipo = tipo;
	}

	public abstract void realizarSonido();

	public void describir() {
		System.out.println(
				nombre + " es un " + tipo + " de raza " + raza + " que tiene " + edad + " años de edad. Siempre "
						+ sonido() + " cuando está feliz. Su expectativa de vida es de " + tiempoDeVida + " años");
	}

	protected abstract String sonido();

	public String getNombre() {
		return nombre;
	}

}
