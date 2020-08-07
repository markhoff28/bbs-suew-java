package Lotto;
import java.util.*;

public class FachklasseLotto {
	Scanner sc = new Scanner(System.in);
	int tipp [] = new int [6];
	int ziehung [] = new int [6];
	int supzahl;
	int randomSupzahl;
	int paar = 0;
	boolean ergebnis = false; 
	//int x;
	
	public void tipp(int tipp1, int tipp2, int tipp3, int tipp4, int tipp5, int tipp6)
	{
		tipp [0] = tipp1;
		tipp [1] = tipp2;
		tipp [2] = tipp3;
		tipp [3] = tipp4;
		tipp [4] = tipp5;
		tipp [5] = tipp6;
	/*	for(int e = 0; e < 6; e++)
	 * {
				System.out.println("Bitte geben Sie den " + e +  ". Tipp ein:");
				tipp[e] = sc.nextInt();
		}//for end*/
	}
	
	public void ziehen()
	{
		System.out.println("Ziehung erfolgt....");
		for(int e = 0; e < 6; e++)
		{
			ziehung [e] = (int) Math.round(1 + Math.random() * 49);
			System.out.println(e + ". Ziehung: " + ziehung [e]);
		}
		
		System.out.println("Ziehung beendet");
		System.out.println();
	}
	
	public void auswertenEingabe()
	{
		int u = 0;
		for(int z = 0; z < 6; z++)
		{
			if (tipp[z] == tipp[0]){
				paar++;
			}
			if (tipp[z] == tipp[1]){
				paar++;
			}
			if (tipp[z] == tipp[2]){
				paar++;
			}
			if (tipp[z] == tipp[3]){
				paar++;
			}
			if (tipp[z] == tipp[4]){
				paar++;
			}
			if (tipp[z] == tipp[5]){
				paar++;
			}
				
			if (paar > 1)
			{
				int tippein = u + 1;
				System.out.println("Bitte geben Sie die Zahl " + tippein + " erneut ein:");
				tipp[u] = sc.nextInt();
				u = u - 1;
			}
			paar = 0;
		}
	}
	
	public void auswertenDimiEingabe()
	{
		int u = 0;
		for(int z = 0; z < 6; z++)
		{
			for(int j = 0; j < 6; j++)
			{
				if (tipp[z] == tipp[j]){
					paar++;
				}	
			}
					
			if (paar > 1)
			{
				int tippein = u + 1;
				System.out.println("Bitte geben Sie die Zahl " + tippein + " erneut ein:");
				tipp[u] = sc.nextInt();
				u = u - 1;
			}
			paar = 0;
		}
	}
	
	public void puefenpaar()
	{
		for(int z = 0; z < 6; z++)
		{
			if (ziehung[z] == ziehung[1]){
				paar++;
			}
			if (ziehung[z] == ziehung[2]){
				paar++;
			}
			if (ziehung[z] == ziehung[3]){
				paar++;
			}
			if (ziehung[z] == ziehung[4]){
				paar++;
			}
			if (ziehung[z] == ziehung[5]){
				paar++;
			}
			if (ziehung[z] == ziehung[0]){
				paar++;
			}
			if (paar > 1){
				ziehung [z] = (int) Math.round(Math.random()* 49 + 1);
				z = z - 1;
			}
			paar = 0;
		}
	}

	public void pruefePaar2()
	{
		int x; 
		for (int i = 0; i < 6; i++)
		{
			x  = (int) Math.round(Math.random()* 49 + 1);
			while (istInFeld(ziehung[i], x )){
				x  = (int) Math.round(Math.random()* 49 + 1);			
			}
			ziehung[i] = x; 
		}
	}
	
	
	
	// gibt TRUE zurueck wenn die zahl im Feld; sonst FALSE
	public boolean istInFeld(int ziehung2, int zahl)
	{
	 
		if( ziehung2 == zahl){
			return ergebnis = true;
		}
		
		return ergebnis; 
	}
	
	public void vergleich()
	{
		System.out.println();
		int richtig = 0;
		for(int z = 0; z < 6; z++)
		{
			for(int t = 0; t < 6; t++)
			{
				if(ziehung[z] == tipp[t])
				{
					int ausg = z + 1; 
					System.out.println("Zahl " + ausg + ". ist richtig!");
					richtig ++;
				}
			}	
		}
		if (richtig == 1){
			System.out.println("Sie haben eine Zahl richtig");
		}
		System.out.println("Sie haben " + richtig + " zahlen richtig! Toll:)");
	}
	
	public void supZahl(int superzahl)
	{
		supzahl = superzahl;
	}
	
	public void starZahl()
	{
		randomSupzahl = (int) Math.round( Math.random()* 49 + 1);
		System.out.println();
		System.out.println(randomSupzahl);
		if (supzahl == randomSupzahl){
			System.out.println("Treffer");
		}else{
			System.out.println("Kein Treffer");
		}
	}

}