package trabajos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trabajo
{

	private int hrs, hrse;
	private double pre, total, vivienda, ahorro, impuestos, fin, hrset, hrst;

	public void Leer() throws IOException

	{

		BufferedReader obb = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Horas trabajadas: ");
		hrs = Integer.parseInt(obb.readLine().trim());
		System.out.print("Horas extra: ");
		hrse = Integer.parseInt(obb.readLine().trim());
		System.out.print("Precio por hora: ");
		pre = Double.parseDouble(obb.readLine().trim());

	}

	public void Calcular()
	{

		hrst = (hrs * pre);
		hrset = ((hrse * pre) * 2);
		total = hrst + hrset;

		vivienda = total * 0.10;
		ahorro = total * 0.05;
		impuestos = total * 0.16;

		fin = total - (vivienda + ahorro + impuestos);

	}

	public void Mostrar()
	{
		System.out.println("El sueldo base es: " + hrst);
		System.out.println("Gana por horas extra: " + hrset);
		System.out.println("El subtotal es: " + total);
		System.out.println("El pago de fondo de vivienda es: " + vivienda);
		System.out.println("El pago de fondo de ahorro es: " + ahorro);
		System.out.println("El pago de impuestos es: " + impuestos);
		System.out.println("El sueldo total es: " + fin);
	}
}
