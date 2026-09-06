package tema3;

public class ParImpar
{
	private int num;
	private String msj;

	public void Leer() throws java.io.IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Escribe un numero: ");
		num = Integer.parseInt(obb.readLine().trim());
	}

	public void Calcular()
	{
		if (num % 2 == 0)
			msj = "NUMERO PAR";
		else
			msj = "Numero Impar";
		// if (num % 2 == 1)
		// msj = "NUMERO IMPAR";
	}

	public void Mostrar()
	{
		System.out.println(msj);
	}

}
