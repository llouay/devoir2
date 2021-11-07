package tp3.cv.louay;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Generation {

	/*public static void main(String[] args) throws IOException {
		
		ListCv liste_cv = new ListCv();
		liste_cv.addcv(generation("C:\\Users\\louay\\Documents\\CV_DAR\\cv_jean.pdf"));
		System.out.println("all good");
		liste_cv.addcv(generation("C:\\Users\\louay\\Documents\\CV_DAR\\cv_dar_louay.pdf"));
		liste_cv.getCvByFormation("python");
		
		
		

	}*/
	public static Cv generation(String chemin) throws IOException {
		 String prenom = null;
		 String nom = null;
		 String addresse = null;
		 String mail = null;
		 String numero = null;
		 ArrayList<String> competences = new ArrayList<String>();
		 ArrayList<String> langues = new ArrayList<String>();
		 ArrayList<String> formations = new ArrayList<String>();
		 ArrayList<String> centres_interets =  new ArrayList<String>();
		 //BufferedReader br = null;
		 //if(chemin.substring(chemin.length()-3, chemin.length()).equals("pdf")){
		 String textpdf = PDFClasse.getTextString(chemin);
		// System.out.println("textpdf"+textpdf);
		// FileReader t = new FileReader(textpdf);
		 //StringReader br = new StringReader(PDFClasse.getTextString(chemin));
			
			//BufferedReader br = new BufferedReader(new FileReader(textpdf));
			//System.out.println("br :"+br);
			//System.out.println("log");
		 //}
		 /*else {
		 Path path = Paths.get(chemin);
		//String recherche = "C:\\Users\\louay\\Desktop\CV"+i;
		 System.out.println(path);
		 br = new BufferedReader(new FileReader(path.toString()));}*/
		String ligne;
        StringTokenizer all_lines = new StringTokenizer(textpdf, "\n");
        System.out.println("les nombres eh "+all_lines.countTokens());
        System.out.println("token 1"+all_lines.nextToken());
        System.out.println("token 2"+all_lines.nextToken());
        System.out.println("token 3"+all_lines.nextToken());
        System.out.println("token 4"+all_lines.nextToken());
        System.out.println("token 5"+all_lines.nextToken());
        System.out.println("token 6"+all_lines.nextToken());
        System.out.println("token 7"+all_lines.nextToken());
        System.out.println("token 8"+all_lines.nextToken());
        System.out.println("token 9"+all_lines.nextToken());
        System.out.println("token 10"+all_lines.nextToken());
        
        
        for(int i = 0; i<all_lines.countTokens();i++) {
        	StringTokenizer st=new StringTokenizer(all_lines.nextToken(),":");
        	String titre = st.nextToken();
        	String contenu = st.nextToken();
        	System.out.println(titre);
        	System.out.println(contenu);
        	if(titre.equals("prenom")) {
        		prenom = contenu;
        	}
        	if(titre.equals("nom")) {
        		nom = contenu;
        	}
        	if(titre.equals("addresse")) {
        		addresse = contenu;
        	}
        	if(titre.equals("mail")) {
        		mail = contenu;
        	}
        	if(titre.equals("numero")) {
        		numero = contenu;
        	}
        	if(titre.equals("competences")) {
        		StringTokenizer st1=new StringTokenizer(contenu,",");
        		while(st1.hasMoreTokens()) {
	            	String ps = st.nextToken();
	            	competences.add(ps);
            	}

        	}
        	if(titre.equals("langues")) {
        		StringTokenizer st1=new StringTokenizer(contenu,",");
        		while(st1.hasMoreTokens()) {
	            	String ps = st1.nextToken();
	            	langues.add(ps);
            	}

        	}
        	if(titre.equals("formations")) {
        		StringTokenizer st1=new StringTokenizer(contenu,",");
        		while(st1.hasMoreTokens()) {
	            	String ps = st1.nextToken();
	            	formations.add(ps);
            	}

        	}
        	if(titre.equals("centres_interet")) {
        		StringTokenizer st1=new StringTokenizer(contenu,",");
        		while(st1.hasMoreTokens()) {
	            	String ps = st1.nextToken();
	            	centres_interets.add(ps);
            	}

        	}
        	
        	
	
        }
        //while(all_lines.hasMoreElements());
		Cv temp = new Cv(prenom, nom, addresse, mail, numero, competences, langues, formations, centres_interets); 	
		//System.out.println(temp);
		//t.close();
		//br.close();
		return temp;
	}
	
	/* ListCv liste_cv = new ListCv();
	boolean go = true;
	int i = 1;
	//do {
		 
		try {
			 String prenom = null;
			 String nom = null;
			 String addresse = null;
			 String mail = null;
			 String numero = null;
			 ArrayList<String> competences = new ArrayList<String>();
			 ArrayList<String> langues = new ArrayList<String>();
			 ArrayList<String> formations = new ArrayList<String>();
			 ArrayList<String> centres_interets =  new ArrayList<String>();
			 Path path = Paths.get("C:\\Users\\louay\\Desktop\\CV"+i+".txt");
			//String recherche = "C:\\Users\\louay\\Desktop\CV"+i;
			 System.out.println(path);
			BufferedReader br = new BufferedReader(new FileReader(path.toString()));
			String ligne;
 	           
	            while ((ligne = br.readLine()) != null) {
	            	StringTokenizer st=new StringTokenizer(ligne,":");
	            	String titre = st.nextToken();
	            	String contenu = st.nextToken();
	            	System.out.println(titre);
	            	System.out.println(contenu);
	            	if(titre.equals("prenom")) {
	            		prenom = contenu;
	            	}
	            	if(titre.equals("nom")) {
	            		nom = contenu;
	            	}
	            	if(titre.equals("addresse")) {
	            		addresse = contenu;
	            	}
	            	if(titre.equals("mail")) {
	            		mail = contenu;
	            	}
	            	if(titre.equals("numero")) {
	            		numero = contenu;
	            	}
	            	if(titre.equals("competences")) {
	            		StringTokenizer st1=new StringTokenizer(contenu,",");
	            		while(st1.hasMoreTokens()) {
 		            	String ps = st.nextToken();
 		            	competences.add(ps);
 	            	}

	            	}
	            	if(titre.equals("langues")) {
	            		StringTokenizer st1=new StringTokenizer(contenu,",");
	            		while(st1.hasMoreTokens()) {
 		            	String ps = st.nextToken();
 		            	langues.add(ps);
 	            	}

	            	}
	            	if(titre.equals("formations")) {
	            		StringTokenizer st1=new StringTokenizer(contenu,",");
	            		while(st1.hasMoreTokens()) {
 		            	String ps = st.nextToken();
 		            	formations.add(ps);
 	            	}

	            	}
	            	if(titre.equals("centres_interet")) {
	            		StringTokenizer st1=new StringTokenizer(contenu,",");
	            		while(st1.hasMoreTokens()) {
 		            	String ps = st.nextToken();
 		            	centres_interets.add(ps);
 	            	}

	            	}
	            	
	            	
    	
	            }
			Cv temp = new Cv(prenom, nom, addresse, mail, numero, competences, langues, formations, centres_interets);
	            	//System.out.println(temp);
	            	liste_cv.addcv(temp);
		} catch (FileNotFoundException e) {
			go = false;
			System.out.println("Error no cv");
			e.printStackTrace();
		}
		// System.out.println(recherche);
		i++;
	//}while(go);
	for (Cv e : liste_cv.getListe()) {
		System.out.println(e);
		
	}*/
	

}
