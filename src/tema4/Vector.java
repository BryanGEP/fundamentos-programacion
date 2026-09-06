package tema4;

public class Vector
{
	private int vec[] = new int[10], ind;
	private Datos obd = new Datos();

	public void Lectura()
	{
		System.out.println("Escribe los " + vec.length + " números del arreglo...");
		for (ind = 0; ind < vec.length; ind++)
			vec[ind] = obd.Entero((ind + 1) + ".-");
	}

	public void Mostrar()
	{
		System.out.println("\nDatos del vector...");
		for (ind = 0; ind < vec.length; ind++)
			System.out.println((ind + 1) + " [ " + vec[ind] + " ]");
	}

	public void Tamaño()
	{
		do
			ind = obd.Entero("Cual es el tamaño del vector: ");
		while (ind < 1);
		vec = new int[ind];
	}

	public void Aleatorio()
	{
		java.util.Random obr = new java.util.Random();
		for (ind = 0; ind < vec.length; ind++)
			vec[ind] = obr.nextInt(50) + 50;
	}

	public void Menor()
	{
		int men = vec[0];
		for (ind = 1; ind < vec.length; ind++)
			if (vec[ind] < men)
				men = vec[ind];
		System.out.println("El menor es: " + men);
	}

	public void Mayor()
	{
		int may = vec[0];
		for (ind = 1; ind < vec.length; ind++)
			if (vec[ind] > may)
				may = vec[ind];
		System.out.println("El mayor es: " + may);
	}

	public void Aleatorios100()
	{
		java.util.Random obr = new java.util.Random();
		for (ind = 0; ind < vec.length; ind++)
			vec[ind] = obr.nextInt(100) + 1;
	}

	public void Buscar()
	{
		int num;
		boolean ban = true;
		num = obd.Entero("Cual es el número a buscar? ");
		for (ind = 0; ind < vec.length; ind++)
			if (vec[ind] == num)
			{
				if (ban)
					System.out.println("Posicion o posiciones donde se encontroel numero...");
				System.out.println((ind + 1));
				ban = false;
			}
		if (ban)
			System.out.println("Elemento no encontrado...");
	}

	public void Aleatorios70()
	{
		java.util.Random obr = new java.util.Random();
		for (ind = 0; ind < vec.length; ind++)
			vec[ind] = obr.nextInt(31) + 70;
	}

	public void Promedio()
	{
		int pro = 0;
		for (ind = 0; ind < vec.length; ind++)
			pro += vec[ind];
		pro /= vec.length;
		System.out.println("El promedio es: " + pro);
	}

	public void Burbuja()
	{
		int con, aux;
		for (con = 1; con <= vec.length; con++)
			for (ind = 0; ind < vec.length - 1; ind++)
				if (vec[ind] > vec[ind + 1])
				{
					aux = vec[ind];
					vec[ind] = vec[ind + 1];
					vec[ind + 1] = aux;
				}
	}

	public void ParImpar()
	{
		int[] par, impar;
		int cp = 0, ci;
		for (ind = 0; ind < vec.length; ind++)
			if (vec[ind] % 2 == 0)
				cp++;
		ci = vec.length - cp;
		par = new int[cp];
		impar = new int[ci];
		for (ind = 0, cp = 0, ci = 0; ind < vec.length; ind++)
			if (vec[ind] % 2 == 0)
				par[cp++] = vec[ind];
			else
				impar[ci++] = vec[ind];
		System.out.println("\nAregglo de pares (" + par.length + ")...");
		for (ind = 0; ind < par.length; ind++)
			System.out.println(par[ind]);
		System.out.println("\nAregglo de impares (" + impar.length + ")...");
		for (ind = 0; ind < impar.length; ind++)
			System.out.println(impar[ind]);
	}

	public void Media()
	{
		int pro = 0, men;
		int dif[] = new int[vec.length];
		for (ind = 0; ind < vec.length; ind++)
			pro += vec[ind];
		pro /= vec.length;
		for (ind = 0; ind < vec.length; ind++)
			dif[ind] = Math.abs(vec[ind] - pro);
		men = dif[0];
		for (ind = 0; ind < dif.length; ind++)
			// if (ind != 0)
			// {
			if (dif[ind] < men)
				men = dif[ind];
		// }
		// else
		// men = dif[ind];
		System.out.println("Numeros que se aproximan a la media(" + pro + ")");
		for (ind = 0; ind < vec.length; ind++)
			if (dif[ind] == men)
				System.out.println(vec[ind]);
	}

	public void Repetido()
	{
		int may, com;
		int con[] = new int[vec.length];
		for (ind = 0; ind < vec.length; ind++)
			for (com = ind; com < vec.length; com++)
				if (vec[ind] == vec[com])
					con[ind] = con[ind] + 1;
		may = con[0];
		for (ind = 0; ind < con.length; ind++)
			if (con[ind] > may)
				may = con[ind];
		System.out.println("Numeros que mas se repiten" + may + " veces");
		for (ind = 0; ind < vec.length; ind++)
			if (con[ind] == may)
				System.out.println(vec[ind]);
	}
}
