package tema3;

import java.io.IOException;

public class Autos
{
	private int can = 0, cana, otro;
	private double pre, sub, des, tot, ssub, sdes, stot;
	private java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	public void Precio() throws IOException
	{

		pre = 0;
		while (pre < 1)
		{
			System.out.println("Cual es el precio por cada auto ");
			pre = Double.parseDouble(obb.readLine().trim());
		}

	}

	private void CantidadAutos() throws IOException
	{
		cana = 0;
		while (cana < 1)
		{
			System.out.println("Cual es la cantdad de autos que compro ");
			cana = Integer.parseInt(obb.readLine().trim());
		}

	}

	public void Calcular() throws IOException
	{
		otro = 1;
		while (otro == 1)
		{
			can++;
			System.out.println("Atendiendo al cliente numero " + can + "......");
			this.CantidadAutos();
			sub = pre * cana;
			switch (can)
			{
				case 1:
					des = sub * .05;
					break;
				case 2:
					des = sub * .08;
					break;
				case 3:
					des = sub * .12;
					break;
				case 4:
					des = sub * .15;
					break;
				default:
					des = 0;
			}
			tot = sub - des;
			this.Mostrar();
			ssub += sub;
			sdes += des;
			stot += tot;
			System.out.println("Hay otro cliente por atender? 1)SI 2)NO");
			otro = Integer.parseInt(obb.readLine().trim());
		}
	}

	private void Mostrar()
	{
		System.out.println("subtotal............$" + sub);
		System.out.println("Descuento.............$" + des);
		System.out.println("Total a pagar...............$" + tot);
	}

	public void Totales()
	{
		System.out.println("Datos del mes:");
		System.out.println("Cantidad de clientes atendidos: " + can);
		System.out.println("subtotal ventas............$ " + ssub);
		System.out.println("Descuento .............$" + sdes);
		System.out.println("Total ventas...............$" + stot);
	}
}
