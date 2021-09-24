package Classes.listes;

import java.util.ArrayList;
import Classes.Formateur;

public class Formateurs {
	public static ArrayList<Formateur> ListFormateurs = new ArrayList<Formateur>();

	public static void addToList(Formateur formateur) {
		ListFormateurs.add(formateur);
	}

	public static void ShowFormateurs() {
		for (Formateur formateur : ListFormateurs) {
			System.out.println(formateur.toString());

		}
	}
}
