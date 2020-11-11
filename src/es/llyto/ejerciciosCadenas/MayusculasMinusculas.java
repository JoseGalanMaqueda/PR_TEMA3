package es.llyto.ejerciciosCadenas;

import java.util.Scanner;

public class MayusculasMinusculas
{

	public static void main(String[] args)
	{
		String cadena;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe una cadena: ");
		cadena = teclado.nextLine();
		
		teclado.close();
		
		System.out.println(cadena.toLowerCase()); // Para pasar a Minusculas
		System.out.println(cadena.toUpperCase()); // Para pasar a Mayusculas

	}

}
