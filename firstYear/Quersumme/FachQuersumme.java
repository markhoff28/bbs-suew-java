package Quersumme;
import java.util.Scanner;
/*
 * Aufgabe: programm zur berechnung der quersumme und de ausgabe in geldscheinen
 * @version 1.0 08.01.2019
 * @author bsit18hoffmann 
 */
public class FachQuersumme {
	Scanner sc = new Scanner(System.in);
	int zahl;
	int rest;
	int ergebnis;
	int anzahlFHundert;
	int anzahlZHundert;
	int anzahlHundert;
	int anzahlFuenfzig;
	int anzahlZwanzig;
	int anzahlZehn;
	int anzahlFuenf;
	int anzahlZwei;
	int anzahlEins;
	
	public void eingabeDaten()
	{
		System.out.println("Bitte geben Sie eine Zahl ein:");
		zahl = sc.nextInt();
		rest = zahl;
	}// eingabeDaten end;
		
	public void berechnungQM()
	{
		int anzahlTausend = rest / 1000;
		rest = rest % 1000;
		int anzahlHundert = rest / 100;
		rest = rest % 100;
		int anzahlZehn = rest / 10;
		rest = rest % 10;
		int anzahlEins = rest;
		ergebnis = anzahlTausend + anzahlHundert + anzahlZehn + anzahlEins;
	}// berechnung end
	
	public void berechnungChash()
	{
		rest = zahl;
		anzahlFHundert = rest / 500;
		rest = rest % 500;
		anzahlZHundert = rest / 200;
		rest = rest % 200;
		anzahlHundert = rest / 100;
		rest = rest % 100;
		anzahlFuenfzig = rest / 50;
		rest = rest %  50;
		anzahlZwanzig = rest / 20;
		rest = rest % 20;
		anzahlZehn = rest / 10;
		rest = rest % 10;
		anzahlFuenf = rest / 5;
		rest = rest % 5;
		anzahlZwei = rest / 2;
		rest = rest % 2;
		anzahlEins = rest / 1;
		rest =  rest % 1;
	}
	public void ausgabe()
	{
		System.out.println("Die Quersumme beträge: " + ergebnis);
		System.out.println("------------------------------------------------------");
		System.out.println("Der Betrag beträge: " + zahl);
		System.out.println("Fünfhundert Euro Scheine:\t" + anzahlFHundert);
		System.out.println("Zweihundert Euro Scheine:\t" + anzahlZHundert);
		System.out.println("Hundert Euro Scheine:\t" + anzahlHundert);
		System.out.println("Fuefzig Euro Scheine:\t" + anzahlFuenfzig);
		System.out.println("Zwanzig Euro Scheine:\t" + anzahlZwanzig);
		System.out.println("Zehn Euro Scheine:\t" + anzahlZehn);
		System.out.println("Fuenf Euro Scheine:\t" + anzahlFuenf);
		System.out.println("Zwei Euro Stuecke:\t" + anzahlZwei);
		System.out.println("Ein Euro Stuecke:\t" + anzahlEins);
	}// ausgabe end
}// class end
