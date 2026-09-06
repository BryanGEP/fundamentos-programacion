package tema3;

import java.io.IOException;

public class Multiplos57DoWhile
{
	private int num, con = 1, con5 = 0, con7 = 0;
	private java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	private void Numero() throws IOException
	{
		System.out.print("Escribe el  " + con + " numero ");
		num = Integer.parseInt(obb.readLine().trim());
	}

	public void Calcular() throws IOException
	{
		do
		{
			this.Numero();
			if (num % 5 == 0)
				con5++;
			if (num % 7 == 0)
				con7++;
		}
		while (con <= 20);
	}

	public void Mostrar()
	{
		System.out.println("Cantidad de multiplos de 5: " + con5);
		System.out.println("Cantidad de multiplos de 7: " + con7);

	}

}
