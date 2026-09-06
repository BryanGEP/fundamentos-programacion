package tema4;

public class InventarioP
{
	public static void main(String[] args)
	{
		int op;
		Datos obd = new Datos();
		Inventario obi = new Inventario();
		obi.Tamaño();
		do
		{
			do
			{
				System.out.println("\nMenú principal");
				System.out.println("1) Nuevo");
				System.out.println("2) Mostrar");
				System.out.println("3) Salir");
				op = obd.Entero("Cuál es tu opcion? ");
			}
			while (op < 1 || op > 3);
			switch (op)
			{
				case 1:
					obi.Nuevo();
					break;
				case 2:
					obi.Mostrar();
					break;
			}
		}
		while (op != 3);
	}

}
