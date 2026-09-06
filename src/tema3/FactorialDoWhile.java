package tema3;

import java.io.IOException;

public class FactorialDoWhile
{
	private int num, con = 1;
	private long fac = 1;

	public void Leer() throws IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		do
		{
			System.out.print("Dame un numero: ");
			num = Integer.parseInt(obb.readLine().trim());
		}
		while (num < 0 || num > 20);
	}

	public void Calcular()
	{
		do
		{
			fac *= con;
			con++;
		}
		while (con <= num);
	}

	public void Mostrar()
	{
		System.out.println("El factorial es: " + fac);
	}

}
