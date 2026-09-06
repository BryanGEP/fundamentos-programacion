package tema3;

import java.io.IOException;

public class SumaIgualAlTercero
{
	private int num1, num2, num3;
	private String msj;

	public void Leer() throws IOException
	{
		java.io.BufferedReader obb = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Ingresa el primer numero: ");
		num1 = Integer.parseInt(obb.readLine().trim());
		System.out.print("Ingresa el segundo numero: ");
		num2 = Integer.parseInt(obb.readLine().trim());
		System.out.print("Ingresa el tercer numero: ");
		num3 = Integer.parseInt(obb.readLine().trim());
	}

	public void Calcular()
	{
		if (num1 + num2 != num3)
			if (num2 + num3 != num1)
				if (num3 + num1 != num2)
					msj = "Numero diferente";
				else
					msj="Numeros iguales "+num3+"+"+num1;
			else
				msj="Numeros iguales "+num2+"+"+num3;
		else
			msj="Numeros iguales "+num1+"+"+num2;


				

	}

	public void Mostrar()
	{
		System.out.println(msj);
	}
}
