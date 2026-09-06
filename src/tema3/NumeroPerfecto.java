package tema3;

public class NumeroPerfecto
{
	private int can, con, num, div, suma;
	private Datos obd = new Datos();

	public void Cantidad() throws java.io.IOException
	{
		do
			can = obd.Entero("CUAL ES LA CANTIDAD DE NUMEROS PERFECTOS QUE BUSCAS: ");
		while (can <= 1);
	}

	public void Calcular()
	{
		for (con = 1, num = 1; con <= can; num++)
		{
			for (div = 1, suma = 0; div < num; div++)
				if (num % div == 0)
					suma += div;

			if (suma == num)
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
