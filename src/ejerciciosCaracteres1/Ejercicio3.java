package ejerciciosCaracteres1;

import java.util.Scanner;

public class Ejercicio3 {
	public Ejercicio3() {
		super();
		
		int[]clave= {3,9,6,5,1,7,2,4,0,8};
		String mensaje="";
		char aste='*';
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce la palabra a cifrar");
		mensaje=leer.nextLine();
		
		//rellenar cadena hasta multiplo de 10
		
		int tamañorelleno=10-(mensaje.length()%10);
		if (tamañorelleno!=10) {
			for (int i = 0; i < tamañorelleno; i++) {
				mensaje+=aste;
			}
		}
		System.out.println("===============================================");
		System.out.println(mensaje);
		System.out.println("===============================================");
		
		int sup=10, inf=0;
		String menscortado="",mensajeencrip="",mensajedesencrip="";
		System.out.println("===============================================");
		do {
			menscortado=mensaje.substring(inf, sup);
			System.out.println(menscortado);
			inf+=10;
			sup+=10;
			mensajeencrip=mensajeencrip+encriptar(menscortado,clave);
		} while (sup<=mensaje.length());
		System.out.println("===============================================");
		System.out.println("Mensaje Encriptado= "+mensajeencrip);
		
		inf=0;
		sup=10;
		System.out.println("===============================================");
		do {
			
			menscortado=mensajeencrip.substring(inf, sup);
			System.out.println(menscortado);
			inf+=10;
			sup+=10;
			mensajedesencrip=mensajedesencrip+desencriptar(menscortado,clave);
		} while (sup<=mensajeencrip.length());
		System.out.println("===============================================");
		System.out.println("Mensaje desencriptado= "+mensajedesencrip);
		System.out.println("===============================================");
		
	}

	private String desencriptar(String mensajeencrip, int[] clave) {
		// TODO Apéndice de método generado automáticamente
		
		char caracter;
		char[]cadenadesenc=new char[clave.length];
		
		for (int i = 0; i < cadenadesenc.length; i++) {
			caracter=mensajeencrip.charAt(clave[i]);
			cadenadesenc[i]=caracter;
		}
		
		
		return String.valueOf(cadenadesenc);
	}

	private String encriptar(String menscortado, int[] clave) {
		// TODO Apéndice de método generado automáticamente
		char caracter;
		char[]cadenaencriptada=new char[clave.length];
		
		for (int i = 0; i < cadenaencriptada.length; i++) {
			caracter=menscortado.charAt(i);
			cadenaencriptada[clave[i]]=caracter;
		}
		return String.valueOf(cadenaencriptada);
	}

}
