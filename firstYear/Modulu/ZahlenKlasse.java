package Modulu;
import  java.util.*;

public class ZahlenKlasse {
	Scanner sc = new Scanner (System.in);
	int zahl;
	int rest;
	int anzahlTausend;
	int anzahlHundert;
	int anzahlZehn;
	int anzahlEins;
	int ergebnis;

	public void Eingabe() {
			System.out.println("Bitte eine Zahl eingeben:"+ zahl);
			zahl = sc.nextInt();
	}
	public void Verarbeitung() {
		rest = zahl;
		anzahlTausend = rest/1000;
		rest = rest%1000;
		anzahlHundert = rest/100;
		rest = rest%100;
		anzahlZehn = rest/10;
		rest = rest%10;
		anzahlEins = rest;
		
		ergebnis = anzahlTausend+anzahlHundert+anzahlZehn+anzahlEins;
	}
	public void Ausgabe(){
		System.out.println("Die Qersumme beträgt:"+ ergebnis);
			
	}
}
