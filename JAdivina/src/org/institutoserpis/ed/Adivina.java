
package org.institutoserpis.ed;

import java.util.Scanner;

import java.util.Random;

public class Adivina {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int numeroAleatorio = random.nextInt(1000) + 1;
		System.out.println("Numero aleatorio ="+numeroAleatorio);
		
		int contadorDeIntentos = 1;
	
		System.out.printf("Adivina el numero (de 1 a 1000)[intento %d]: ",
				contadorDeIntentos);

		String numero = scanner.nextLine();
		int numeroIntroducido = Integer.parseInt(numero);
		while (numeroIntroducido!=numeroAleatorio) {
			contadorDeIntentos++;
			if(numeroAleatorio<numeroIntroducido) {
				System.out.printf("Es menor que ese. Vuelve a intentarlo: [intento %d]: ",  
						contadorDeIntentos);
			}else {
				System.out.printf("Es mayor que ese. Vuelve a intentarlo: [intento %d]: ",
						contadorDeIntentos);
			}
			numero = scanner.nextLine();
			numeroIntroducido = Integer.parseInt(numero);
		}
		System.out.printf("Enhorabuena. Has acertado en %s %s.\n", contadorDeIntentos,
				contadorDeIntentos == 1 ? "intento" : "intentos");
		}
	
}
