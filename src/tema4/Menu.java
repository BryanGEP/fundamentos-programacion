package tema4;

public class Menu
{
	private String titulo, opciones[];
	private int pos;
	public Datos obd = new Datos();

	public Menu(String titulo, String opciones[])
	{
		this.titulo = titulo.toUpperCase();
		this.opciones = new String[opciones.length + 1];
		for (pos = 0; pos < opciones.length; pos++)
			this.opciones[pos] = opciones[pos].toUpperCase();
		this.opciones[pos] = "SALIR";
	}

	public Menu(String opciones[], String titulo)
	{
		this(titulo, opciones);
	}

	private void Mostrar()
	{
		System.out.println("\n<< " + titulo + " >>");
		for (pos = 0; pos < opciones.length; pos++)
			System.out.println(" " + (pos + 1) + ".- " + opciones[pos]);
	}

	public int Opcion()
	{
		int op;
		do
		{
			this.Mostrar();
			op = obd.Entero("¿CUÁL ES TU OPCIÓN? ");

		}
		while (op < 1 || op > opciones.length);
		return op;
	}

	public int Salir()
	{
		return opciones.length;
	}
}
