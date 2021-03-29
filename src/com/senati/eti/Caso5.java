package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// { (ALT + 123)
		// } (ALT + 125)
		String[] arrCodigo = {"A-123", "A-456", "A-789", "A-777"};
		String[] arrNombre = {"Erick Berrocal", "Rosa Flores", "Karla Ramos", "Ricardo Paredes"};
		int[] arrNota = {15, 12, 17, 8};
		
		System.out.println("BÚSQUEDA DE DATOS");
		System.out.println("-----------------");
		System.out.println("Ingrese código......:");
		String codigo = sc.nextLine();
		
		int P = -1;
		
		for (int x = 0; x < arrCodigo.length; x++) {
			if (codigo.equals(arrCodigo[x])) {
				P = x;
				break;
		
			}
		}
		
		if (P == -1) {
			System.out.println("-----------------");
			System.out.println("Código registrado");
			System.out.println("-----------------");
			
		}
		else {
			System.out.println("-----------------");
			System.out.println("Código registrado");
			System.out.println("-----------------");
			System.out.println("Código....." + arrCodigo[P]);
			System.out.println("Alumno....." + arrNombre[P]);
			System.out.println("Nota......." + arrNota[P]); 			
			
			if (arrNota[P] >= 13)
				System.out.println("Estado.....: Aprobado");
			else
				System.out.println("Estado.....: Desaprobado");
		}
	}
}
