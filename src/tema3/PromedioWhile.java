package tema3;

import java.io.IOException;

public class PromedioWhile
{
	private int con = 1, cona = 0;
	private double sum = 0, pro = 0, cal;
	private java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	private void Calificaciones() throws IOException
	{
		cal = -1;
		while (cal < 0 || cal > 100)
		{
			System.out.print("Escribe la " + con + " calificacion ");
			cal = Double.parseDouble(obb.readLine().trim());
		}
	}

	public void Calcular() throws IOException
	{
		while (con <= 10)
		{
			this.Calificaciones();
			if (cal >= 70)
			{
				sum += cal;
				cona++;
			}
			con++;
		}
		if (cona != 0)
			pro = sum / cona;
	}

	public void Mostrar()
	{
		System.out.println("El promedio es " + pro);
		System.out.println("Cantidad de calificaciones " + cona);

	}
}
