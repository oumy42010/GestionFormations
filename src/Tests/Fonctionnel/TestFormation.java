package Tests.Fonctionnel;

import Classes.Formateur;
import Classes.Formation;
import Classes.Tests.ValidationGenerale;
import Classes.Tests.ValidationFormateur;
import Classes.Tests.ValidationFormation;
import Classes.listes.Formations;

public class TestFormation {

	public static void main(String[] args) {

		int prixs[] = {0,100,250};
		int nbHeuress[] = {10,11,40};
		String titres[] = {"AB","ABC","ABCDEFGH"};
		Formateur formateur = new Formateur("Jean","Delaroute", "Cloud", "Senior");
		
		ValidationGenerale vg = new ValidationGenerale();
		ValidationFormation vformation = new ValidationFormation();
		ValidationFormateur vformateur = new ValidationFormateur();

		for(int p=0; p < prixs.length; p++)
			for(int nh=0; nh < nbHeuress.length; nh++)
				for(int t=0; t < titres.length; t++) {
					if (vformation.prixIsValid(prixs[p]) && 
							vformation.nbHeuresIsValid(nbHeuress[nh]) && 
							vformation.titreIsValid(titres[t])) {
						Formation vform = new Formation(prixs[p], nbHeuress[nh], titres[t], "inconnu");
						Formations.ListFormations.add(vform);			
					} else {
						System.out.println("L'un des paramétres n'est pas valide");
					}	
				}
				Formations.ShowFormations();
		}
}
