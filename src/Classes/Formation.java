package Classes;

public class Formation {
	private int prix, nbHeures;
	private String titre, formateur;

	/**
	 * @author Oumy DIATTA
	 * @param prix
	 * @param nbHeures
	 * @param titre
	 * @param formateur
	 */
	public Formation(int prix, int nbHeures, String titre, String formateur) {
		super();
		this.prix = prix;
		this.nbHeures = nbHeures;
		this.titre = titre;
		this.formateur = formateur;
	}

	public Formation() {
		super();
	}

	@Override
	public String toString() {
		return "Formation [prix=" + prix + ", nbHeures=" + nbHeures + ", titre=" + titre + ", formateur=" + formateur
				+ "]";
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getNbHeures() {
		return nbHeures;
	}

	public void setNbHeures(int nbHeures) {
		this.nbHeures = nbHeures;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getFormateur() {
		return formateur;
	}

	public void setFormateur(String formateur) {
		this.formateur = formateur;
	}
}
