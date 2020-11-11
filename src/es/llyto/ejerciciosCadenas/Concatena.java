package es.llyto.ejerciciosCadenas;

import java.util.Scanner;

public class Concatena
{

	public static void main(String[] args)
	{
		String cadena1, cadena2, resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce cadena 1: ");
		cadena1 = teclado.nextLine();
		System.out.println("Introduce cadena2: ");
		cadena2 = teclado.nextLine();
		teclado.close();
		
		resultado = cadena1 + " " + cadena2;
		System.out.println(resultado);

	}

}
