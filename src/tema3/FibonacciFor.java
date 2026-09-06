package tema3;

public class FibonacciFor
{
	private int val1, val2, val3, ser, can, con;
	private Datos obd = new Datos();

	public void Cantidad()
	{
		do
			can = obd.Entero("Cantidad de número de la serie :");
		while (can < 1);
	}

	public void Semillas()
	{
		do
		{
			val1 = obd.Entero("Valor de la primer semilla :");
			val2 = obd.Entero("Valor de la segunda semilla :");
			val3 = obd.Entero("Valor de la tercer semilla :");
		}
		while (val1 == 0 && val2 == 0 && val3 == 0);
	}

	public void Calcular()
	{
		System.out.println("Valores de la serie de fibonacci...");
		for (con = 1; con <= can; con++)
		{
			ser = val1 + val2 + val3;
			this.Mostrar();
			val1 = val2;
			val2 = val3;
			val3 = ser;
		}
	}

	private void Mostrar()
	{
		System.out.println(ser);
	}

}
