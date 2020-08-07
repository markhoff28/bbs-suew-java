package HTML_Reader;

import java.io.IOException;

public class HTML_Test {

	public static void main(String[] args) {
		HTML_Klasse meinhtml = new HTML_Klasse();
		meinhtml.setDateiName("C:\\Users\\magnu\\Documents\\Schule\\index.htm");
		try {
			meinhtml.leseDateiEin();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//meinhtml.zeigeAlleZeichen();
//		System.out.println("-------------------------------------------------------------");
//		meinhtml.zeigeZeile(31);
//		System.out.println("-------------------------------------------------------------");
//		meinhtml.zaehleTextmuster("<title>");
//		meinhtml.zeigeTextmuster("<li>");
		//meinhtml.zaehleZeilen();
		//meinhtml.filterTags();
//		meinhtml.zeigeDateipfad();
//		meinhtml.zeigeDateinamen();
//		meinhtml.stringToInt();
//		meinhtml.zeigeAlleUeberschriften();
		meinhtml.pruefeHyperlinks();
	}

}
