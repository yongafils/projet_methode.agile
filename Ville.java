package circuitAutomobile;

public class Ville {
	private String nom;
	private double perimetre;
	
	public Ville(String nom, double perimetre) {
		this.setNom(nom);
		this.setPerimetre(perimetre);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPerimetre() {
		return perimetre;
	}

	public void setPerimetre(double perimetre) {
		this.perimetre = perimetre;
	}
	
}
