import java.util.Date;

public class Pilot {
	private String nom;
	private int nivell;
	private int punts;

	public Pilot(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public int getPunts() {
		return punts;
	}

	public void setPunts(int punts) {
		this.punts = punts;
	}

	public void addPunts(int p) {
		punts += p;
	}

	@Override
	public String toString() {
		return "Pilot{" +
				"nom='" + nom + '\'' +
				", punts=" + punts +
				'}';
	}
}
