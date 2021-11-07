package tp3.cv.louay;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PdfParser {
	
	public static void main(String[] args) throws IOException {
		String test = pdfparse();
	}
	public static String pdfparse() throws IOException {
        PDFTextStripper pdfStripper = null;
        PDDocument pdDoc = null;
        String parsedText;
        File file = new File("C:\\Users\\louay\\Documents\\Louay_Bounouh_CV_LVMH.pdf");
        PDFParser parser = new PDFParser((RandomAccessRead) new FileInputStream(file));
        parser.parse();
        try (COSDocument cosDoc = parser.getDocument()) {
            pdfStripper = new PDFTextStripper();
            pdDoc = new PDDocument(cosDoc);
            pdfStripper.setStartPage(1);
            pdfStripper.setEndPage(5);
            parsedText = pdfStripper.getText(pdDoc);
            System.out.println(parsedText);
        }
        return parsedText;
    }
	
}
