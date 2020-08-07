package Aufzug;
import java.text.DecimalFormat;
import java.util.*;

/**
 * Dient zur Berechnung der Atribute eines einfachen Aufzuges
 * 
 * @author bsit18hoffmann
 */

public class AufzugsKlasse 
{
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#0.00");
	
	double ump; //umdrehungen pro minute
	double durchmesser;
	double time;	
	double strecke;
	double geschwindigkeit;

	public void werteEinlesen() 
	{
		System.out.println("Bitte geben Sie die Umdrehungenpro Minute des Antriebsmotors ein:");
		ump = sc.nextDouble();
		System.out.println("Bitte geben Sie den Durchmesser der Seilrolle in Meter ein:");
		durchmesser = sc.nextDouble();
		System.out.println("Bitte geben Sie die Laufzeit des Aufzugs ein:");
		time = sc.nextDouble();
	}//werteEinlesen end

	public void werteBerechnen()  
	{
		strecke = (Math.PI * durchmesser  * ump) * time;
		geschwindigkeit  = (strecke / time) / 60;
	}//werteBerechnen end

	public void werteAusgeben() 
	{
		System.out.println("Die Wegstrecke beträgt:" + df.format(strecke) + "m");
		System.out.println("Die Geschwindigkeit beträgt: " + df.format(geschwindigkeit) + "m/s");
	}//werteAusgeben end
}// class end
