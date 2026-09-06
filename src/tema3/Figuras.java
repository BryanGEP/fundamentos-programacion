package tema3;

import java.io.IOException;

public class Figuras
{

	private double val1, val2, area;
	private java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	private void Valor1(String msj) throws IOException
	{

		System.out.print("Escribe el valor " + msj);
		val1 = Integer.parseInt(obb.readLine().trim());
	}

	private void Valor2() throws IOException
	{

		System.out.print("Escribe el valor de la altura: ");
		val2 = Integer.parseInt(obb.readLine().trim());

	}

	private void Cuadrado() throws IOException
	{

		Valor1("del lado: ");
		area = Math.pow(val1, 2);
		Mostrar();
	}

	private void Triangulo() throws IOException
	{

		Valor1("de la base: ");
		Valor2();
		area = val1 * val2 / 2;
		Mostrar();
	}

	private void Rectangulo() throws IOException
	{

		Valor1("de la base: ");
		Valor2();
		area = val1 * val2;
		Mostrar();
	}

	private void Circulo() throws IOException
	{

		Valor1("del radio: ");
		area = Math.PI * Math.pow(val1, 2);
		Mostrar();
	}

	private void Mostrar()
	{
		System.out.println("El area de la figura es: " + area);
	}

	public void Menu() throws IOException
	{
		int op;
		System.out.println("Menu de area... ");
		System.out.println("1) Cuadrado.");
		System.out.println("2) Triangulo.");
		System.out.println("3) Rectangulo.");
		System.out.println("4) Circulo.");
		System.out.println("Cual es tu opcion?");
		op = Integer.parseInt(obb.readLine().trim());
		System.out.println("");
		switch (op)
		{
			case 1:
				Cuadrado();
				break;
			case 2:
				Triangulo();
				break;
			case 3:
				Rectangulo();
				break;
			case 4:
				Circulo();
				break;
			default:
				System.out.println("Solo tenemos 4 opciones..");
		}

	}

}
