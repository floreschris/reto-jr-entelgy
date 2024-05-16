package com.entelgy.challenge;

import java.util.ArrayList;
import java.util.List;

import com.entelgy.model.Animal;
import com.entelgy.model.Gato;
import com.entelgy.model.Perro;
import com.entelgy.model.Vaca;

public class Reporte {

	public static List<Animal> cargarDatos() {

		List<Animal> animales = new ArrayList<>();
		animales.add(new Perro("Layka", 3, "Pug", 8));
		animales.add(new Perro("Negra", 1, "Chihuahua", 10));
		animales.add(new Perro("Dogi", 3, "Buldog", 6));
		animales.add(new Perro("Luna", 2, "Beagle", 13));
		animales.add(new Gato("Michi", 4, "Siames", 15));
		animales.add(new Gato("Lala", 3, "Persa", 14));
		animales.add(new Gato("Superman", 1, "Garfield", 13));
		animales.add(new Vaca("Cebrita", 6, "Holstein", 12));
		animales.add(new Vaca("Gloria", 7, "Jersey", 15));
		animales.add(new Vaca("Lola", 5, "Angus", 12));
		return animales;

	}

	public static void main(String[] args) {

		List<Animal> animales = cargarDatos();
		String nombreBuscado = "Lola"; 

		Animal animalEncontrado = animales.stream().filter(animal -> animal.getNombre().equals(nombreBuscado))
				.findFirst().orElseThrow(() -> new RuntimeException("Animal no encontrado"));

		animalEncontrado.describir();

	}

}
