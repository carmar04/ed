package org.institutoserpis.ed;

import java.util.Scanner;

public class Suma {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int primerNumero,segundoNumero,suma;
		
		System.out.print("introduzca el primero numero:");
		primerNumero = teclado.nextInt();
													//analiza la cadena para ver si es convertible a numero
		System.out.print("Introduzca el segundo numero:");
		segundoNumero = teclado.nextInt();
		
		suma = primerNumero + segundoNumero;
		System.out.println("La suma es "+ suma);	// variable string puede tener cualquier cadena de caracteres
	}												//con la variable int solo podemos tener numeros (tamaño maximo de 32 bits)

}


