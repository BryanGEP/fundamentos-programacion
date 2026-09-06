package tema2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Alumno
{

	private String nc, nom;
	private int pro;

	public void LeerDatos() throws IOException
	{
		BufferedReader obb = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escribe los datos del alumno: ");
		System.out.print("Escribe el numero de control: ");
		nc = obb.readLine().trim();
		System.out.print("Escribe tu nombre: ");
		nom = obb.readLine().trim();
		System.out.print("Escribe tu promedio: ");
		pro = Integer.parseInt(obb.readLine().trim());

	}

	public void Mostrar()
	{
		System.out.println("Los datos del alumno ingresados son:\nNo.Control\t" + nc + "\nnombre\t\t" + nom
				+ "\nPromedio\t" + pro);
	}

}
