package tema3;

import java.io.IOException;

public class DatosP
{
	public static void main(String[] args) throws IOException
	{
		int ent;
		double dou;
		String cad;
		char car;
		Datos obj = new Datos();

		ent = obj.Entero("Escribe un valor entero: ");
		dou = obj.Doble("Escribe un valor decimal: ");
		cad = obj.Cadena("Escribe una cadena: ");
		car = obj.Caracter("Escribe un caracter: ");
		System.out.print(ent + "\t" + dou + "\t" + cad + "\t" + car);

	}
}
