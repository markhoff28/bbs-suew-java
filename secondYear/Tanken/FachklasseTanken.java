package Tanken;

import java.util.Scanner;

public class FachklasseTanken {
	Scanner sc = new Scanner(System.in);
	private double states[][] = new double[3][3];
	
	public enum GAS{
		BENZIN("BENZIN"), DIESEL("DIESEL"), ERDGAS ("ERDGAS");
		private String value;
		GAS(String value){
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
 	}
	
	public void initTabelle() {
		for(int o = 0; o < 3; o++){
			for(int i = 0; i < 3; i++){
				states[o][i] = 0.0;
				}
		}
	}
	
	public void insertTabelle(GAS go, double liter, double price) {
		int row = 0;
		switch (go) {
		case DIESEL:
			row = 1;
			break;
		case ERDGAS:
			row = 2;
			break;
		default:
			break;
		}
		states[row][0] = states[row][0] + liter;
		states[row][1] = states[row][1] + price;
		states[row][2] = states[row][1] / states[row][0];
	}
	
	public void collectBill(){
		System.out.println("Bitte den neuen Beleg eingeben");
		
		String gas =sc.nextLine();
		double liters = sc.nextDouble();
		double price = sc.nextDouble();
		insertTabelle(GAS.valueOf(gas), liters, price);
	}
	
	private GAS getGASBYMYIndex(int index) {
		switch (index) {
		case 0: 
			return GAS.BENZIN;
		case 1: 
			return GAS.DIESEL;
		case 2: 
			return GAS.ERDGAS;
		default:
			return null;
		}
	}
	
	public void printTabelle() {
		System.out.println("       | Summe Liter  | Summe Preis  |  Durchschnittspreis");
		System.out.println("-------------------------------------------------------------");
		for(int zeile = 0; zeile < 3; zeile++){
			System.out.printf("%6s | ", getGASBYMYIndex(zeile).getValue());
				for(int spalte = 0; spalte < 3; spalte++){
					System.out.printf("%12s | ", String.format("%.2f", states[zeile][spalte]));
				}
			System.out.println();
		}
	}
}
