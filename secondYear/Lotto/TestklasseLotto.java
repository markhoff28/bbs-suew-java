package Lotto;

public class TestklasseLotto 
{

	public static void main(String[] args)
	{
		FachklasseLotto lot = new FachklasseLotto();
		lot.tipp(19, 18, 43, 24, 35, 6);
		lot.ziehen();
		//lot.auswertenEingabe();
		lot.auswertenDimiEingabe();
		//lot.pruefePaar2();
		lot.vergleich();
		lot.supZahl(7);
		lot.starZahl();

	}

}