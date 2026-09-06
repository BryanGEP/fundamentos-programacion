package tema3;

import java.io.IOException;

public class Angulos
{
	double base, altura, hipot, sin, cos, tan;
	private java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	public void Altura() throws IOException
	{
		System.out.print("Escribe la base: ");
		base = Double.parseDouble(obb.readLine().trim());
	}

	public void Base() throws IOException
	{
		System.out.print("Escribe la altura: ");
		altura = Double.parseDouble(obb.readLine().trim());
	}

	public void Calcular()
	{
		// hipot = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		hipot = Math.hypot(base, altura);
		sin = Math.sin(altura / hipot);
		cos = Math.sin(base / hipot);
		tan = Math.sin(altura / base);
	}

	public void Mostrar()
	{
		System.out.print("Hipotenusa: " + hipot);
		System.out.print("Seno: " + sin);
		System.out.print("Coseno: " + cos);
		System.out.print("tangente: " + tan);
	}

}
