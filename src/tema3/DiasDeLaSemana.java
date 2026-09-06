package tema3;

import java.io.IOException;

public class DiasDeLaSemana
{
	private int num;
	private String dia;

	public void Leer() throws IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Escribe el numero del dia de la semana: ");
		num = Integer.parseInt(obb.readLine().trim());
	}

	public void Calcular()
	{
		switch (num)
		{
			case 1:
				dia = "Domingo";
				break;
			case 2:
				dia = "Lunes";
				break;
			case 3:
				dia = "Martes";
				break;
			case 4:
				dia = "Miercoles";
				break;
			case 5:
				dia = "Jueves";
				break;
			case 6:
				dia = "Viernes";
				break;
			case 7:
				dia = "Sabado";
				break;
			default:
				dia = "Numero fuera de rango";
		}

	}

	public void Mostrar()
	{
		System.out.println(dia);
	}

}
