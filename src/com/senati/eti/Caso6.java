package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		String[][] datos = {{"Erick Berrocal", "Rosa Flores", "Ricardo Tello"},
				            {"San Juan de Lurigancho", "Puente Piedra", "Comas"}};
		
		// Impresión de valores por filas
		for (int f = 0; f < datos.length; f++) {
			for (int c = 0; c < datos[0].length; c++)
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
			
			System.out.println();
		}
		
		System.out.println();
		
		// Impresión de valores por columnas
		System.out.println(" ------ IMPRESIÓN POR COLUMNAS ------ ");
		for (int c = 0; c < datos[0].length; c++) {
			for (int f = 0; f < datos.length; f++)
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
			
			System.out.println();
		}

	}

}
