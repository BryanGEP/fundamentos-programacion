package tema3;

public class ParImparSucesivas
{
	private int num;
	private String msj;
	private Datos obd = new Datos();

	public void Leer() throws java.io.IOException
	{
		do
			num = obd.Entero("Escribe un número :");
		while (num == 0);
	}

	public void Calcular()
	{
		if (num > 0)
			for (; num >= 2; num -= 2)
				;
		else
			for (; num <= -2; num += 2)
				;
		if (num == 0)
			msj = "Numero par.....";
		else
			msj = "Numero Impar....";

	}

	public void Mostrar()
	{
		System.out.println(msj);
	}
}
