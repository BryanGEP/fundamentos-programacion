package tema3;

public class Primos
{
	private int can, con, num, div, con0;
	private Datos obd = new Datos();

	public void Cantidad() throws java.io.IOException
	{
		do
			can = obd.Entero("CUAL ES LA CANTIDAD DE NUMEROS PRIMOS QUE BUSCAS: ");
		while (can <= 1);
	}

	public void Calcular()
	{
		for (con = 1, num = 1; con <= can; num++)
		{
			for (div = 1, con0 = 0; div <= num; div++)
				if (num % div == 0)
					con0++;

			if (con0 <= 2)
			{
				this.Mostrar();
				con++;
			}

		}
	}

	private void Mostrar()
	{
		System.out.println(num);
	}
}
