package Referenz;

public class EineTestklasse {

	int x = 4;
	int y = 3;
	
	public void eineMethode(int x)
	{
		x = 9;
	}
	
	public static void main(String[] args) {
		EineKlasse einObjekt = new EineKlasse();
		EineKlasse meinObjekt = new EineKlasse();	
		meinObjekt.a = 13;
		
		einObjekt.nochEineMethode(meinObjekt);
		
		System.out.println(meinObjekt.a);

	}

}
