package Primzahlen_klassisch;

public class FachklasseclassicPrim {
	
	private int [] zahlen = new int [0];
	private int obergrenze = 0;
	
	private boolean isPrimezahl(int zahl)
	{
		if (zahl == 2) {
			return true;
		}
		
		if ((zahl % 2) == 0) {
			return false;
		}
		
		for (int i = 3; i <= zahl; i = i + 2) {
			if ((zahl != i) && ((zahl % i) == 0)) {
				return false;
			}
		}
		return true;
	}
	
	public int[] ermittlePrimzahl()
	{
		int arrayIndex = 0;
		for (int i = 2; i <= obergrenze; i ++)
		{
			if (isPrimezahl(i)) {
				zahlen[arrayIndex] = i;
				arrayIndex++;
			}
		}
		arrayIndex--;
		int[] puffer = zahlen;
		zahlen = new int[arrayIndex + 1];
		
		for (int i = 0; i < zahlen.length; i ++) {
			zahlen[i] = puffer[i];
		}
		System.out.println("Index: " + arrayIndex + "/ArrayCount: " + zahlen.length);
		return zahlen;
	}
	
	public void setzeObergrenze(int og) {
		if(og > 1) {
			obergrenze = og;
			zahlen = new int [obergrenze / 2];
		} else {
			System.out.println("fehler");
		}
	}
	
	public void plot() {
		for(int i : zahlen) {
			System.out.println(i);
		}
	}

}
