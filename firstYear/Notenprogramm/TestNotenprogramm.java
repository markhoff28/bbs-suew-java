package Notenprogramm;

public class TestNotenprogramm {
	public static void main(String[] args)
	{
		FachNotenprogramm note = new FachNotenprogramm();
		note.setTestData();
		//note.setFixTestData();
		//note.ermittleAnzahlNoten();
		//note.leseNotenEin();
		note.zeigeNoten();
		note.zeigeDurchschnitt();
	}
	

}
