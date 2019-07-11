package ejerciciosCaracteres1;

import java.util.Scanner;

public class Ejercicio1 {
	public Ejercicio1() {
		super();
		
		Scanner leer=new Scanner(System.in);
		String frase="",encriptada="",desencriptada="";
		
		int ascii=0,codigoencrip=8;
		
		System.out.println("Introduce la palabra o frase a cifrar");
		frase=leer.nextLine();
		
		
		encriptada=encriptar(frase,codigoencrip);
		//Encriptar frase
		
		System.out.println("=========================================================");
		System.out.println("La frase encriptada= "+encriptada);
		System.out.println("=========================================================");
		
		desencriptada=desencriptar(encriptada,codigoencrip);
		
		System.out.println("=========================================================");
		System.out.println("La frase desencriptada= "+desencriptada);
		System.out.println("=========================================================");
		
		
		
	}

	private String desencriptar(String encriptada, int codigoencrip) {
		// TODO Apéndice de método generado automáticamente
		int ascii=0;
		char[]desencriptada=new char[encriptada.length()];
		
		for (int i = 0; i < encriptada.length(); i++) {
			ascii=encriptada.charAt(i)-codigoencrip;
			desencriptada[i]=(char)ascii;
		}
		return String.valueOf(desencriptada);
	}

	private String encriptar(String frase, int codigoencrip) {
		// TODO Apéndice de método generado automáticamente
		int charint=0;
		char[]asciiencriptado=new char[frase.length()];
		for (int i = 0; i < frase.length(); i++) {
			charint=frase.charAt(i)+codigoencrip;
			asciiencriptado[i]=(char)charint;
		}
		return String.valueOf(asciiencriptado);
	}



}
