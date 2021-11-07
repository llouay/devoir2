package tp3.cv.louay;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws IOException {
		
		ListCv liste_cv = new ListCv();
		
		 File dir  = new File("src//CvFolder");
	     File[] liste = dir.listFiles();
	     System.out.println("Chargement des cv..");
	     for(File item : liste){
	         if(item.isFile())
	         { 
	           System.out.println("CV : "+ item.getName()+ " chargé avec succès"); 
	           System.out.println(" ");
	           String chemin = "src//cvFolder//"+item.getName();
	           liste_cv.addcv(generation(chemin));
	         } 
	       }
	     
		//liste_cv.addcv(generation("C:\\Users\\louay\\Documents\\CV_DAR\\cv_dar_jean.pdf"));
	     System.out.println(" ");
		 System.out.println("all good");
		 System.out.println(" ");
		 String choix;
		 
		 do { 
				Scanner sc = new Scanner(System.in);
		    	System.out.println(" ---------------------------------- ");
		    	System.out.println(" ---------------menu--------------- ");
		    	System.out.println(" ---------------------------------- ");
		    	System.out.println("Pour chercher un cv en fonction d'une compétence localement tapez 1");
		    	System.out.println("Pour chercher un cv via elasticsearch tapez 2");
		    	System.out.println("Pour quitter tapez 0");
		    	choix = sc.next();
		    	if(Integer.parseInt(choix) == 1) {
		    		
		    		Scanner sc2 = new Scanner(System.in);
		    		System.out.println("Veuillez écrire la compétence recherchée");
		    		String comp = sc2.next();
		    		liste_cv.getCvByCompetences(comp);
		    		
		    	}
		    	else if(Integer.parseInt(choix) == 2) {
		    		
		    		/*SearchRequest searchRequest = new SearchRequest(); 
		    		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder(); 
		    		searchSourceBuilder.query(QueryBuilders.matchAllQuery()); 
		    		searchRequest.source(searchSourceBuilder);
		    		liste_cv.getCvByCompetences(searchSourceBuilder);*/
		    		System.out.println("les jar qui ne veulent pas s'implémenter..");
		    		
			    	}
		
		    	
		    }while(!choix.contentEquals("0"));
		//liste_cv.addcv(generation("C:\\Users\\louay\\Documents\\CV_DAR\\cv_dar_louay.pdf"));
		//liste_cv.getCvByCompetences("java");
		
		
		

	}
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
		String textpdf = PDFClasse.getTextString(chemin);
		//String ligne;
        StringTokenizer all_lines = new StringTokenizer(textpdf, "\n");
       // System.out.println("les nombre est "+all_lines.countTokens());
        // prenom
        StringTokenizer st=new StringTokenizer(all_lines.nextToken(),":");
    	String titre = st.nextToken();
    	String contenu = st.nextToken();
        prenom = contenu; 
        //nom 
        st=new StringTokenizer(all_lines.nextToken(),":");
    	titre = st.nextToken();
    	contenu = st.nextToken();
        nom = contenu;
        // addresse 
        st=new StringTokenizer(all_lines.nextToken(),":");
    	titre = st.nextToken();
    	contenu = st.nextToken();
        addresse = contenu;
        // mail 
        st=new StringTokenizer(all_lines.nextToken(),":");
    	titre = st.nextToken();
    	contenu = st.nextToken();
        mail = contenu;
        // numero 
        st=new StringTokenizer(all_lines.nextToken(),":");
    	titre = st.nextToken();
    	contenu = st.nextToken();
        addresse = numero;
        // competences 
        st=new StringTokenizer(all_lines.nextToken(),":");
    	titre = st.nextToken();
    	contenu = st.nextToken();
    	StringTokenizer st1=new StringTokenizer(contenu,",");
		while(st1.hasMoreTokens()) {
        	String ps = st1.nextToken();
        	competences.add(ps);
    	}
		// langues
		st=new StringTokenizer(all_lines.nextToken(),":");
    	titre = st.nextToken();
    	contenu = st.nextToken();
    	st1=new StringTokenizer(contenu,",");
		while(st1.hasMoreTokens()) {
        	String ps = st1.nextToken();
        	langues.add(ps);
		}
		//formations
		st=new StringTokenizer(all_lines.nextToken(),":");
    	titre = st.nextToken();
    	contenu = st.nextToken();
    	st1=new StringTokenizer(contenu,",");
		while(st1.hasMoreTokens()) {
        	String ps = st1.nextToken();
        	formations.add(ps);
		}
		// centre d'interet
		st=new StringTokenizer(all_lines.nextToken(),":");
    	titre = st.nextToken();
    	contenu = st.nextToken();
    	st1=new StringTokenizer(contenu,",");
		while(st1.hasMoreTokens()) {
        	String ps = st1.nextToken();
        	centres_interets.add(ps);
		}
		
        
        
		Cv temp = new Cv(prenom, nom, addresse, mail, numero, competences, langues, formations, centres_interets); 	
		//System.out.println(temp);
		return temp;
	}
	
	
	

}
