package tema3;

public class TablasFor
{
	private int num, con, res;

	public void Calcular()
	{

		for (num = 1; num <= 10; num++)
		{
			System.out.println("\nTabla del " + num + "....");
			for (con = 1; con <= 10; con++)
			{
				res = num * con;
				this.Mostrar();
			}
		}
	}

	private void Mostrar()
	{
		System.out.println(num + "x" + con + "=" + res);
	}

}
