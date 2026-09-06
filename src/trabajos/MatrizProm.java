package trabajos;

public class MatrizProm
{
	private int mat[][], vec[];
	private int ren, col, ind, prom = 0, pro;
	private Datos obd = new Datos();

	public void Tamaño()
	{
		System.out.println("Escribe los datos del alumno:");
		do
			ren = obd.Entero("No. de materias? ");
		while (ren < 3 || ren > 8);
		mat = new int[ren][];
		System.out.println("No. de temas por materia...");
		for (ren = 0; ren < mat.length; ren++)
		{
			do
				col = obd.Entero((ren + 1) + "? ");
			while (col < 3 || col > 7);
			mat[ren] = new int[col];
		}
		vec = new int[ren];
	}

	public void Aleatorios()
	{
		java.util.Random obr = new java.util.Random();
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat[ren].length; col++)
				mat[ren][col] = obr.nextInt(31) + 70;
	}

	public void Promedio()
	{
		for (ren = 0, ind = 0; ren < mat.length; ren++, ind++)
		{
			for (pro = 0, col = 0; col < mat[ren].length; col++)
				pro += mat[ren][col];
			pro /= mat[ren].length;
			vec[ind] = pro;
		}

		for (ind = 0; ind < vec.length; ind++)
			prom += vec[ind];
		prom /= vec.length;
	}

	public void Mostrar()
	{
		int val;
		System.out.println("\n# Mat. Calificaciones" + obd.Derecha("Pro", 64));
		for (ren = 0, ind = 0; ren < mat.length && ind < vec.length; ren++, ind++)
		{
			System.out.print((ren + 1) + " .-\t");
			for (col = 0; col < mat[ren].length; col++)
				System.out.print(mat[ren][col] + "\t");
			System.out.print("");
			val = mat[ren].length;
			if (val != 7)
			{
				switch (val)
				{
					case 3:
						System.out.print(obd.Derecha(String.valueOf(vec[ind]), 52));
						break;
					case 4:
						System.out.print(obd.Derecha(String.valueOf(vec[ind]), 44));
						break;
					case 5:
						System.out.print(obd.Derecha(String.valueOf(vec[ind]), 36));
						break;
					case 6:
						System.out.print(obd.Derecha(String.valueOf(vec[ind]), 28));
						break;
				}
			}
			else
				System.out.print(obd.Derecha(String.valueOf(vec[ind]), 20));
			System.out.println();
		}
		System.out.println(obd.Derecha("Promedio:" + prom + "", 84));
	}
}
