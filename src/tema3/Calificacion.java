package tema3;

public class Calificacion
{
	private int cal;
	private String msj;

	public void Leer() throws java.io.IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Escribe una calificacion: ");
		cal = Integer.parseInt(obb.readLine().trim());
	}

	public void Calcular()
	{
		if (cal >= 70 && cal <= 100)
		{

			msj = "Aprobado";
		}

		else
		{
			msj = "Tienes otra oportunidad";
		}
	}

	public void Mostrar()
	{
		System.out.println(msj);
	}

}
