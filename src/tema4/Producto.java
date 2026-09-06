package tema4;

public class Producto
{
	private int clv, exi;
	private String nom;
	private double pre;
	
	public int getClv()
	{
		return clv;
	}
	public void setClv(int clv)
	{
		this.clv = clv;
	}
	public int getExi()
	{
		return exi;
	}
	public void setExi(int exi)
	{
		this.exi = exi;
	}
	public String getNom()
	{
		return nom;
	}
	public void setNom(String nom)
	{
		this.nom = nom.toUpperCase();
	}
	public double getPre()
	{
		return pre;
	}
	public void setPre(double pre)
	{
		this.pre = pre;
	}
	
	
	

}
