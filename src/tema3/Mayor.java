package tema3;

public class Mayor
{
	private int num, num2, tot;

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
		if (num > num2)
			tot = num;
		else
			tot = num2;
	}

	public void Mostrar()
	{
		System.out.println("El numero mayor es " + tot);
	}

}
