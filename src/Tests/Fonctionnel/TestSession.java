package Tests.Fonctionnel;

import Classes.Session;
import Classes.Tests.ValidationGenerale;
import Classes.Tests.ValidationSession;
import Classes.listes.Sessions;

public class TestSession {

	public static void main(String[] args) {
		String debut = "24/09/2021";
		String fin = "24/10/2021";
		String titreFormation = "SGBD";
		String lieu = "rhone";
		String modes[] = { "présentiel", "en ligne", "en classe", ""};
		ValidationGenerale vg = new ValidationGenerale();
		ValidationSession vs = new ValidationSession();

		for (int i = 0; i < modes.length; i++) {
			if (vg.validationChaine(debut) && vg.validationChaine(fin) && vg.validationChaine(titreFormation)
					&& vg.validationChaine(lieu) && vg.validationChaine(modes[i])) {
				if (vs.sessionIsValid(modes[i])) {
					Session s = new Session(debut, fin, titreFormation, lieu, modes[i]);
					Sessions.ListSessions.add(s);
				} else {
					System.out.println("le mode [" + modes[i] + "] est invalide !");
				}

			} else {
				System.out.println("l'un des champs est invalide !");
			}
		}
		Sessions.ShowSessions();
	}

}
