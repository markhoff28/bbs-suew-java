package Notenprogramm;
import java.util.Random;
import java.util.Scanner;


public class FachNotenprogramm {
	Scanner sc = new Scanner(System.in);
	public int anzahl;
	public int note[];

	public void setTestData()
	{
		anzahl = new Random().nextInt(50) + 1;	
		// System.out.println(anzahl); //for debug
		note = new int [anzahl];
		for(int i = 0; i < note.length; i++)
		{
			note[i] = new Random().nextInt(6) + 1;
		}//for end
	}// settestData end
	
	public void setFixTestData()
	{
		anzahl = 3;
		note = new int [anzahl];
		
		note = new int [] { 1, 5, 3};
		
	}// settestData end
	public int ermittleAnzahlNoten()
	{
		System.out.println("Bitte die Anzahl der Noten eingeben:");
		anzahl = sc.nextInt();
		note = new int [anzahl];
		return anzahl;	
	}// ermittleAnzahlNote end
	
	public void leseNotenEin()
	{
		for(int i = 0; i < note.length; i++)
		{
			System.out.println("Bitte geben Sie die Note des " + i +  ". Schüler ein:");
			note[i] = sc.nextInt();
		}//for end
	}// leseNotenEin end

	public void zeigeNoten()
	{
		for(int i = 0; i < note.length; i++)
		{
			System.out.println("Die Note des " + i +  ". Schüler ist:" + note[i]);
		}//for end
	}// zeigeNote end
	
	public void zeigeDurchschnitt()
	{
		int tempNote = 0;
		for(int i = 0; i < note.length; i++)
		{
			tempNote = tempNote + note[i];
		}
		//System.out.println(tempNote);
		double ds = (double)tempNote / (double)anzahl;
		System.out.println("Der Durchschnitt der Klasse ist: " + ds);
	}// zeigeDuchschnitt end 
}// class end
