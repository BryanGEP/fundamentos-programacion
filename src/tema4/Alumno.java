package tema4;

public class Alumno
{
	private String nc, nom;
	private int cal[], pos;
	private Datos obd = new Datos();

	public Alumno(int nt)
	{
		cal = new int[nt + 1];
	}

	public void Lectura()
	{
		System.out.println("Escribe los datos del alumno...");
		nc = obd.Cadena("No. Control");
		nom = obd.Cadena("Nombre").toUpperCase();
		System.out.println("Escribe las " + (cal.length - 1) + " calificaciones: ");
		for (pos = 0; pos < cal.length - 1; pos++)
		{
			cal[pos] = obd.Entero((pos + 1) + ".- ");
			cal[cal.length - 1] += cal[pos];
		}
		cal[cal.length - 1] /= cal.length - 1;
	}

	public void Mostrar()
	{
		
	}
	public void Modificar()
	{
	}
}
