package tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Suma
{

	private int num1, num2, suma;

	public void LeerNumeros() throws IOException
	{
		BufferedReader obb = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Escribe el primer numero");
		num1 = Integer.parseInt(obb.readLine().trim());
		System.out.print("Escribe el segundo numero");
		num2 = Integer.parseInt(obb.readLine().trim());
	}

	public void CalcularSuma()
	{
		suma = num1 + num2;
	}

	public void MostrarSuma()
	{
		System.out.println("La suma es " + suma);
	}

}
