package Classes.Tests;

public class ValidationFormation {
	
	public boolean titreIsValid(String titre) {
		return titre.length() >= 3;
	}
	public boolean prixIsValid(int prix) {
		return prix > 100;
	}

	public boolean nbHeuresIsValid(int nbHeures) {
		return nbHeures > 10;
	}
}
