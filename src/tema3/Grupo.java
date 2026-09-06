package tema3;

import java.io.IOException;

public class Grupo
{
	private int alu, cona = 1, uni, conu, suma, pro, cal, sump = 0, prog, apr = 0, rep = 0;
	private java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	public void CantidadDatos() throws IOException
	{
		alu = 0;
		while (alu < 1)
		{
			System.out.print("Cual es la cantidad de alumnos: ");
			alu = Integer.parseInt(obb.readLine().trim());
		}
		uni = 0;
		while (uni < 1)
		{
			System.out.print("Cual es la cantidad de unidades: ");
			uni = Integer.parseInt(obb.readLine().trim());
		}
	}

	private void Calificacion() throws IOException
	{
		cal = -1;
		while (cal < 0 || cal > 100)
		{
			System.out.println("Cual es la " + conu + " calificación");
			cal = Integer.parseInt(obb.readLine().trim());
		}
	}

	public void Calcular() throws IOException
	{
		while (cona <= alu)
		{
			suma = 0;
			conu = 1;
			System.out.println("Alumno numero " + cona + "...");
			while (conu <= uni)
			{
				this.Calificacion();
				suma += cal;
				conu++;
			}
			pro = suma / uni;
			this.Mostrar();
			if (pro >= 70)
				apr++;
			else
				rep++;
			sump += pro;
			cona++;
		}
		prog = sump / alu;
	}

	private void Mostrar()
	{
		System.out.println("Tu promedio es: " + pro);
	}

	public void Resultados()
	{
		System.out.println("Cantidad de aprobados: " + apr);
		System.out.println("Cantidad de reprobados: " + rep);
		System.out.println("Promedio general: " + prog);
	}

}
