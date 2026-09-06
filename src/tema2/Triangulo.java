package tema2;

public class Triangulo
{
	private double base, altura, area;

	public void Leer() throws java.io.IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Cual es el valor de la base: ");
		base = Double.parseDouble(obb.readLine().trim());
		System.out.print("Cual es el valor de la altura: ");
		altura = Double.parseDouble(obb.readLine().trim());
	}

	public void Calcular()
	{
		area = base * altura / 2;
	}

	public void Mostrar()
	{
		System.out.println("El area del triangulo es: " + area);

	}
}
