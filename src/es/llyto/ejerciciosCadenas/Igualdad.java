package es.llyto.ejerciciosCadenas;

import java.util.Scanner;

public class Igualdad
{

	public static void main(String[] args)
	{
		String cadena1, cadena2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce cadena1: ");
		cadena1 = teclado.nextLine();
		System.out.println("Introduce cadena2: ");
		cadena2 = teclado.nextLine();
		teclado.close();
		
		if(cadena1.equals(cadena2)) 
		{
			System.out.println("Las dos cadenas son iguales");
		}else 
		{
			System.out.println("Las cadenas son diferentes");
		}

	}

}
