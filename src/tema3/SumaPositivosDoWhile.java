package tema3;

import java.io.IOException;

public class SumaPositivosDoWhile
{
	private int can, num, sump = 0, sumn = 0, con = 1, conn = 0, prom = 0;
	private java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	public void Cantidad() throws IOException
	{
		do
		{
			System.out.print("Dame la cantidad de numeros: ");
			can = Integer.parseInt(obb.readLine().trim());
		}
		while (can < 1);
	}

	private void Numero() throws IOException
	{
		System.out.print("Escribe el  " + con + " numero ");
		num = Integer.parseInt(obb.readLine().trim());
	}

	public void Calcular() throws IOException
	{
		do
		{
			Numero();
			if (num < 0)
			{
				sumn += num;
				conn++;
			}
			else
				sump += num;
			con++;
		}
		while (con <= can);
		if (conn != 0)
			prom = sumn / conn;

	}

	public void Mostrar()
	{
		System.out.println("La suma de los negativos es: " + sump);
		System.out.println("La media aritmetica es: " + prom);

	}

}
