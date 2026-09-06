package tema2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Edad
{
	private int año, edad;

	public void Año() throws IOException
	{
		BufferedReader obb = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Escribe tu año de nacimineto");
		año = Integer.parseInt(obb.readLine().trim());
	}

	public void Calcular()
	{
		edad = 2022 - año;
	}

	public void Mostrar()
	{
		System.out.println("Tu edad al terminar el año actual es " + edad);
	}

}
