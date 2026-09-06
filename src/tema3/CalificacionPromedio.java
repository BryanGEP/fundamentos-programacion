package tema3;

import java.io.IOException;

public class CalificacionPromedio
{
	private double cal1, cal2, cal3, cal4, pro;
	private String msj;

	public void Calificaciones() throws IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println("Escribe las calificaciones.... ");
		System.out.print("Escribe la calificacion numero 1: ");
		cal1 = Double.parseDouble(obb.readLine().trim());
		System.out.print("Escribe la calificacion numero 2: ");
		cal2 = Double.parseDouble(obb.readLine().trim());
		System.out.print("Escribe la calificacion numero 3: ");
		cal3 = Double.parseDouble(obb.readLine().trim());
		System.out.print("Escribe la calificacion numero 4: ");
		cal4 = Double.parseDouble(obb.readLine().trim());
	}

	public void Calcular()
	{
		pro = (cal1 + cal2 + cal3 + cal4) / 4;
		if (pro >= 70 && pro <= 100)
			msj = "Aprobado " + pro;
		else
			msj = "Reprobado " + pro;
	}

	public void Mostrar()
	{
		System.out.println(msj);
	}
}
