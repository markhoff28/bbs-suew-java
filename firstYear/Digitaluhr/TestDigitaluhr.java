package Digitaluhr;

public class TestDigitaluhr {

	public static void main(String[] args) throws InterruptedException {
		FachDigitaluhr myTime = new FachDigitaluhr();
		myTime.setUhrzeit(23, 57, 40);
		myTime.setStopzeit(23, 58, 10);
//		myTime.leseUhrzeitvontastatur();
//		myTime.setStartStunde(22);
//		myTime.setStartMinute(57);
//		myTime.setStartSekunde(55);
		myTime.zeigeUhrzeit();
	}

}
