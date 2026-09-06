package tema3;

public class PomedioFor
{
	private int can, con, num, sum = 0, pro;
	private java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	public void Cantidad() throws java.io.IOException
	{
		for (can = 0; can < 1;)
		{
			System.out.print("Cual es la cantidad de numeros: ");
			can = Integer.parseInt(obb.readLine().trim());
		}
	}

	private void Numero() throws java.io.IOException
	{
		System.out.print("Escribe el " + con + " sumero: ");
		num = Integer.parseInt(obb.readLine().trim());
	}

	public void Calcular() throws java.io.IOException
	{
		for (con = 1; con <= can; con++)
		{
			this.Numero();
			sum += num;
		}
		pro = sum / can;
	}

	public void Mostrar()
	{
		System.out.print("El promedio es: " + pro);
	}

}
