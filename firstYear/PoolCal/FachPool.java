package PoolCal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FachPool 
{
	Scanner sc = new Scanner(System.in);
	DecimalFormat f = new DecimalFormat();
	double laenge;
	double laenge1;
	double breite;
	double breite1;
	double tiefe;
	double beckengroeße;
	double fliesenarbeitenPool;
	double fliesenarbeitenAußen;
	double preisges;

	public void eingabeDaten()
	{
		System.out.println("Bitte geben Sie die Länge ein (in m):");
		laenge = sc.nextDouble();
		System.out.println("Bitte geben Sie die Breite ein (in m):");
		breite = sc.nextDouble();
		System.out.println("Bitte geben Sie die Tiefee in (in m):");
		tiefe = sc.nextDouble();
	}// eingabeDaten end;
	
	public void setFixWert()
	{
		laenge = 175.0;
		breite = 101.8;
		tiefe = 1.2;
	}
	public void berechnung()
	{
		laenge1 = laenge * (2.0 / 3);
		breite1 = breite * (3.0 / 4);
		
		beckengroeße = laenge1 * breite1 * tiefe * 200;
		fliesenarbeitenPool = ((2 * (laenge1 *  tiefe + breite1 * tiefe)) + (laenge1  * breite1)) * 12;
		fliesenarbeitenAußen = (laenge  * breite - (laenge1 * breite1)) * 24;
		preisges = beckengroeße  + fliesenarbeitenPool + fliesenarbeitenAußen;
	}// berechnung end
	
	public void ausgabe()
	{
		System.out.println("-------------------------------------------------------");
		System.out.println("Preis Beckengröße: " + f.format(beckengroeße));
		System.out.println("Preis der Fliesenarbeiten im Pool: " + f.format(fliesenarbeitenPool));
		System.out.println("Preis der Fliesenarbeiten im Außenbereich: " + f.format(fliesenarbeitenAußen));
		System.out.println("-------------------------------------------------------");
		System.out.println("Preis gesammt: " + f.format(preisges));
		System.out.println("=======================================================");
	}// ausgabe end
}//  class end
