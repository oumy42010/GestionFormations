package Tests.Fonctionnel;

import Classes.Candidat;
import Classes.Tests.ValidationGenerale;
import Classes.listes.Candidats;

public class TestCandidat {

	public static void main(String[] args) {
		int ids[] = {0, 10, -3};
		String names[] = {"Titi", "Toto", "Tata"};
		String departements[] = {"69", "75", "95"};
		
		ValidationGenerale vg = new ValidationGenerale();
		for (int i=0; i<3; i++) {
			if(vg.validationChaine(names[i])&&vg.validationChaine(departements[i]))	
			{
				if(vg.validationPositif(ids[i]))
				{
					Candidat candidat = new Candidat(ids[i], names[i], departements[i]);
					Candidats.ListCandidats.add(candidat);
					
				} else {
					System.out.println("L'id doit être positif ! ");
				}
			} else {
				System.out.println("name ou departement vide!");	
			}	
		}
		Candidats.ShowCandidats();			
	}
}
