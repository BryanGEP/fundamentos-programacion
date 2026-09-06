package trabajos;

import java.io.IOException;

public class Trabajo3
{
	private int hrs;
	private double pre, sal, imp = 0, tot;

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

		if (hrs <= 40)
		{
			sal = hrs * pre;
		}
		else
		{
			sal = (hrs - 40) * pre * .45;
			sal += (40 * pre);
		}

		if (sal <= 1500)
		{
			sal = sal;
		}

		if (sal > 1500 && sal <= 3500)
		{
			imp = (sal - 1500) * .16;
		}

		if (sal > 5000)
		{
			imp = 3500 * .16 + (sal - 5000) * .37;
		}

		tot = sal - imp;

	}

	public void Mostrar()
	{
		System.out.println("El sueldo base es: " + sal);
		System.out.println("Pago de impuestos: " + imp);
		System.out.println("El sueldo neto es: " + tot);
	}
}
