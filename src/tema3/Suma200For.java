package tema3;

public class Suma200For
{
	private int con, sum;

	public void Calcular()
	{
		for (con = 2, sum = 0; con <= 200; sum += con, con += +2);
	}

	public void Mostrar()
	{
		System.out.print("La suma es " + sum);
	}
}
