package Primzahlen_klassisch;

public class TestkklasseclassicPrime {
	public static void main (String[] args)
	{
		FachklasseclassicPrim prim = new FachklasseclassicPrim();
		
		prim.setzeObergrenze(100_00_000);
		prim.ermittlePrimzahl();
		//prim.plot();
	}
}
