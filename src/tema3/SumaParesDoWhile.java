package tema3;

public class SumaParesDoWhile
{
	private int par = 2, sum = 0, con = 1;

	public void Calcular()
	{
		do
		{
			sum += par ; // suma=suma+par;
			par += 2; // par=par+2;
			con++; // con=con+1;
		}
		while (con <= 50);
	}

	public void Mostrar()
	{
		System.out.println("La suma de los primeros 50 numeros pares es: " + sum);
	}
}
