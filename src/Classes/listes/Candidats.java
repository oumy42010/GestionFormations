package Classes.listes;

import java.util.ArrayList;
import Classes.Candidat;

public class Candidats {
	public static ArrayList<Candidat> ListCandidats = new ArrayList<Candidat>();

	public static void addToList(Candidat can) {
		ListCandidats.add(can);

	}

	public static void ShowCandidats() {
		for (Candidat can : ListCandidats) {
			System.out.println(can.toString());

		}
	}

}
