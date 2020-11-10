package es.llyto.ejercicios;

import java.util.Scanner;

public class Compara
{

	public static void main(String[] args)
	{
		String cadena1, cadena2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce cadena 1: ");
		cadena1 = teclado.nextLine();
		System.out.println("Introduce cadena 2: ");
		cadena2 = teclado.nextLine();
		teclado.close();
		
		if(cadena1.length() == cadena2.length()) 
		{
			System.out.println("Las cadenas son iguales en cuanto a longitud");
		}else if(cadena1.length() < cadena2.length()) 
		{
			System.out.println("La cadena "+ cadena2+ " es mayor");
		}else {
			System.out.println("La cadena "+cadena1+" es mayor");
		}
		
		
	}

}










