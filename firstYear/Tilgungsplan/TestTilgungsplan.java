package Tilgungsplan;

public class TestTilgungsplan {

	public static void main(String[] args) {
		FachTilgungsplan neuerKredit = new FachTilgungsplan();
		neuerKredit.eingabe();
		neuerKredit.plausibilitaet();
		neuerKredit.planAusgabe();

	}

}
