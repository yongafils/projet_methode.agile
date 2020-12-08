package circuitAutomobile;

import java.util.ArrayList;

public class Circuit {
	private String nom;
	private double longueur;
	private int affluence;
	private Ville ville;
	private ArrayList<Stand> listeStands;
	
	public Circuit(String nom) {
		this.setNom(nom);
		this.setListeStands(new ArrayList<Stand>());
	}
	
	public Circuit(String nom, double longueur, int capacite) {
		this.setNom(nom);
		this.setLongueur(longueur);
		this.setCapacite(capacite);
		this.setListeStands(new ArrayList<Stand>());
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public int getCapacite() {
		return affluence;
	}

	public void setCapacite(int capacite) {
		this.affluence = capacite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	/* Add stand to Circuit => add stand to listeStands arrayList 
	 * + if this stand was in another Circuit, remove this stand from that Circuit listeStands arrayList 
	 * + set this Circuit as the stand Circuit attribute
	 * */
	 
	
	public void addStand(Stand stand) {
		this.listeStands.add(stand);
	}
	
	public void removeStand(Stand stand) {
		this.listeStands.remove(stand);
	}

	public ArrayList<Stand> getListeStands() {
		return listeStands;
	}

	public void setListeStands(ArrayList<Stand> listeStands) {
		this.listeStands = listeStands;
	}
	
	
}
