package ejerciciosCaracteres1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Scanner leer=new Scanner(System.in);
		int opcion=0;
		do {
			System.out.println("===============================================");
			System.out.println("1.- Cifrador del cesar");
			System.out.println("2.- Matriz de 10 elementos");
			System.out.println("3.- 2ª Forma Matriz de 10 elementos o mas elementos");
			System.out.println("4.- Salir");
			opcion=leer.nextInt();
			System.out.println("===============================================");
			
			switch (opcion) {
			case 1:
				Ejercicio1 ejer1=new Ejercicio1();
				break;
			case 2:
				Ejercicio2 ejer2=new Ejercicio2();
				break;
			case 3:
				Ejercicio3 ejer3=new Ejercicio3();
				break;
			case 4:
				System.out.println("Salir");
				break;

			default:
				break;
			}
			
			
		} while (opcion!=4);
		
		
		
		
		
	}

}
