package tema4;

public class Materia
{
	private int clv, not;
	private String nom, cre;
	private Datos obd = new Datos();

	public void Lectura()
	{
		System.out.println("Escribe los datos de la materia..");
		do
			clv = obd.Entero("Ingresa la clave");
		while (clv < 1);
		nom = obd.Cadena("Nombre: ").toUpperCase();
		cre = obd.Cadena("Créditos: ");
		do
			not = obd.Entero("No. Temas: ");
		while (not < 3 || not > 7);
	}

	public void Mostrar()
	{
		System.out.println(clv + "\t" + obd.Izquierda(nom, 20) + "\t" + cre + "\t" + not);
	}

	public int getClave()
	{
		return clv;
	}

}
