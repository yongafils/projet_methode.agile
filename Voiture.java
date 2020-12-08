package circuitAutomobile;

public class Voiture {
	private double poids;
	private double qte;
	private double volume;
	private boolean aileron;
	
	public Voiture(double poids, double qte, double volume, boolean aileron) {
		this.setPoids(poids);
		this.setQte(qte);
		this.setVolume(volume);
		this.setAileron(aileron);
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getQte() {
		return qte;
	}

	public void setQte(double qte) {
		this.qte = qte;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public boolean isAileron() {
		return aileron;
	}

	public void setAileron(boolean aileron) {
		this.aileron = aileron;
	}
	

}
