package tema4;

public class ReticulaP
{
	public static void main(String[] args)
	{
		int op;
		Reticula obr = new Reticula();
		obr.Cantidad();
		Datos obd = new Datos();
		do
		{
			do
			{
				System.out.println("<< Menu de materias >>");
				System.out.println("1) Nueva");
				System.out.println("2) Lista");
				System.out.println("3) Buscar");
				System.out.println("4) Salir");
				op = obd.Entero("Cual es tu opción? ");
				System.out.println();
			}
			while (op < 1 || op > 4);
			switch (op)
			{
				case 1:
					obr.Nueva();
					break;
				case 2:
					obr.Lista();
					break;
				case 3:
					obr.Buscar();
					break;
			}
		}
		while (op != 4);
	}
}
