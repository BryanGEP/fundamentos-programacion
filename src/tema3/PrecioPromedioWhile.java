package tema3;

public class PrecioPromedioWhile
{
	private int con = 1;
	private double pre, sum = 0, prom = 0;
	private java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	private void Precio() throws java.io.IOException
	{
		pre = 0;
		while (pre < 1)
		{
			System.out.print("Precio del " + con + " año");
			pre = Double.parseDouble(obb.readLine().trim());
		}
	}

	public void Calcular() throws java.io.IOException
	{
		while (con <= 6)
		{
			this.Precio();
			sum += pre;
			con++;
		}
		prom = sum / 6;
	}

	public void Mostrar()
	{
		System.out.println("El precio promedio es " + prom);
	}
}
