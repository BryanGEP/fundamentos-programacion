package tema3;

public class TablasDoWhile
{
	private int num = 1, con, res;

	public void Calcular()
	{
		do
		{
			con = 1;
			do
			{
				res = num * con;
				this.Mostrar();
				con++;
			}
			while (con <= 10);
			System.out.println();
			num++;
		}
		while (num <= 10);
	}

	private void Mostrar()
	{
		System.out.println(num + "*" + con + "=" + res);
	}
}
