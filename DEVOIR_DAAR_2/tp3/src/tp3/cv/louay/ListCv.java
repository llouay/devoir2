package tp3.cv.louay;
import java.util.ArrayList;

import tp3.cv.louay.Cv;

public class ListCv {
	
	private static ArrayList<Cv> liste_cv;
	
	public ListCv() {
		
		liste_cv = new ArrayList<Cv>();
		
	}
	
	public void addcv(Cv tmp) {
		liste_cv.add(tmp);
	}
	
	public ArrayList<Cv> getListe() {
		return liste_cv;
	}
	
	public void getCvByCompetences(String comp) {
		
		
		/*for(int i = 0; i<liste_cv.size();i++) {
			for(int j = 0; j< liste_cv.get(i).getCompetences().size();j++) {
				if (liste_cv.get(i).getCompetences().get(j).replaceAll("\\s", "").equals(comp)) {
					System.out.println(" Le CV de "+liste_cv.get(i).getNom() + " "+ liste_cv.get(i).getPrenom() + "possède cette compéténce");
				}
				
			}
		}*/
		
		for(Cv e : liste_cv) {
			for (String c : e.getCompetences()) {
				if(c.replaceAll("\\s", "").equals(comp)) { System.out.println(" Le CV de "+e.getNom() + " "+ e.getPrenom() + "possède cette compéténce");}
			}
		}
		
	}
	public Cv returnCvByCompetences(String comp) {
		
		for(Cv e : liste_cv) {
			for (String c : e.getCompetences()) {
				if(c.replaceAll("\\s", "").equals(comp)) { System.out.println(" Le CV de "+e.getNom() + " "+ e.getPrenom() + "possède cette compéténce");} return e;
			}
		}
		return null;
		
	}
	
	public void getCvByFormation(String forma) {
		
		for(Cv e : liste_cv) {
			for (String c : e.getFormations()) {
				if(c.equals(forma)) { System.out.println(" Le CV de "+e.getNom() + " "+ e.getPrenom() + "est issu de cette formation");}
			}
		}
		
	}
	public Cv returnCvByFormation(String forma) {
		
		for(Cv e : liste_cv) {
			for (String c : e.getFormations()) {
				if(c.equals(forma)); System.out.println(" Le CV de "+e.getNom() + " "+ e.getPrenom() + "est issu de cette formation"); return e;
			}
		}
		return null;
		
	}
	
	

}
