package tema2;

public class Sueldo
{
	private int horas;
	private double precio, base, seguro, ahorro, total;
	private java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	public void Horas() throws java.io.IOException
	{
		System.out.println("Horas trabajadas:");
		horas = Integer.parseInt(obb.readLine().trim());
	}

	public void Precio() throws java.io.IOException
	{
		System.out.println("precio por hora:");
		precio = Double.parseDouble(obb.readLine().trim());
	}

	public void Calcular()
	{
		base = horas * precio;
		seguro = base * 0.03;
		ahorro = base * 0.02;
		total = base - seguro - ahorro;
	}

	public void Mostrar()
	{
		System.out.println("El sueldo base es:" + base);
		System.out.println("Pago seguro de vida:" + seguro);
		System.out.println("Pago al fondo de ahorro:" + ahorro);
		System.out.println("El sueldo neto es:" + total);
	}
}
