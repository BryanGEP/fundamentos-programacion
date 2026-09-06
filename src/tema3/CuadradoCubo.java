package tema3;

public class CuadradoCubo
{

	private double num, cua, cub;

	public void Leer() throws java.io.IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Escribe un numero: ");
		num = Double.parseDouble(obb.readLine().trim());
	}

	public void Calcular()
	{
		if (num >= 0)
		{
			// cua = num * num;
			// cub = cua * num;
			cua = Math.pow(num, 2);
			cub = Math.pow(num, 3);
			Mostrar();
		}
	}

	private void Mostrar()
	{
		System.out.println("El cuadrado de " + num+" es "+ cua);
		System.out.println("El cubo de  " + num+" es "+cub);

	}

}
