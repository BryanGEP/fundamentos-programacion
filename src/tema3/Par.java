package tema3;

public class Par
{
	private int num;
	private String msj = "";

	public void Leer() throws java.io.IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Escribe un numero: ");
		num = Integer.parseInt(obb.readLine().trim());
	}

	public void Calcular()
	{
		if (num % 2 == 0)
			msj = "NUMERO PAR: " + num;
	}

	public void Mostrar()
	{
		System.out.println(msj);
	}

}
