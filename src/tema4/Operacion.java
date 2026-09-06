package tema4;

public class Operacion
{
	private int[][] mat1, mat2, mat3;
	private int ren, col;
	private Datos obd = new Datos();

	public void Tamaño()
	{
		System.out.println("Escribre el tamaño de las matrices...");
		do
			ren = obd.Entero("No. Renglones ");
		while (ren < 2);
		do
			col = obd.Entero("No. Columnas ");
		while (col < 2);
		mat1 = new int[ren][col];
		mat2 = new int[ren][col];
		mat3 = new int[ren][col];
	}

	public void Aleatorio()
	{
		java.util.Random obr = new java.util.Random();
		for (ren = 0; ren < mat1.length; ren++)
			for (col = 0; col < mat1[ren].length; col++)
				mat1[ren][col] = obr.nextInt(10) + 1;
		for (ren = 0; ren < mat1.length; ren++)
			for (col = 0; col < mat2[ren].length; col++)
				mat2[ren][col] = obr.nextInt(10) + 1;
	}

	public void Suma()
	{
		for (ren = 0; ren < mat3.length; ren++)
			for (col = 0; col < mat3[ren].length; col++)
				mat3[ren][col] = mat1[ren][col] + mat2[ren][col];
	}

	public void Mostrar()
	{
		System.out.println("\nPrimer Matriz...");
		for (ren = 0; ren < mat1.length; ren++)
		{
			for (col = 0; col < mat1[ren].length; col++)
				System.out.print(mat1[ren][col] + "\t");
			System.out.println();
		}
		System.out.println("\nSegunda Matriz...");
		for (ren = 0; ren < mat2.length; ren++)
		{
			for (col = 0; col < mat2[ren].length; col++)
				System.out.print(mat2[ren][col] + "\t");
			System.out.println();
		}
		System.out.println("\nMatriz Resultante...");
		for (ren = 0; ren < mat3.length; ren++)
		{
			for (col = 0; col < mat3[ren].length; col++)
				System.out.print(mat3[ren][col] + "\t");
			System.out.println();
		}
	}
}
