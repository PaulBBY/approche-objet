package entites;

public class Personne {

	String nom;
	String prenom;
	AdressePostale adresse;
	
	Personne (String nom, String prenom, AdressePostale adresse)	
	{
		
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		
	}
	
	public void id(Personne personne)
	{
		
		System.out.println(personne.nom.toUpperCase()+" "+personne.prenom);
		
	}
	
	public void setNom(String nom)
	{
		
		this.nom=nom;
		
	}
	
	public void setPrenom(String prenom)
	{
		
		this.prenom=prenom;
		
	}
	
	public void setAdresse(AdressePostale adresse)
	{
		
		this.adresse=adresse;
		
	}
	
	public String getNom()
	{
		
		return this.nom;
		
	}
	
	public String getPrenom()
	{
		
		return this.prenom;
		
	}
	
	public AdressePostale getAdresse()
	{
		
				return this.adresse;
				
	}

	
}
