package tema3;

import java.io.IOException;

public class Grados
{
	double gc, gf;
	private java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	public void Centigrados() throws IOException
	{
		System.out.print("Escribe la cantidad de grados centigrados: ");
		gc = Double.parseDouble(obb.readLine().trim());
	}

	public void Calcular()
	{
		gf = gc * 9 / 5 + 32;
	}

	public void Mostrar()
	{
		System.out.print("Los grados fahrenheit son: " + gf);
	}
}
