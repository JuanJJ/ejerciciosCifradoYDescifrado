package ejerciciosCaracteres1;

import java.util.Scanner;

public class Ejercicio2 {
	public Ejercicio2() {
		super();
		Scanner leer=new Scanner(System.in);
		
		int[]matriz= {3,9,6,5,1,7,2,4,0,8};
		String frase="", encriptada="", desencriptada="";
		
		System.out.println("Introduce la frase a cifrar de 10 caracteres");
		frase=leer.nextLine();
		
		encriptada=encriptar(frase,matriz);
		System.out.println("Palabra encriptada= "+encriptada);
		
		desencriptada=desencriptar(matriz,encriptada);
		System.out.println("palabra desencriptada= "+desencriptada);
		
	}

	private String desencriptar(int[] matriz, String encriptada) {
		// TODO Apéndice de método generado automáticamente
		char caracter;
		char[]cadenades=new char[matriz.length];
		
		for (int i = 0; i < cadenades.length; i++) {
			caracter=encriptada.charAt(matriz[i]);
			cadenades[i]=caracter;
		}
		return String.valueOf(cadenades);
	}

	private String encriptar(String frase, int[] matriz) {
		// TODO Apéndice de método generado automáticamente
		char caracter;
		char[]cadenacaracter=new char[frase.length()];
		
		for (int i = 0; i < matriz.length; i++) {
			caracter=frase.charAt(i);
			cadenacaracter[matriz[i]]=caracter;
		}
		
		return String.valueOf(cadenacaracter);
	}

}
