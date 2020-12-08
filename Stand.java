package circuitAutomobile;

public class Stand {
	private String nom;
	private int nbVoitures;
	private int nbTechniciens;
	private Circuit circuit;
	
	public Stand(String nom) {
		this.nom=nom;
	}
	
	public Stand(String nom, int nbVoitures, int nbTechniciens) {
		this.nom=nom;
		this.nbVoitures=nbVoitures;
		this.nbTechniciens=nbTechniciens;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbVoitures() {
		return nbVoitures;
	}

	public void setNbVoitures(int nbVoitures) {
		this.nbVoitures = nbVoitures;
	}

	public int getNbTechniciens() {
		return nbTechniciens;
	}

	public void setNbTechniciens(int nbTechniciens) {
		this.nbTechniciens = nbTechniciens;
	}

	public Circuit getCircuit() {
		return circuit;
	}
	
	/* set Circuit attribute to Stand
	 * + if this stand was in another Circuit, remove this stand from that Circuit listeStands arrayList 
	 * + set this Circuit as the stand Circuit attribute
	 * + add this stand on this Circuit listeStands attribute
	 * */

	public void setCircuit(Circuit circuit) {
		if(this.circuit!=null) {
			this.circuit.removeStand(this);
		}
		this.circuit = circuit;
		circuit.addStand(this);
	}
	
	/*
	if(this.circuit!=null) {
		this.circuit.removeStand(this);
	}
	circuit.addStand(this);
	*/
}
