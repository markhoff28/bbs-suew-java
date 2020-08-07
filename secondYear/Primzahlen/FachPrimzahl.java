package Primzahlen;
import java.util.Scanner;

public class FachPrimzahl 
{
	Scanner sc = new Scanner(System.in);
	int number, p, z;
	boolean primzahlen[]; 
	int count = 0;
	
	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}

	public void setzeObergrenze()
	{
		System.out.println("Bitte geben Sie die Obergrenze ein: ");
		number = sc.nextInt();
	}// setzeObergrenze end
	
	public void befuelleMeinArray()
	{
		primzahlen = new boolean[number];
		
		for(int i = 0; i < number; i++){
			primzahlen[i] = true;
		}//for end
	}
	
	public void ermittlePrimzahl()
	{
		
		befuelleMeinArray();
		p = 2;
		do{
			z = 2;
			while((p * z) < number)
			{
				primzahlen[p * z] = false;
				z = z + 1;
			}//while end
			p = p + 1;
			while(primzahlen[p] == false)
			{
				p = p + 1;
			}//while end
		}
		while(p < Math.sqrt(number));
		
	}//ermittlePrimzahlen end
	
	public void zeigePrimzahl()
	{	
		ermittlePrimzahl();
		for(int i = 2; i < number; i++)
		{
			if(primzahlen[i] == true){
				count ++;
				System.out.println(i);
			} // if end
		}// for end
	} // zeigePrimzahlen
	
	public void calcCount()
	{	
		ermittlePrimzahl();
		for(int i = 2; i < number; i++)
		{
			if(primzahlen[i] == true){
				count ++;
			} // if end
		}// for end
	} // zeigePrimzahlen
	public void zeigeDurchgaenge()
	{
		System.out.println();
		System.out.println("Anzahl der Durchgaenge zum Ermitteln der Dargestellten Primzahlen: " + count);
	}
}
