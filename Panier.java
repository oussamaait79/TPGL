import java.util.ArrayList;
class Panier //extends Orange
{
	private ArrayList<Orange> panierOrange;
	private int nbMax, nbActuel;
	
	public Panier(int n)
	{
		panierOrange = new ArrayList<Orange>();
		nbMax = n;
		nbActuel = 0;
	}
	
	public int getNbActuel()
	{
		return this.nbActuel;
	}
	
	public void setNbMax(int n)
	{
		this.nbMax = n;
	}
	
	public ArrayList<Orange> getListeOrange()
	{
		for(Orange o: panierOrange)
		{
			o.getOrigine();
			o.getPrix();
		}
		
		return this.panierOrange;
	}
	
	public boolean estPlein()
	{
		if(this.nbActuel == this.nbMax)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean estVide()
	{
		if(this.nbActuel == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean ajoute(Orange o)
	{
		if(estPlein() == true)
		{
			System.out.println("PANIER PLEIN");
			return false;
		}
		else
		{
			this.panierOrange.add(o);
			System.out.println("Orange ajoutée");
			this.nbActuel++;
			return true;
		}
	}
	
	public static void main(String[] args)
	{
		Panier p1 = new Panier(2);
		
		Orange o1 = new Orange(10, "Maroc");
		Orange o2 = new Orange(10, "France");	
		Orange o3 = new Orange(10, "France");	
		
		p1.ajoute(o1);
		p1.ajoute(o2);
		
		p1.getListeOrange();
	}		
}
