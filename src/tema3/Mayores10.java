package tema3;

public class Mayores10
{
	private int num, num2, tot;
	private String msj;

	public void Leer() throws java.io.IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Escribe el primer numero: ");
		num = Integer.parseInt(obb.readLine().trim());
		System.out.print("Escribe el segundo numero: ");
		num2 = Integer.parseInt(obb.readLine().trim());
	}

	public void Calcular()
	{
		if (num > 10 && num2 > 10)
		{
			tot = num - num2;
			msj = "Resta";
		}

		else
		{
			tot = num + num2;
			msj = "Suma";
		}
	}

	public void Mostrar()
	{
		System.out.println("Es una " + msj + " y su  resultado es " + tot);
	}

}
