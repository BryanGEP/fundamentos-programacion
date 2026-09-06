package tema3;

import java.io.IOException;

public class TablaDoWhile
{
	private int num, con = 1, res;
	private java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	public void Numero() throws IOException
	{
		System.out.print("Cual es el número para calcular la tabla: ");
		num = Integer.parseInt(obb.readLine().trim());
	}

	public void Calcular() throws IOException
	{
		do
		{
			res = num * con;
			this.Mostrar();
			con++;
		}
		while (con < 10);
	}

	public void Mostrar()
	{
		System.out.println(num + " x " + con + " = " + res);
	}
}
