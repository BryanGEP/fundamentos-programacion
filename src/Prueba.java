import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Prueba
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader obb = new BufferedReader(new InputStreamReader(System.in));
		String nom;
		int año, edad = 2022;
		System.out.print("Cual es tu nombre?: ");
		nom = obb.readLine().trim();
		System.out.print("Cual es tu año de nacimiento?: ");
		año = Integer.parseInt(obb.readLine().trim());
		edad -= año;
		System.out.println("Hola " + nom + " tu edad es " + edad);
	}

}
