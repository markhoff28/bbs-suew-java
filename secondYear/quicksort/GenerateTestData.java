package quicksort;

import java.util.Scanner;

public class GenerateTestData {
	int feld[] = new int[1_000_000];
	int n = feld.length;
	Scanner sc = new Scanner (System.in);
	
	public int[] belegeFelder(){
		for(int i = 0; i < n; i++){
			feld[i] = (int) Math.round(1 + Math.random()* 20_000_000);
			//System.out.println(feld[i]);
		}//for end
		return feld;
	}//belege end
	
	
}
