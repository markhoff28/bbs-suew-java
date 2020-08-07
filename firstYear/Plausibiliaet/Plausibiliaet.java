package Plausibiliaet;

import java.util.Scanner;

public class Plausibiliaet {
	
	Scanner sc = new Scanner(System.in);
	int zahl;
	int untergrenze = 0;
	int obergrenze = 100;
	
	public void eingabe(){
	System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 10 ein");
	zahl = sc.nextInt();
	}//eingabe
	
	public void whileschleife(){
		while ((zahl < untergrenze) || (zahl > obergrenze)){
			System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 10 ein");
			zahl = sc.nextInt();
		}//while
	}//whileschleife
	
	public void doWhilescheife(){
		do{
			if ((zahl < untergrenze) || (zahl > obergrenze)) {
				System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 10 ein");
				zahl = sc.nextInt();
			}
		}
		while ((zahl < untergrenze) || (zahl > obergrenze));
		//dowhile 				
	}//doWhilescheife
}
