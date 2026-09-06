package tema4;

public class AlumnosP
{
	public static void main(String[] args)
	{
		int op;
		Menu obm = new Menu("Menú Principal",new String[] { "Cantidad", "Nuevo", "Lista", "Modificar" });
		do
			switch (op = obm.Opcion())
			{
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
			}
		while (op != obm.Salir());
	}

}
