package Bubble;
import java.util.*;

public class FachBubble {
	int feld[];
	int n;
	int tausch;
	
	public void initFeld(int n){
		this.n = n;
		feld = new int [n];
		for(int i = 0; i < n; i++){
			feld[i] = (int) (Math.random()* 99 -1);
			System.out.println(feld[i]);
		}//for end
	}//belege end
	
	public void sortiereFeld(){
		for(int i = 0; i < n ; i++){
			for(int o = 0; o < (n - 1); o++){
				if(feld[o] > feld[o + 1]){
					tausch++;
					int zahl = feld[o];
						feld[o] = feld[o + 1];
						feld[o + 1] = zahl;
					}//if end
			}//for end
		}//for end
	}//sortiereFeld
	
	public void sortiereFeld1(){
		Arrays.sort(feld);
		System.out.println();
		System.out.print(Arrays.toString(feld));
	}//sortiereGFeld1
	
	public void zeigeFeld(){
		for(int i = 0; i < n; i++){
			System.out.print(feld[i] + "\t");
			}//for end
		System.out.println();
		System.out.println("Durchgänge: " + tausch);
	}//zeigeFeld end 

}
