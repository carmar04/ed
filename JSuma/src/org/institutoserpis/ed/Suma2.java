package org.institutoserpis.ed;
import java.util.Scanner;
public class Suma2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		String primerNumero = scanner.nextLine();
		int primero = Integer.parseInt(primerNumero);
		System.out.print("Introduce el segundo: ");
		String segundoNumero = scanner.nextLine();
		int segundo = Integer.parseInt(segundoNumero);
		int suma = primero + segundo;
		System.out.println("La suma vale "+ suma);
	}

}
