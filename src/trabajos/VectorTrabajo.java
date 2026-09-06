package trabajos;

import tema4.Datos;

public class VectorTrabajo
{
	private int vec[], ind, rep, ran;
	private Datos obd = new Datos();

	public void Tamaño()
	{
		do
			ind = obd.Entero("Cual es el tamaño del vector: ");
		while (ind < 1);
		vec = new int[ind];
		do
			ran = obd.Entero("Cual es el rango de numeros aleatorios?: ");
		while (ran < 1);
	}

	public void Aleatorio()
	{
		java.util.Random obr = new java.util.Random();
		for (ind = 0; ind < vec.length; ind++)
		{
			vec[ind] = obr.nextInt(ran);
			for (rep = 0; rep < ind; rep++)
				if (vec[ind] == vec[rep])
					ind--;
		}
	}

	public void Burbuja()
	{
		int con, aux;
		for (con = 1; con <= vec.length; con++)
			for (ind = 0; ind < vec.length - 1; ind++)
				if (vec[ind] < vec[ind + 1])
				{
					aux = vec[ind];
					vec[ind] = vec[ind + 1];
					vec[ind + 1] = aux;
				}
	}

	public void Promedio()
	{
		double pro = 0;
		for (ind = 0; ind < vec.length; ind++)
			pro += vec[ind];
		pro /= vec.length;
		System.out.println("\nEl promedio de todos los datos es -> [" + pro + "]");
	}

	public void Mostrar()
	{
		System.out.println("\nDatos del vector...");
		for (ind = 0; ind < vec.length; ind++)
			System.out.println((ind + 1) + " [ " + vec[ind] + " ]");
	}

}
