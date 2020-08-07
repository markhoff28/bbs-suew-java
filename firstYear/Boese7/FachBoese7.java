package Boese7;

import java.util.Scanner;

public class FachBoese7 {
	Scanner sc = new Scanner(System.in);
	int max = 9999;
	int obergrenze;
	int zahl;
	int restZahl;
	boolean boeseZahl;
	
	public void leseObergrenze(){
		System.out.println("Bitte geben Sie die Obergrenze (<=9999) ein:");
		zahl = sc.nextInt();
		
		while ((zahl < 1)| (zahl > max)){
			System.out.println("Ihre Eingabe war nicht korrekt");
			System.out.println("Bitte geben Sie die Obergrenze (<=9999) ein:");
			zahl = sc.nextInt();
		}
		
	}
	
	public void gebeBoese7Aus(){
		for( int i = 1; i <= zahl; i++){
			boeseZahl = false;
			restZahl = zahl;
			
			while(restZahl > 0){
				if ((restZahl % 10) == 7){
					boeseZahl = true;
					restZahl = restZahl / 10;
				}
			}
			if ((zahl / 7)==0){
				boeseZahl = true;
			}
			if (boeseZahl = true){
				System.out.println("Böse 7");
			}else{
				System.out.println(zahl);
			}
		}
	}
}
