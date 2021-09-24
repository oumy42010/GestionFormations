package Classes;

public class Session {
	private String debut, fin, titreFormation, lieu, mode;

	public Session(String debut, String fin, String titreFormation, String lieu, String mode) {
		super();
		this.debut = debut;
		this.fin = fin;
		this.titreFormation = titreFormation;
		this.lieu = lieu;
		this.mode = mode;
	}

	public Session() {
		super();
	}

	@Override
	public String toString() {
		return "Session [debut=" + debut + ", fin=" + fin + ", titreFormation=" + titreFormation + ", lieu=" + lieu
				+ ", mode=" + mode + "]";
	}

	public String getDebut() {
		return debut;
	}

	public void setDebut(String debut) {
		this.debut = debut;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public String getTitreFormation() {
		return titreFormation;
	}

	public void setTitreFormation(String titreFormation) {
		this.titreFormation = titreFormation;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

}
