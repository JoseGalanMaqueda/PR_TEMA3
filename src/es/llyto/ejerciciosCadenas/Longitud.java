package es.llyto.ejerciciosCadenas;

import java.util.Scanner;

public class Longitud
{

	public static void main(String[] args)
	{
		String cadena;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		cadena = teclado.nextLine();
		teclado.close();
		System.out.println(fun_longitud(cadena));
	}
	
	public static String fun_longitud(String cadena) 
	{
		return "La cadena con espacios tiene una logitud de "+cadena.length()+" y sin espacios tiene esta longitud "+cadena.replaceAll("\\s", "").length();
	}

}
