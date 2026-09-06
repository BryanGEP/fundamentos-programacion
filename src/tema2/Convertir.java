package tema2;

public class Convertir
{
	private double pulg, cm;

	public void NoPulgadas() throws java.io.IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Pulgadas: ");
		pulg = Double.parseDouble(obb.readLine().trim());
	}

	public void NoCentimetros()
	{
		cm = pulg * 2.54;
	}

	public void Mostrar()
	{
		System.out.print("Los centimetos son: " + cm);
	}
}
