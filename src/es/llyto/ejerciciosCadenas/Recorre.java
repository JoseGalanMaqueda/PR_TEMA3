package es.llyto.ejerciciosCadenas;

public class Recorre
{

	public static void main(String[] args)
	{
		String cadena = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		
		for(int i=0;i<cadena.length();i++) 
		{
			System.out.println(cadena.charAt(i)); // Esto mostraria letra a letra nuestra cadena
		}

	}

}
