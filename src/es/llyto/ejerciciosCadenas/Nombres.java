package es.llyto.ejerciciosCadenas;
import java.util.Scanner;

public class Nombres
{

	public static void main(String[] args)
	{		
		String nombre1, nombre2, nombre3, nombre4, nombre5;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce nombre 1: ");
		nombre1 = teclado.nextLine();
		System.out.println("Introduce nombre 2: ");
		nombre2 = teclado.nextLine();
		System.out.println("Introduce nombre 3: ");
		nombre3 = teclado.nextLine();
		System.out.println("Introduce nombre 4: ");
		nombre4 = teclado.nextLine();
		System.out.println("Introduce nombre 5: ");
		nombre5 = teclado.nextLine();
		teclado.close();
		
		System.out.println("El primer nombre es "+ nombre1);
		System.out.println("El segundo nombre es "+ nombre2);
		System.out.println("El tercer nombre es "+ nombre3);
		System.out.println("El cuarto nombre es "+ nombre4);
		System.out.println("El quinto nombre es "+ nombre5);

	}

}




















