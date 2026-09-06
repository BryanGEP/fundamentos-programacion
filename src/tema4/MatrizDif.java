package tema4;

public class MatrizDif
{
	private int mat[][];
	private int ren, col;
	private Datos obd = new Datos();

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
						for (c = 0; r == ren ? c < col : c < mat[0].length; c++)
							if (mat[ren][col] == mat[r][c])
								ban = true;
					if (ban)
						System.out.println("Reepetido: " + mat[ren][col]);
				}
				while (ban);

	}

	public void Burbuja()
	{
		int con, aux;
		for (con = 1; con <= mat.length; con++)
			for (ren = 0; ren < mat.length - 1; ren++)
				if (mat[ren][col] < mat[ren + 1][col + 1])
				{
					aux = mat[ren][col];
					mat[ren][col] = mat[ren + 1][col + 1];
					mat[ren + 1][col + 1] = aux;
				}
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

}
