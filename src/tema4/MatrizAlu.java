package tema4;

public class MatrizAlu
{
	private String mat[][];
	private int ren, col;
	private Datos obd = new Datos();

	public void Cantidad()
	{
		do
			ren = obd.Entero("Cual es la cantidad de alumnos: ");
		while (ren < 1);
		mat = new String[ren][3];
	}

	public void Lectura()
	{
		System.out.println("Escribe los siguientes datos de cada alumno...");
		for (ren = 0; ren < mat.length; ren++)
		{
			System.out.print("\nAlumno No." + (ren + 1));
			mat[ren][0] = obd.Cadena("\nNo.Control ");
			mat[ren][1] = obd.Cadena("Nombre ").toUpperCase();
			do
				col = obd.Entero("Promedio ");
			while (col < 0 || col > 100);
			mat[ren][2] = col + "";
		}
	}

	public void Mostrar()
	{
		System.out.println("\nLista de alumnos...");
		for (ren = 0; ren < mat.length; ren++)
		{
			System.out.print((ren + 1) + ".- ");
			for (col = 0; col < mat[ren].length; col++)
				System.out.print(mat[ren][col] + "\t");
			System.out.println();
		}
	}
}
