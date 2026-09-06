package tema4;

public class Lista
{
	private String lista[];
	private int ind;
	private Datos obd = new Datos();

	public void Cantidad()
	{
		do
			ind = obd.Entero("Cual es la cantidad de alumnos? ");
		while (ind < 1);
		lista = new String[ind];
	}

	public void Nombres()
	{
		System.out.println("Escribe los " + lista.length + " nombres de los alumnos...");
		for (ind = 0; ind < lista.length; ind++)
			lista[ind] = obd.Cadena((ind + 1) + ".-").toUpperCase();
	}

	public void Mostrar()
	{
		System.out.println("Lista de alumnos...");
		for (ind = 0; ind < lista.length; ind++)
			System.out.println((ind + 1) + ".-" + lista[ind]);
	}
}
