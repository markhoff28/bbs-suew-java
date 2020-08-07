package stringVerarbeitung;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * Klasse: StringFileIO
 * Aufgabe: Klasse zum Verarbeiten von ASCII-Dateien
 * @author magnu
 *
 */

public class StringFileIO {
	private String dateiName = "";
	/*
	 * Aufgabe: setzt den dateiname
	 */
	public void setDateiName(String dateiName)
	{
		this.dateiName = dateiName;
	}// setDateiName end
	
	/*
	 * Aufgabe: liest eine Datei zeilenweise ein und gibt den Inhalt direkt in der Konsole aus
	 */
	public void zeigeDatei()
	{
		String textZeile = "";
		FileReader meinFile = null;
		try {
			meinFile = new FileReader(dateiName);
			BufferedReader meinLeseStrem = new BufferedReader(meinFile);
			textZeile = meinLeseStrem.readLine();	// liest die datei ein
			int count = 0;
			while(textZeile != null)				// interriert ueber die zeile
			{
				count ++;
				System.out.println(textZeile);		// zeiht die zeile
				System.out.println("Zeile " + count + " | "+ textZeile.length() + " Zeichen | Das ist eine Textzeile");
				textZeile = meinLeseStrem.readLine();	// wechselt in die naechste zeile
			}// while end
			meinFile.close();							// schliest das file
			System.out.println("################## ENDE DER DATEI ##################");
		}
		catch (IOException e) {
			System.out.println("uups eine IO.Fehler mit folgender Fehlermeldung: " + e);
		}
	}
}// class end
