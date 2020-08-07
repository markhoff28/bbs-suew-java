package Geldautomat;
import  java.util.*;

public class FachklasseZahlenKlasse {
	Scanner sc = new Scanner (System.in);
	int zahl;
	int rest;
	int anzahlFuenfzigEuro;
	int anzahlZwanzigEuro;
	int anzahlZehnEuro;
	int anzahlFuenfEuro;
	int anzahlZweiEuro;
	int anzahlEinEuro;
	int geldBetrag;
	
	public void Eingabe(){
		System.out.println("Bitte geben Sie den Betrag ein, der abgehoben werden soll:");
		zahl = sc.nextInt();
	}//Eingabe end
	public void Verarbeitung(){
		rest = zahl;
		geldBetrag = zahl;
		anzahlFuenfzigEuro = rest / 50;
		rest = rest %  50;
		anzahlZwanzigEuro = rest / 20;
		rest = rest % 20;
		anzahlZehnEuro = rest / 10;
		rest = rest % 10;
		anzahlFuenfEuro = rest / 5;
		rest = rest % 5;
		anzahlZweiEuro = rest / 2;
		rest = rest % 2;
		anzahlEinEuro = rest / 1;
		rest =  rest % 1;
	}//Verrarbeitung end
	public void Ausgabe(){
		System.out.println("Der Betrag von " + geldBetrag + "€ wird in:");
		System.out.println(anzahlFuenfzigEuro + " Fünfzig Euro Schein(e)");
		System.out.println(anzahlZwanzigEuro + " Zwanzig Euro Schein(e)");
		System.out.println(anzahlZehnEuro + " Zehn Euro Schein(e)");
		System.out.println(anzahlFuenfEuro + " Füenf Euro Schei(e)");
		System.out.println(anzahlZweiEuro + " Zwei Euro Stück(e)");
		System.out.println(anzahlEinEuro + " Ein Euro Stück(e)");
		System.out.println("ausgegeben");
	}//Ausgabe end
	

}//class ends
