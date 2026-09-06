package tema3;

public class SumaFor
{
	private int con, sum;

	public void Calcular()
	{
		// for(con=1;con<=100;con++)
		// sum+=con;
		for (con = 1, sum = 0; con <= 100; sum += con, con++);
	}

	public void Mostrar()
	{
		System.out.print("La suma es " + sum);
	}
}
