
package org.institutoserpis.ed;

import java.util.Scanner;

import java.util.Random;

public class Adivina {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int numeroAleatorio = random.nextInt(1000) + 1;
		System.out.println("Numero aleatorio ="+numeroAleatorio);
		System.out.print("Adivina el numero (de 1 a 1000): ");
		
		String numero = scanner.nextLine();
		int numeroIntroducido = Integer.parseInt(numero);
		int contador=0;
		while (numeroIntroducido!=numeroAleatorio) {
			contador++;
			if(numeroAleatorio<numeroIntroducido) {
				System.out.println("Es menor que ese. Vuelve a intentarlo: ");
			}else {
				System.out.println("Es mayor que ese. Vuelve a intentarlo: ");
			}
			numero = scanner.nextLine();
			numeroIntroducido = Integer.parseInt(numero);
		}
		System.out.println("Enhorabuena. Has acertado.");
		System.out.println("Has realizado "+contador+" intentos");
	}
	
}
