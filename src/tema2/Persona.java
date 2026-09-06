package tema2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Persona
{
	private String nom;
	private int edad;
	private char sexo;

	public void LeerDatos() throws IOException
	{
		BufferedReader obb = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escribe  tus datos: ");
		System.out.print("Nombre: ");
		nom = obb.readLine().trim();
		System.out.print("Edad: ");
		edad = Integer.parseInt(obb.readLine().trim());
		System.out.print("Sexo: ");
		sexo = obb.readLine().trim().charAt(0);
	}

	public void MostarDatos()
	{
		System.out.print("Tu nombre es " + nom + "\nTu edad es " + edad + "\nTu sexo es " + sexo);
	}
}
