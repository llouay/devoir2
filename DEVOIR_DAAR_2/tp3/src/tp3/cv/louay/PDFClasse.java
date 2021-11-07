package tp3.cv.louay;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;


public class PDFClasse {
	
	
	public static FileWriter getText(String text) {
		
		String content = null;
		try 
	    {
	        //Créer une instance PdfReader.
	        PdfReader pdf = new PdfReader(text);  
	   
	        //Récupérer le nombre de pages en pdf.
	        int nbrPages = pdf.getNumberOfPages(); 
	   
	        //Itérer le pdf à travers les pages.
	        for(int i=1; i <= nbrPages; i++) 
	        { 
	            //Extraire le contenu de la page à l'aide de PdfTextExtractor.
	            content = PdfTextExtractor.getTextFromPage(pdf, i);
	   
	            //Afficher le contenu de la page sur la console.
	            System.out.println("Contenu du page : " + content);
	        }
	   
	        //Fermez le PdfReader.
	        pdf.close();
	    
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
		FileWriter cv_file = null;
		try {
			cv_file = new FileWriter(text.substring(0,text.length()-3)+".txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			cv_file.write(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cv_file;
		
	}
public static String getTextString(String text) {
		
		String content = null;
		try 
	    {
	        //Créer une instance PdfReader.
	        PdfReader pdf = new PdfReader(text);  
	   
	        //Récupérer le nombre de pages en pdf.
	        int nbrPages = pdf.getNumberOfPages(); 
	   
	        //Itérer le pdf à travers les pages.
	        for(int i=1; i <= nbrPages; i++) 
	        { 
	            //Extraire le contenu de la page à l'aide de PdfTextExtractor.
	            content = PdfTextExtractor.getTextFromPage(pdf, i);
	   
	            //Afficher le contenu de la page sur la console.
	            System.out.println(content);
	        }
	   
	        //Fermez le PdfReader.
	        pdf.close();
	    
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
		
		return content;
		
	}
  
}