
public class Scanner
{
	public static void main(String[] args)
	{
		int clv;
		String nom;
		double pre;
		java.util.Scanner obb = new java.util.Scanner(System.in);

		System.out.println("Escribe los datos del producto: ");
		System.out.print("Clave: ");
		clv = obb.nextInt();
		System.out.print("Nombre: ");
		nom = obb.next();
		System.out.print("Precio: ");
		pre = obb.nextDouble();
		System.out.print("\n");
		System.out.print("la claves es " + clv + " se llama " + nom + " y su precio es " + pre);
		obb.close();
	}
}
