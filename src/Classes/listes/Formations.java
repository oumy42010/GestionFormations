package Classes.listes;

import java.util.ArrayList;

import Classes.Formation;

public class Formations {
	public static ArrayList<Formation> ListFormations = new ArrayList<Formation>();

	public static void addToList(Formation formation) {
		ListFormations.add(formation);
	}

	public static void ShowFormations() {
		for (Formation formation : ListFormations) {
			System.out.println(formation.toString());

		}
	}
}
