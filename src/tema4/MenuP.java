package tema4;

public class MenuP
{
	public static void main(String[] args)
	{
		int op;
		Menu obm = new Menu("Menú Principal", new String[] { "Uno", "dos", "tres", "cuatro" });
		do
			switch (op = obm.Opcion())
			{
				case 1:
					System.out.println("Selecciono la opción 1...");
					break;
				case 2:
					System.out.println("Selecciono la opción 2...");
					break;
				case 3:
					System.out.println("Selecciono la opción 3...");
					break;
				case 4:
					System.out.println("Selecciono la opción 4...");
					break;
			}
		while (op != obm.Salir());
	}

}
