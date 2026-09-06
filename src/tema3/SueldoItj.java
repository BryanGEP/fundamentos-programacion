package tema3;

public class SueldoItj
{
	private String nom, nmay, nmen;
	private int nt, con, hrs;
	private double pre, sub, imp, sue, ssub = 0, simp = 0, ssue = 0, spro, smay, smen;
	private Datos obd = new Datos();

	public void Cantidad()
	{
		do
			nt = obd.Entero("Número de trabajadores: ");
		while (nt < 1);
	}

	public void Precio()
	{
		do
			pre = obd.Doble("Precio por hora: ");
		while (pre < 1);
	}

	private void Nombre()
	{
		nom = obd.Cadena("Nombre del " + con + " trabajador").toUpperCase();
	}

	private void Horas()
	{
		do
			hrs = obd.Entero("No. dehoras trabajadas: ");
		while (hrs < 1);
	}

	public void Calcular()
	{
		for (con = 1; con <= nt; con++)
		{
			this.Nombre();
			this.Horas();
			if (hrs > 40)
				sub = 40 * pre + (hrs - 40) * pre * 1.35;
			else
				sub = hrs * pre;
			if (sub > 5000)
				imp = (sub - 5000) * .25 + 3500 * .16;
			else
				if (sub > 1500)
					imp = (sub - 1500) * .16;
				else
					imp = 0;

			sue = sub - imp;
			this.Mostrar();
			ssub += sub;
			simp += imp;
			ssue += sue;
			if (con != 1)
			{
				if (sue > smay)
				{
					nmay = nom;
					smay = sue;
				}
				if (sue < smen)
				{
					nmen = nom;
					smen = sue;
				}
			}
			else
			{
				nmay = nom;
				smay = sue;
				nmen = nom;
				smen = sue;
			}
		}
		spro = ssue / nt;

	}

	private void Mostrar()
	{
		System.out.println("Sueldo base $" + sub);
		System.out.println("Pago de impuestos $" + imp);
		System.out.println("Sueldo total $" + sue);
	}

	public void Totales()
	{
		System.out.println("\nDatos de todos los trabajadores............");
		System.out.println("Sueldo base total $" + ssub);
		System.out.println("Impuestos totales $" + simp);
		System.out.println("Sueldo total $" + ssue);
		System.out.println("Trabajador que gana mas " + nmay + " $" + smay);
		System.out.println("Trabajador que gana menos " + nmen + " $" + smen);
		System.out.println("Sueldo promedio $" + spro);
	}
}
