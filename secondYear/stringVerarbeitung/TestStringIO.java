package stringVerarbeitung;

public class TestStringIO {

	public static void main(String[] args) {
		StringFileIO meineDateiKlasse = new StringFileIO();
		// Setzen des Dateinamen
		meineDateiKlasse.setDateiName("C:\\Users\\magnu\\Documents\\Workspace\\LB6\\src\\stringVerarbeitung\\test.htm");
		
		//Ausgabe der Datei in der Konsole
		meineDateiKlasse.zeigeDatei();
	}

}
