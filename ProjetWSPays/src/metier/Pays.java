package metier;


public class Pays    {
	
	private String nomPays;
	private String nomCapitale;
	private String nomContinent;
	private float nbhabitants;
	

	public String getNomPays() {
		return nomPays;
	}


	
	public String getNomCapitale() {
		return nomCapitale;
	}


	
	public float getNbhabitants() {
		return nbhabitants;
	}


	public Pays(String nom_pays, String nom_capitale, String nom_continent, float nbhabitants) {
		super();
		this.nomPays = nom_pays;
		this.nomCapitale = nom_capitale;
		this.nomContinent = nom_continent;
		this.nbhabitants = nbhabitants;
	}

	public Pays() {
		super();
		
	}



	public String getNomContinent() {
		return nomContinent;
	}



	public void setNomContinent(String nomContinent) {
		this.nomContinent = nomContinent;
	}

	
}
