package Zahlenrechner;
import java.util.Scanner;

public class Zahlenrechner {
	Scanner sc = new Scanner(System.in);
	int izahl;
	
	public void eingabe()
	{
		while ((izahl <= 0)){
			System.out.println("Bitte geben Sie eine Zahl ein");
			izahl = sc.nextInt();
		}//while
	}//whileschleife
	
	public void decimal2Dual() 
	{
		int zahl = izahl;
		int rest = 0;
		int iergebnis = 0;
		String ergebnis = "";
		while (zahl > 0) 
		{
			rest = zahl % 2;
			zahl = zahl / 2;
			//System.out.println(zahl + " " + rest);
			ergebnis = ergebnis + rest;
			//System.out.println(ergebnis);
		}// while end
		System.out.println(ergebnis);
	}
}
