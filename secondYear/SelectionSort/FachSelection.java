package SelectionSort;

import java.util.Arrays;

public class FachSelection {
	int feld[];
	int n;
	int tausch;
	
	public void initFeld(){
		feld = new int [8];
		feld[0] = 5;
		feld[1] = 4;
		feld[2] = 8;
		feld[3] = 2;
		feld[4] = 3;
		feld[5] = 9;
		feld[6] = 7;
		feld[7] = 6;
	}//belege end
	
	public void sortiereFeld(){
		for (int i = 0; i < feld.length - 1; i++) {
			for (int j = i + 1; j < feld.length; j++) {
				if (feld[i] > feld[j]) {
					int temp = feld[i];
					feld[i] = feld[j];
					feld[j] = temp;
				}//if end
			}//for 1 end
		}//for end 
	}//sortiereFeld in Selection Sort
	
	public void sortiereFeld1(){
		Arrays.sort(feld);
		System.out.println();
		System.out.print(Arrays.toString(feld));
		System.out.println();
	}//sortiereGFeld1
	
	public void zeigeFeld(){
		for(int i = 0; i < feld.length; i++){
			System.out.print(feld[i] + "\t");
			}//for end
		System.out.println();
		System.out.println("Durchgänge: " + tausch);
	}//zeigeFeld end 

}
