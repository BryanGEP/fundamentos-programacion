package tema3;

import java.io.IOException;

public class Circulo
{
	private double area, radio;

	public void Radio() throws IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Escribe el valor del radio: ");
		radio = Double.parseDouble(obb.readLine().trim());
	}

	public void Area()
	{
		area = Math.PI * Math.pow(radio, 2);
	}

	public void Mostrar()
	{
		System.out.println("El area del circulo es: " + area);
	}
}
