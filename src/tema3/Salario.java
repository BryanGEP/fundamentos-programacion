package tema3;

import java.io.IOException;

public class Salario
{
	private int hrs;
	private double pre, sal;

	public void Leer() throws IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Ingresa las horas trabajadas: ");
		hrs = Integer.parseInt(obb.readLine().trim());
		System.out.print("Ingresa el precio por hora: ");
		pre = Double.parseDouble(obb.readLine().trim());
	}

	public void Calcular()
	{
		if (hrs <= 50)
			if (hrs <= 40)
				sal = hrs * pre;
			else
				sal = hrs * pre * 1.08;
		else
			sal = hrs * pre * 1.12;

	}

	public void Mostrar()
	{
		System.out.println("La tarifa es: " + sal);
	}
}
