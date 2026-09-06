package tema3;

public class Division
{
	private double num1, num2, res;

	public void Leer() throws java.io.IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Ingresa el primer numero: ");
		num1 = Double.parseDouble(obb.readLine().trim());
		System.out.print("Ingresa el segundo numero: ");
		num2 = Double.parseDouble(obb.readLine().trim());
	}

	public void Calcular()
	{
		res = num1 / num2;
		if (res > 5)
			Mostrar();
	}

	private  void Mostrar()
	{
		System.out.print("El resultado es: " + res);
	}

}
