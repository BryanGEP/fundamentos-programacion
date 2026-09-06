package tema3;

import java.io.IOException;

public class Cafeteria
{
	private int huevo, torta, refresco, jugo;
	private final double PH = 25, PT = 20, PR = 8, PJ = 10;
	private double sub, iva, tot;

	public void Consumo() throws IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println("Cual es la cantidad de consumo de los siguientes productos: ");
		System.out.print("Huevos: ");
		huevo = Integer.parseInt(obb.readLine().trim());
		System.out.print("Tortas: ");
		torta = Integer.parseInt(obb.readLine().trim());
		System.out.print("Refrescos: ");
		refresco = Integer.parseInt(obb.readLine().trim());
		System.out.print("Jugo: ");
		jugo = Integer.parseInt(obb.readLine().trim());
	}

	public void Calcular()
	{
		sub = huevo * PH + torta * PT + refresco * PR + jugo * PJ;
		iva = sub * .16;
		tot = sub * 1.16;
	}

	public void Mostrar()
	{
		System.out.println("El subtotal es: " + sub);
		System.out.println("El iva es: " + iva);
		System.out.println("El total es: " + tot);
	}
}
