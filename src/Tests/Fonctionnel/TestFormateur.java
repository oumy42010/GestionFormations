package Tests.Fonctionnel;

import Classes.Formateur;
import Classes.Tests.ValidationFormateur;
import Classes.Tests.ValidationGenerale;
import Classes.listes.Formateurs;

public class TestFormateur {

	public static void main(String[] args) {

		String nom = "TOTO";
		String prenom = "TITI";
		String specialite = "Système réseaux";
		String grades[] = {"expert", "junior", "senior", "jedi", ""};

		ValidationGenerale vg = new ValidationGenerale();
		ValidationFormateur vf = new ValidationFormateur();

		for (int i=0; i < grades.length; i++ ) {
			if (vg.validationChaine(nom) && vg.validationChaine(prenom) && vg.validationChaine(specialite)
					&& vg.validationChaine(grades[i])) {
				if (vf.formateurGradIsValid(grades[i])) {
					Formateur f = new Formateur(nom, prenom, specialite, grades[i]);
					Formateurs.ListFormateurs.add(f);
				} else {
					System.out.println("le grade [" + grades[i] + "] est incorrect !");
				}
				
			} else {
				System.out.println("l'un des champs est  incorrect !");
			}
		}
		Formateurs.ShowFormateurs();
	}
}
