package com.senati.eti;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declarar el arreglo
		Integer[] numero = new Integer[5];
				
		System.out.println("INGRESO DE NÚMEROS");
		System.out.println("------------------");
				
		// Leer los datos para el arreglo
		for (int x = 0; x < numero.length; x++ ) {
			System.out.print("Número " + (x + 1) + ": ");
			numero[x] = sc.nextInt();
		}
		
		// Ordenar de forma ascendente
		Arrays.sort(numero);
		
		System.out.println("\nNúmeros Ordenados Ascendentemente");
		System.out.println("---------------------------------");
		for (int x = 0; x < numero.length; x++)
			System.out.println("Número " + (x + 1) + ": " + numero[x]);
		
		Arrays.sort(numero, Collections.reverseOrder());
		
		System.out.println("\nNúmeros Ordenados Descendentemente");
		System.out.println("---------------------------------");
		for (int x = 0; x < numero.length; x++)
			System.out.println("Número " + (x + 1) + ": " + numero[x]);
	}

}
