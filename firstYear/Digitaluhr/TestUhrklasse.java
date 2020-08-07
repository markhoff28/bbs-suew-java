package Digitaluhr;

public class TestUhrklasse {

	public static void main(String[] args) {
		Uhrklasse myTime = new Uhrklasse();
		myTime.setStartzeit(13, 45, 41);
		myTime.setStoptzeit(17, 13, 12);
		myTime.setAktuellezeit(15, 19, 18);
		myTime.zeigeUhrzeit();
	}

}
