package Tilgungsplan;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FachTilgungsplan {
	Scanner sc = new Scanner (System.in);
	DecimalFormat df = new DecimalFormat("#0.00");
	double dkredit;
	double drate;
	double dzinssatz;
	double dzins;
	double drestkredit;
	double dtilgung;
	double dlaufzeit;
	double dgesammtzinsen;
	int imonat;
	
	public void eingabe()
	{
		System.out.println("Bitte geben Sie Ihre Kreditdaten ein:");
		System.out.println();
		System.out.println("Bitte geben Sie die Kreditsumme ein:");
		dkredit = sc.nextDouble();
		System.out.println("Bitte geben Sie die den Zinssatz ein:");
		dzinssatz = sc.nextDouble();
		System.out.println("Bitte geben Sie die Rate ein:");
		drate = sc.nextDouble();
	}// eingabe end
	
	public void plausibilitaet()
	{
		dzins = (dkredit * (dzinssatz / 100)) / 12;
		while (drate < dzins){
			System.out.println("Bitte geben Sie eine andere Rate ein:");
			drate = sc.nextInt();
		}// while
	}// plausibilitaet end
	public void planAusgabe()
	{
		System.out.println("Ausgabe:");
		System.out.println("Höhe des Kredits: " + dkredit);
		System.out.println("Höhe der monatlichen Rate: " + drate);
		System.out.println("Zinsatz in Porzent: " + dzinssatz);
		System.out.println();
		System.out.println("Tilgungsplan");
		System.out.println("------------------------------------------------------------------");
		System.out.println("Monat \t Restkredit \t mtl. Rate \t  Tilgung \tZinsen");
		System.out.println("------------------------------------------------------------------");
		
		dtilgung = drate;
		
		while (dkredit > drate){
			dzins = (dkredit * (dzinssatz / 100)) / 12;
			dtilgung = drate - dzins;
			
			imonat++;
			dgesammtzinsen = dgesammtzinsen + dzins;
		
			System.out.println(df.format(imonat) + "  \t " + df.format(dkredit) + "  \t" + df.format(drate) + "  \t" + df.format(dtilgung) + "   \t" + df.format(dzins));
			dkredit = dkredit - dtilgung;
		}//while end
		dzins = (dkredit * (dzinssatz / 100)) / 12;
		dtilgung = drate - dzins;
		
		dgesammtzinsen = dgesammtzinsen + dzins;
		imonat++;
		
		System.out.println(df.format(imonat) + "  \t" + df.format(dkredit) + "  \t" + df.format(dkredit + dzins) + "  \t" + df.format(dkredit) + "   \t" + df.format(dzins));
		System.out.println("------------------------------------------------------------------");
		System.out.println("Die Laufzeit war " + imonat + " Monate");
		System.out.println("Gesammtzinsen: " + df.format(dgesammtzinsen) + " Euro");
	}// planAusgabe end
}// class end
