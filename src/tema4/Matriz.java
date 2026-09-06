package tema4;

public class Matriz
{
	private int mat[][] = new int[5][5];
	private int ren, col;
	private Datos obd = new Datos();

	public void Lectura()
	{
		System.out.println("Escribe los " + mat.length * mat[0].length + " números enteros: ");
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat[ren].length; col++)
				mat[ren][col] = obd.Entero("[" + (ren + 1) + "][" + (col + 1) + "]");
	}

	public void Mostrar()
	{
		System.out.println("\nContenido del arreglo bidimensional...");
		for (ren = 0; ren < mat.length; ren++)
		{
			for (col = 0; col < mat[ren].length; col++)
				System.out.print(mat[ren][col] + "\t");
			System.out.println();
		}
	}

	public void Tamaño()
	{
		System.out.println("Escribe el tamaño de arreglo bidimencional");
		do
			ren = obd.Entero("\nNo. de renglones: ");
		while (ren < 2);
		do
			col = obd.Entero("No. de columnas: ");
		while (col < 2);
		mat = new int[ren][col];
	}

	public void Aleatorios()
	{
		java.util.Random obr = new java.util.Random();
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat[ren].length; col++)
				mat[ren][col] = obr.nextInt(59) + 1;
	}

	public void Aleatorios100()
	{
		java.util.Random obr = new java.util.Random();
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat[ren].length; col++)
				mat[ren][col] = obr.nextInt(100) + 1;
	}

	public void Aleatorios70()
	{
		java.util.Random obr = new java.util.Random();
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat[ren].length; col++)
				mat[ren][col] = obr.nextInt(31) + 70;
	}

	public void AleatoriosDif()
	{
		int r, c;
		boolean ban;
		java.util.Random obr = new java.util.Random();
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat[ren].length; col++)
				do
				{
					ban = false;
					mat[ren][col] = obr.nextInt(mat.length * mat[0].length * 10);
					for (r = 0; r <= ren; r++)
						for (c = 0; r == ren ? c < col : c < mat[r].length; c++)
							if (mat[ren][col] == mat[r][c])
								ban = true;
					if (ban)
						System.out.println("Reepetido: " + mat[ren][col]);
				}
				while (ban);
	}

	public void Diagonal()
	{
		if (mat.length == mat[0].length)
		{
			for (ren = 0; ren < mat.length; ren++)
				// for (col = 0; col < mat[ren].length; col++)
				// if (ren == col)
				System.out.println(mat[ren][col]); // System.out.println(mat[ren][ren]);
		}
		else
			System.out.print("El arreglo no contiene diagonal");
	}

	public void Mayor()
	{
		int may = mat[0][0];
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat[ren].length; col++)
				if (mat[ren][col] > may)
					may = mat[ren][col];
		System.out.println("El mayor es " + may);
	}

	public void Menor()
	{
		int men = mat[0][0];
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat[ren].length; col++)
				if (mat[ren][col] < men)
					men = mat[ren][col];
		System.out.println("El menor es " + men);
	}

	public void Buscar()
	{
		int num;
		boolean ban = true;
		num = obd.Entero("Numero a buscar? ");
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat[ren].length; col++)
				if (mat[ren][col] == num)
				{
					if (ban)
						System.out.println("\nCoordenadas donde se encontro el número...");
					System.out.println("[ " + (ren + 1) + " , " + (col + 1) + " ]");
					ban = false;
				}
		if (ban)
			System.out.println("\nElemento no encontrado...");
	}

	public void TamañoIrregular()
	{
		do
			ren = obd.Entero("Número de renglones: ");
		while (ren < 2);
		mat = new int[ren][];
		for (ren = 0; ren < mat.length; ren++)
		{
			do
				col = obd.Entero("Numero de columnas del renglon " + (ren + 1)+ ": ");
			while (col < 1);
			mat[ren] = new int[col];
		}
	}

	public void PromedioRen()
	{
		int pro;
		System.out.println("\nPromedio por renglón...");
		for (ren = 0; ren < mat.length; ren++)
		{
			for (pro = 0, col = 0; col < mat[ren].length; col++)
				pro += mat[ren][col];
			pro /= mat[ren].length;
			System.out.println((ren + 1) + " -> " + pro);
		}
	}

	public void PromedioGrl()
	{
		int pro = 0;
		for (ren = 0; ren < mat.length; ren++)
			for (col = 0; col < mat[ren].length; col++)
				pro += mat[ren][col];
		pro /= (mat.length * mat[0].length);
		System.out.println("\nPromedio general " + pro);
	}
}
