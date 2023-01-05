package principal;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Animal;
import clases.Ballena;
import clases.Gato;
import clases.Loro;
import clases.Ornitorrinco;
import clases.Perro;
public class AppHerenciaAnimales {
	
	private static Scanner Scanner;
	
	

	public static void run() {
			
		
		ArrayList <Animal> animales = new ArrayList <Animal>();
		
		final int PERRO = 1;
		final int GATO = 2;
		final int BALLENA = 3;
		final int ORNITORRINCO = 4;
		final int LORO = 5;
		final int TODOS = 6;
		final int PARIR = 7;
		final int SALIR = 0;
		
		Scanner scan = new Scanner(System.in);
		int opcion_menu;

		System.out.println("Que animal quieres crear?\n");

		do {
			System.out.println("------ANIMALES-------");
			System.out.println(PERRO + ". Crear Perro");
			System.out.println(GATO + ". Crear Gato");
			System.out.println(BALLENA + ". Crear Ballena");
			System.out.println(ORNITORRINCO + ". Crear Ornitorrinco");
			System.out.println(LORO + ". Crear Loro");
			System.out.println(TODOS + ". Mostrar todos");
			System.out.println(PARIR + ". Mostrar parir");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones ");
			opcion_menu = Integer.parseInt(scan.nextLine());
			
			switch (opcion_menu) {
	
			case PERRO:
				Perro perro= crearPerro();
				animales.add(perro);
				scan.nextLine();

				break;
			case GATO:
				Gato gato= crearGato();
				animales.add(gato);
				break;
			case BALLENA:
				Ballena ballena= crearBallena();
				animales.add(ballena);
				break;
			case ORNITORRINCO:
				Ornitorrinco ornitorrinco= crearOrnitorrinco();
				animales.add(ornitorrinco);
				break;
			case LORO:
				Loro loro= crearLoro();
				animales.add(loro);
				break;
			case TODOS:
				Todos(animales);
				break;
			case PARIR:
				Parir(animales);
				break;
			case SALIR:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}
			
		} while (opcion_menu != SALIR);
		scan.close();
	}
	
		

	public static Perro crearPerro() {
		Scanner  = new Scanner(System.in);
		
		String clase_1;
		int numPatas_1;
		String raza_1;
		
		System.out.println("Que clase es?");
		clase_1 = Scanner.nextLine();
		System.out.println("Cuantas patas tiene?");
		numPatas_1 = Scanner.nextInt();	
		System.out.println("De que raza es?");
		raza_1 = Scanner.nextLine();
			
		Perro perro = new Perro(clase_1);
		perro.setNumPatas(numPatas_1);
		perro.setRaza(raza_1);
		
		
		return perro;
	} 
	public static Gato crearGato() {
		Scanner = new Scanner(System.in);
		
		String clase_1;
		int numPatas_1;
		int vidas_1=0;
		
		System.out.println("Que clase es?");
		clase_1 = Scanner.nextLine();
		System.out.println("Cuantas patas tiene?");
		numPatas_1 = Integer.parseInt(Scanner.nextLine());	
		System.out.println("Cuantas vidas tiene?");
		vidas_1 =Integer.parseInt(Scanner.nextLine());
			
		Gato gato = new Gato(clase_1);
		
		gato.setVidas(vidas_1);
		gato.setNumPatas(numPatas_1);
		
		return gato;
	} 
	public static Loro crearLoro() {
		Scanner = new Scanner(System.in);
		
		String clase_1;
		int numPatas_1;
		
		System.out.println("Que clase es?");
		clase_1 = Scanner.nextLine();
		System.out.println("Cuantas patas tiene?");
		numPatas_1 = Integer.parseInt(Scanner.nextLine());	
		
			
		Loro loro = new Loro(clase_1);
		
		loro.setClase(clase_1);
		loro.setNumPatas(numPatas_1);
		
		return loro;
	} 
	public static Ornitorrinco crearOrnitorrinco() {
		Scanner = new Scanner(System.in);
		
		String clase_1;
		int numPatas_1;
		String respuesta;
		boolean enReserva_1 = false;
		
		System.out.println("Que clase es?");
		clase_1 = Scanner.nextLine();
		System.out.println("Cuantas patas tiene?");
		numPatas_1 = Integer.parseInt(Scanner.nextLine());	
		System.out.println("Está en reserva?");
		respuesta = Scanner.nextLine().toLowerCase();
		if (respuesta.equals("si")) {
			enReserva_1=true;
		}
		else if (respuesta.equals("no")) {
			enReserva_1=false;
		}
		Ornitorrinco ornitorrinco = new Ornitorrinco(clase_1);
		
		ornitorrinco.setEnreserva(enReserva_1);
		ornitorrinco.setNumPatas(numPatas_1);
		
		return ornitorrinco;
	} 
	
	public static Ballena crearBallena() {
		Scanner = new Scanner(System.in);
		
		String clase_1;
		String oceano_1;
		
		System.out.println("Que clase es?");
		clase_1 = Scanner.nextLine();
		System.out.println("De que oceano es?");
		oceano_1 = Scanner.nextLine();	
		
			
		Ballena ballena = new Ballena(clase_1);
		
		ballena.setOceano(oceano_1);
		
		
		return ballena;
	}
	private static void Todos(ArrayList <Animal> animales) {
		
		for(int i = 0; i < animales.size(); i++) {
            System.out.println(animales.get(i));
		}
}
	public static void Parir(ArrayList <Animal> animales) {
	
		for (Animal animal : animales) {
			animal.parir();
	}
}
	
	
}	
