package tema3;

import java.io.IOException;

public class Mayores
{
	private double num1, num2, num3, num4, num5, may;

	public void Leer() throws IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Escribe el primer numero: ");
		num1 = Double.parseDouble(obb.readLine().trim());
		System.out.print("Escribe el segundo numero: ");
		num2 = Double.parseDouble(obb.readLine().trim());
		System.out.print("Escribe el tercer numero: ");
		num3 = Double.parseDouble(obb.readLine().trim());
		System.out.print("Escribe el cuarto numero : ");
		num4 = Double.parseDouble(obb.readLine().trim());
		System.out.print("Escribe el quinto numero : ");
		num5 = Double.parseDouble(obb.readLine().trim());
	}

	public void Calcular()
	{
		may = num1;
		if (num2 > may)
			may = num2;
		if (num3 > may)
			may = num3;
		if (num4 > may)
			may = num4;
		if (num5 > may)
			may = num5;

	}

	public void Mostrar()
	{
		System.out.println("El numero mayor es: " + may);
	}

}
