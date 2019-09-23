class Orange
{
	private double prix;
	private String origine;
	

	
	public Orange(double p, String o)	
	{
		try
		{
			
			if(p<0)
			{
				throw new Exception();
			}
			else
			{
				prix = p;
				origine = o;
			}
			
		}
		catch(Exception e)
		{
			
				System.out.println("Erreur: Prix négatif-> " + p);
		}
	}
	
	public void PrixException(double p)
	{
		System.out.println("Erreur: Prix négatif-> " + p);
	}		
	public double getPrix()
	{
		return this.prix;
	}
	
	public String getOrigine()
	{
		return this.origine;
	}
	

	
public static void main(String[] args)
{
	Orange o1 = new Orange(10, "Maroc");
	System.out.println(o1.getPrix());
	System.out.println(o1.getOrigine());
	
	Orange o2 = new Orange(-5, "France");	
	
}	
}


