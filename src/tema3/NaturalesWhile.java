package tema3;

import java.io.IOException;

public class NaturalesWhile
{
	private int con = 1, sum = 0;

	public void Calcular() throws IOException
	{
		while (con <= 50)
		{
			sum += con;
			con++;
		}

	}

	public void Mostrar()
	{
		System.out.println("La suma es: " + sum);
	}

}
