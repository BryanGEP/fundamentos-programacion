package tema4;

public class Inventario
{
	private int pos;
	private Producto inv[];
	private Datos obd = new Datos();

	public void Tamaño()
	{
		do
			pos = obd.Entero("Tamaño del inventario: ");
		while (pos < 1);
		inv = new Producto[pos];
		pos = -1;
	}

	public void Nuevo()
	{
		if (pos + 1 < inv.length)
		{
			pos++;
			inv[pos] = new Producto();
			System.out.println("\nEscribe los datos del nuevo producto");
			do
				inv[pos].setClv(obd.Entero("Clave: "));
			while (inv[pos].getClv() < 1);
			inv[pos].setNom(obd.Cadena("Nombre: ").toUpperCase());
			do
				inv[pos].setExi(obd.Entero("Existencia: "));
			while (inv[pos].getExi() < 0);
			do
				inv[pos].setPre(obd.Doble("Precio: "));
			while (inv[pos].getPre() < 1);
		}
		else
			System.out.println("\nNo hay espacio para un nuevo producto...");
	}

	public void Mostrar()
	{
		int ind;
		if (pos != -1)
		{
			System.out.println("\nLista de productos del inventario...");
			for (ind = 0; ind <= pos; ind++)
				System.out.print(inv[ind].getClv() + "\t" + obd.Izquierda(inv[ind].getNom(), 20) + "\t"
						+ inv[ind].getExi() + "\t" + obd.Derecha(String.valueOf(inv[ind].getPre()), 8) + "\n");
		}
		else
			System.out.println("\nNo hay productos registrados en el inventario...");
	}
}
