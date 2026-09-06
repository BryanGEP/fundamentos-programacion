package tema3;

public class Multiplos57
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
		if (num % 5 == 0)
			msj = "Numero multiplo de 5...\n";
		if (num % 7 == 0)
			msj +="Numero multiplo de 7...";
		// msj= msj+"Numero multiplo de 7... ";
	}

	public void Mostrar()
	{
		System.out.println(msj);
	}
}
