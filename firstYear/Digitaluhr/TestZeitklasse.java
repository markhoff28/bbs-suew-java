package Digitaluhr;

public class TestZeitklasse {

	public static void main(String[] args)
	{
		Zeitklasse myTime = new Zeitklasse();
		myTime.setZeit(13, 13, 13);
		System.out.println(myTime.toString());
		myTime.nextStep();
		System.out.println(myTime.getSekunden());
		System.out.println(myTime.toString());

	}

}
