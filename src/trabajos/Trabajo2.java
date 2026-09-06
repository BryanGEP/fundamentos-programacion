package trabajos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trabajo2
{
	private int cat1, cat2, cat3, cat4, libros;
	private double subt, cat1t, cat2t, cat3t, cat4t, cat1s, cat2s, cat3s, cat4s, total, des;

	public void Cantidad() throws IOException
	{
		BufferedReader obb = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Ingresa la cantidad de libros de la categoria 1: ");
		cat1 = Integer.parseInt(obb.readLine().trim());
		System.out.print("Ingresa la cantidad de libros de la categoria 2: ");
		cat2 = Integer.parseInt(obb.readLine().trim());
		System.out.print("Ingresa la cantidad de libros de la categoria 3: ");
		cat3 = Integer.parseInt(obb.readLine().trim());
		System.out.print("Ingresa la cantidad de libros de la categoria 4: ");
		cat4 = Integer.parseInt(obb.readLine().trim());
	}

	public void Calcular()
	{

		libros = cat1 + cat2 + cat3 + cat4;
		cat1s = cat1 * 175.59;
		cat2s = cat2 * 245.25;
		cat3s = cat3 * 365.80;
		cat4s = cat4 * 499.95;
		subt = cat1s + cat2s + cat3s + cat4s;

		cat1t = cat1s * 0.05;
		cat2t = cat2s * 0.07;
		cat3t = cat3s * 0.10;
		cat4t = cat4s * 0.15;
		des = cat1t + cat2t + cat3t + cat4t;

		total = subt - des;
	}

	public void Mostrar()
	{
		System.out.println("Los libros comprados fueron: " + libros);
		System.out.println("El subtotal de los libros comprados es: " + subt);
		System.out.println("El descuento total es: " + des);
		System.out.println("El total: " + total);
	}

}
