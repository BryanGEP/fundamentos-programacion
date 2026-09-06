package tema3;

import java.io.IOException;

public class TransformarCal
{
	private int num;
	private String msj;

	public void Leer() throws IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("ESCRIBE LA CALIFICACION NUMERICA: ");
		num = Integer.parseInt(obb.readLine().trim());
	}

	public void Calcular()
	{
		switch (num/10)
		{
			case 10:
				msj = "A";
				break;
			case 9:
				msj = "B";
				break;
			case 8:
				msj = "C";
				break;
			case 7:
				msj = "D";
				break;
			default:
				msj = "NA";
		}

	}

	public void Mostrar()
	{
		System.out.println(msj);
	}

}
