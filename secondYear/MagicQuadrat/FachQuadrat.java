package MagicQuadrat;

import java.util.Scanner;

public class FachQuadrat {
	Scanner sc = new Scanner(System.in);
	int length = 0;
	int[][] quad;
	
	/**
	 * initalisiert das quadrat
	 */
	private void initQuadrat(){
		System.out.print("Ungerade Zahl zwischen 2 und 10 eingeben: ");
		length = sc.nextInt();
//		if ((length % 2 == 0) || (length < 3) || (length > 9)) {
//			System.out.println(" ");
//			System.err.println("Nur ungerade Zahlen zwischen 2 und 10 sind erlaubt!\noder Zahl darf nicht kleiner als 2 oder grösser 10 sein!");
//			System.exit(0);
//		}
	}//intQuadrat end
	
	/**
	 * 
	 */
	private void erstelleQuadrat(){
		initQuadrat();
		quad = new int[length][length]; 
		int z = 0, s = length / 2;
		int i = 0;
		
		do {
			i++;
			quad[z][s] = i;
			
			if((i % length) == 0) {
				 z --;
				 if( z < 0) {
					 z = length - 1;
				 }
			}
			else {
				z++;
				s++;
				
				if(z == length) {
					z = 0;
				}
				if(s == length) {
					s = 0;
				}
			}
		}
		while(i < length * length);
	}
		
	public void zeigeQuadrat(){
		erstelleQuadrat();
		System.out.println(" ");
		for (int i = 0; i < quad.length; i++) {
			for (int j = 0; j < quad[i].length; j++) {
				System.out.print(" ");
				System.out.print(" " + quad[i][j]);
			}
			System.out.println();
		}
	}
}

