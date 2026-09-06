package trabajos;

import java.io.IOException;

public class Trabajo4
{
	private int conh, conm, canh, canm, edadh, edadth = 0, edadm, edadtm = 0, edadph, edadpm, mayedh = 0, minedm = 31;
	private double estah, estath = 0, estam, estatm = 0, estaph, estapm, minsth = 2.6, maystm;
	private java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	public void Cantidad() throws IOException
	{
		do
		{
			System.out.print("Cantidad de hombres en el equipo: ");
			canh = Integer.parseInt(obb.readLine().trim());
		}
		while (canh < 1);
		do
		{
			System.out.print("Cantidad de mujeres en el equipo: ");
			canm = Integer.parseInt(obb.readLine().trim());
		}
		while (canm < 1);
	}

	private void DatosHombres() throws IOException
	{
		System.out.println("\nEquipo Hombres.....");
		System.out.println("Alumno numero " + conh + "......");
		do
		{
			System.out.print("Cual es tu edad?: ");
			edadh = Integer.parseInt(obb.readLine().trim());
		}
		while (edadh > 17 || edadh > 30);
		do
		{
			System.out.print("Cual es tu estatura?: ");
			estah = Double.parseDouble(obb.readLine().trim());
		}
		while (estah < 1 || estah > 2.5);
	}

	private void DatosMujeres() throws IOException
	{
		System.out.println("\nEquipo Mujeres.....");
		System.out.println("Alumna número " + conm + "......");
		do
		{
			System.out.print("Cual es tu edad?: ");
			edadm = Integer.parseInt(obb.readLine().trim());
		}
		while (edadm < 17 || edadm > 30);
		do
		{
			System.out.print("Cual es tu estatura?: ");
			estam = Double.parseDouble(obb.readLine().trim());
		}
		while (estam < 1 || estam > 2.5);
	}

	public void Calcular() throws IOException
	{
		for (conh = 1; conh <= canh; conh++)
		{
			this.DatosHombres();
			edadth += edadh;
			estath += estah;
			if (edadh > mayedh)
				mayedh = edadh;
			if (estah < minsth)
				minsth = estah;
		}

		for (conm = 1; conm <= canm; conm++)
		{
			this.DatosMujeres();
			edadtm += edadm;
			estatm += estam;
			if (edadm < minedm)
				minedm = edadm;
			if (estam > maystm)
				maystm = estam;
		}

		edadph = edadth / canh;
		estaph = estath / canh;

		edadpm = edadtm / canm;
		estapm = estatm / canm;

	}

	public void Mostrar()
	{
		System.out.println("\nEdad promedio del equipo varonil: " + edadph + " años");
		System.out.println("Estatura promedio del equipo varonil: " + estaph);
		System.out.println("Mayor edad del equipo varonil: " + mayedh);
		System.out.println("Menor estatura del equipo varonil: " + minsth);

		System.out.println("\nEdad promedio del equipo femenil: " + edadpm + " años");
		System.out.println("Estatura promedio del equipo femenil: " + estapm);
		System.out.println("Menor edad del equipo femenil: " + minedm);
		System.out.println("Mayor estatura del equipo femenil: " + maystm);
	}
}