package com.generation.ejercicio2302;

import java.util.ArrayList;
import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.ejercicio2302.models.Conejo;
import com.generation.ejercicio2302.models.Gato;
import com.generation.ejercicio2302.models.Perro;

@SpringBootApplication
public class Ejercicio2302Application {

	public static void main(String[] args) {

		//Tema explicado en clase
		// crear un perro por defecto
		// Perro perroDefault = new Perro();
		// //crear un perro con todos los atributos
		// Perro perroCompleto = new Perro("Salchicha", "cafe", 40.5, "Pelo Duro", 'F', 12345678);

		// System.out.println(perroCompleto.toString());
		// System.out.println(perroDefault.toString());

		// perroDefault.setRaza("Quiltro");
		// perroDefault.setColor("Blanco");
		// System.out.println(perroDefault.toString() + "\n");

		// System.out.println(perroCompleto.getTamanio());
		// System.out.println(perroCompleto.getTamanio()+20);

		/*
		 * Crear un perro ingresando datos por el ususario. 
		 * crear programa que con x cantidad de perros a ingresar haga lo de arriba
		 * 1. crear un perro sin datos *
		 * Los datos del perro son:
		 * String raza, String color, Double tamanio, String pelaje, char sexo, Integer chip
		 * 2. cambiar los datos del perro con el set *
		 * 3. imprimir al perro con el toString *
		 * segunda parte:
		 * 1. pedirle cuantos perros ingresara
		 * 2. hacer un for con esos perros
		 * 3. Hacer un array de perros para luego imprimirlo
		 */
		
		// Scanner teclado = new Scanner(System.in);
		// ArrayList <Perro> misPerros = new ArrayList<Perro>();

		// System.out.print("¿Cuántos perros va a Ingresar? ");
		// int cantPerros = teclado.nextInt();

		// for(int i = 1; i <= cantPerros; i++){
		// 	Perro perroVacio = new Perro();
		// 	teclado.nextLine();
		// 	System.out.print("\nIngresara los Datos del perro Numero " + i);

		// 	System.out.print("\n¿Cuál es la raza del perro? ");
		// 	perroVacio.setRaza(teclado.nextLine());
		// 	System.out.print("¿Cuál es el color del perro? ");
		// 	perroVacio.setColor(teclado.nextLine());
		// 	System.out.print("¿Cuál es el tamaño del perro? ");
		// 	perroVacio.setTamanio(teclado.nextDouble());
		// 	teclado.nextLine();
		// 	System.out.print("¿Cuál es el pelaje del perro? ");
		// 	perroVacio.setPelaje(teclado.nextLine());
		// 	System.out.println("¿Cuál es el sexo del perro? ");
		// 	System.out.print("Femenino = F / Masculino = M: ");
		// 	perroVacio.setSexo(teclado.next().charAt(0));
		// 	System.out.print("¿Cuál es el Chip del perro? ");
		// 	perroVacio.setChip(teclado.nextInt());

		// 	misPerros.add(perroVacio);
		// }

		// System.out.println(misPerros);
		// teclado.close();

		//Pruebas de Herencia

		//creacion de Gato

		Gato michiVacio = new Gato();
		Gato michiGordito = new Gato("MichiGuaton", "Egipcio", "Calvo", true, 12);
		
		System.out.println(michiVacio);
		System.out.println(michiGordito);

		System.out.println("\n");
		//creacion de Conejo

		Conejo seniorBigotes = new Conejo();
		Conejo badBunny = new Conejo("Bad Bunny", "Cabeza de Leon", "Peludito", false, 5.0);

		System.out.println(seniorBigotes);
		System.out.println(badBunny);

		System.out.println("\n");
		//Getters y Setters

		michiVacio.setNombre("Pelusa");
		seniorBigotes.setNombre("Señor Bigotes");

		System.out.println(seniorBigotes);
		System.out.println(michiVacio);

		System.out.println("\n");

		//no puedes ingresar a los metodos de las clases hermanas
		michiGordito.manullar();
		badBunny.saltarAlto();
		//ambos pueden acceder a los metos de la clase padre
		//se supone que la clase animal tiene funcion caminar
		//gato y conejo puede acceder a caminar


		//HECHO EN GRUPO DE EJEMPLO
		//sobre heredados
		
		// OBJETOS QUE TENEMOS:
		//COMPUTADOR, SMARTPHONE, SMARTTV

		//CLASE PADRE: ArticulosElectronicos

		//ATRIBUTOS CLASE PADRE:

		/* Marca:
		* Modelo:
		* Tamanio:
		* Color:
		* Bluetooth:
		* SistemaOperativo:
		*/

		//FUNCIONES: 

		/*
		* Reproducir medios audiovisuales
		* Navegar en internet 
		* Interactuar con aplicaciones
		* Jugar
		*/


	}

}
