package tema3;

public class FactorialFor
{
	private int num, fac;
	private java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	public void Numero() throws java.io.IOException
	{
		for (num = -1; num < 0;)
		{
			System.out.print("Ingresa el numero: ");
			num = Integer.parseInt(obb.readLine().trim());
		}
	}

	public void Calcular()
	{
		for (fac = 1; num > 1; fac *= num, num--);
	}

	public void Mostrar()
	{
		System.out.print("El factorial es: "+fac);
	}
}
