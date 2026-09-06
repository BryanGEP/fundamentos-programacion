package tema4;

public class Reticula
{
	private int pos, clv, ind;
	private Materia lista[];
	private Datos obd = new Datos();

	public void Cantidad()
	{
		do
			pos = obd.Entero("Cantidad de materias de la reticula? ");
		while (pos < 1);
		lista = new Materia[pos];
		pos = -1;
	}

	public void Nueva()
	{
		if (pos + 1 < lista.length)
		{
			lista[++pos] = new Materia();
			lista[pos].Lectura();
		}
		else
			System.out.println("No hay espacio para otra materia...");
	}

	public void Lista()
	{
		if (pos != -1)
		{
			System.out.println("Lista de materias de la reticula...");
			for (ind = 0; ind <= pos; ind++)
				lista[ind].Mostrar();
		}
		else
			System.out.println("No hay materias registradas...");
	}

	public void Buscar()
	{
		if (pos != -1)
		{
			do
				clv = obd.Entero("Cave de la materia a buscar? ");
			while (clv < 1);
			for (ind = 0; ind <= pos; ind++)
				if (lista[ind].getClave() == clv)
				{
					System.out.println("Materia encontrada...");
					lista[ind].Mostrar();
					break;
				}
			if (ind > pos)
				System.out.println("La materia no esta en la lista");
		}
		else
			System.out.println("No hay materias registradas...");
	}
}
