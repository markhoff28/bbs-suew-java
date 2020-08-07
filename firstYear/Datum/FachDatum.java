package Datum;
import java.util.Scanner;

public class FachDatum {
	int tag;
	int monat;
	int jahr;
	
	Scanner sc = new Scanner (System.in);
	String monthString, dayString;
	
	public void leseDatumVonTastatur()
	{
		System.out.println("Bitte geben Sie den Tag ein: ");
		setTag(tag = sc.nextInt());
		System.out.println("Bitte geben Sie den Monat ein: ");
		setMonat(monat = sc.nextInt());
		System.out.println("Bitte geben Sie den Jahr ein: ");
		setJahr(jahr = sc.nextInt());
	}
	
	public int getTag() 
	{
		return tag;
	}

	public void setTag(int tag) 
	{
		this.tag = tag;
	}

	public int getMonat() 
	{
		return monat;
	}

	public void setMonat(int monat) 
	{
		this.monat = monat;
	}

	public int getJahr() 
	{
		return jahr;
	}

	public void setJahr(int jahr) 
	{
		this.jahr = jahr;
	}
	public void setzeTestdatum()
	{
		tag = 21;
		monat = 1;
		jahr = 2019;
	}
	public void zeigeDatumKlassisch()
	{
		System.out.println(getTag() + "." + getMonat() + "." + getJahr());
	}
	public void zeigeDatumInternational()
	{
		System.out.println(getJahr() + "-" + getMonat() + "-" + getTag());
	}
	public void zeigeTag(){
		System.out.println(getTag());
	}
	public void zeigeMonat(){
		System.out.println(getMonat());
	}
	public void zeigeJahr(){
		System.out.println(getJahr());
	}
	
	public void gebeMonatsNameAus1()
	{
		if(monat == 1){
			monthString = "Januar";
		}
		if(monat == 2){
			monthString = "Februar";
		}
		if(monat == 3){
			monthString = "März";
		}	
		if(monat == 4){
			monthString = "April";
		}
		if(monat == 5){
			monthString = "Mai";
		}
		if(monat == 6){
			monthString = "Juni";
		}
		if(monat == 7){
			monthString = "Juni";
		}
		if(monat == 8){
			monthString = "August";
		}
		if(monat == 9){
			monthString = "September";
		}
		if(monat == 10){
			monthString = "Oktober";
		}
		if(monat == 11){
			monthString = "November";
		}
		if(monat == 12){
			monthString = "Dezember";
			
		}else {
			System.out.println("Falsche Eingabe");
		}
			System.out.println("Der Monat lautet: " + monthString);
	}//gebeMonatsNameAus1 end
	
	public void gebeMonatsNameAus2()
	{
		if(monat == 1){
			monthString = "Januar";
		}
		else if(monat == 2){
			monthString = "Februar";
		}
		else if(monat == 3){
			monthString = "März";
		}	
		else if(monat == 4){
			monthString = "April";
		}
		else if(monat == 5){
			monthString = "Mai";
		}
		else if(monat == 6){
			monthString = "Juni";
		}
		else if(monat == 7){
			monthString = "Juni";
		}
		else if(monat == 8){
			monthString = "August";
		}
		else if(monat == 9){
			monthString = "September";
		}
		else if(monat == 10){
			monthString = "Oktober";
		}
		else if(monat == 11){
			monthString = "November";
		}
		else if(monat == 12){
			monthString = "Dezember";
		}else {
			System.out.println("Falsche Eingabe");
		}
		System.out.println("Der Monat lautet: " + monthString);
	}//gebeMonatsNameAus2 end

	public void  gebeMonatsNameAus3()
	{
        switch (monat) {
            case 1:  monthString = "Januar";
                     break;
            case 2:  monthString = "Februar";
                     break;
            case 3:  monthString = "März";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "Mai";
                     break;
            case 6:  monthString = "Juni";
                     break;
            case 7:  monthString = "Juli";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "Oktober";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "Dezember";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
	}
	
	public void gebeQuatalAus()
	{
		if(monat >= 1 & monat < 4) 
		{
			System.out.println("Quartal |");
		}else if(monat >= 4 & monat < 7){
			System.out.println("Quartal ||");
		}else if(monat >= 7 & monat < 10){
			System.out.println("Quartal |||");
		}else {
			System.out.println("Quartal |V");
		} 
	}
	
	public void  gebeQuatalAus2()
	{
        switch (monat) {
            case 1: 
            case 2:  
            case 3:  System.out.println("Quartal |");
            		 break;
            case 4:  
            case 5:  
            case 6:  System.out.println("Quartal ||");
                     break;
            case 7:  
            case 8:  
            case 9:  System.out.println("Quartal |||");
                     break;
            case 10: 
            case 11: 
            case 12: System.out.println("Quartal |V");
                     break;
            default: monthString = "Invalid month";
                     break;
        }
	}
	
	public void gebeQuatalAus3()
	{
		if(monat == 1 | monat == 2 | monat == 3) 
		{
			System.out.println("Quartal |");
		}else if(monat == 4 | monat == 5 | monat == 6){
			System.out.println("Quartal ||");
		}else if(monat == 7 | monat == 8 | monat == 9){
			System.out.println("Quartal |||");
		}else if(monat == 10 | monat == 11 | monat == 12){
			System.out.println("Quartal |V");
		}else {
			System.out.println("Falsche Eingabe");
		} 
	}
	
	public void zeigeWochentag() 
	{
		int w, t, m, j, c, y;
		t = getTag();
		m = getMonat();
		j = getJahr();
		if (m < 3) {
			m = m + 12;
			j = j - 1;
		}//if end
//		System.out.println(t +" " + m +" "+ j ); // for Debug
		c = j / 100;
		y = j % 100;
		
		w = (t + ((13 * (m + 1))/ 5) + y + (y / 4) + (c / 4) - (2 * c) ) % 7;
		
		switch (w) {
		case 0:  dayString = "Samstag";
        		 break;
		case 1:  dayString = "Sonntag";
                 break;
        case 2:  dayString = "Montag";
                 break;
        case 3:  dayString = "Dienstag";
                 break;
        case 4:  dayString = "Mittwoch";
                 break;
        case 5:  dayString = "Donnerstag";
                 break;
        case 6:  dayString = "Freitag";
                 break;
        case -1:  dayString = "Sonntag";
        		 break;
        case -2:  dayString = "Montag";
        		 break;
        case -3:  dayString = "Dienstag";
        		 break;
        case -4:  dayString = "Mittwoch";
        		 break;
        case -5:  dayString = "Donnerstag";
        		 break;
        case -6:  dayString = "Freitag";
        		 break;
        default: dayString = "Invalid day";
                 break;
		}// switch case end
		System.out.println(dayString);
	}// zeigeWochentag end
	
	public void zeigeOsterdatum() 
	{
		int p = getJahr() / 100;
		int n = getJahr() % 100;
		int j = 100 * p + n;
		int q = p / 3;
		int r = p / 4;
		int x = (15 + p - q - r) % 30;
		int y = (p - r + 4) % 7;
		int a = j % 19;
		int b = j % 4;
		int c = j % 7;
		int d = (19 * a + x) % 30;
		int e = ((2 * b) + (a * c) + (6 * d) + y) % 7;
		
		if ((22 + d + e) <= 31) {
			System.out.println("Ostern am " + (22 + d + e) + " März");
		}
		if ((d / e -9) <= 31) {
			System.out.println("Ostern am " + (22 + d + e) + " April");
		}
/*		int p = jahr / 100;
		int n = jahr % 100;
		int j1 = 100 * p + n;
		int q = p / 3;
		int r = p / 4;
		int x = 30 % (15 + p + q + r);
		int y = 7 % ( p - r + 4);
		int a = 19 % j1;
		int b = 4 % j1;
		int c = 7 % j1;
		int d = 30 % (19 * a + x);
		int e = 7 % (2 * b + 4 * c + 6 * d + y);*/
		
		if ((d==29)&&(e==6)){
			System.out.println("Ostern ist am 19 April");
			}
		if ((d==28)&&(e==6)){
			System.out.println("Ostern ist am 18 April");
			}
		if ((22+d+e)<=31){
			System.out.println("Ostern ist am " + "März");
			}
		if ((d+e-9)<=31){
			System.out.println("Ostern ist am " + "April");
			}
	}
	
	public void plausibilitaetsPruefung(){
		boolean bjahr, bmonat, bschaltjahr, btag = false;
//		boolean btag = false;
		int lastDayInMonth = 0;
		
		if ((getJahr()>=0)&&(getJahr()<=9999)){
			bjahr = true;
			}else {
			bjahr = false;
		}// prueft das jahr---------------------------------------------------
		
		if ((getMonat()>=0)&&(getMonat()<=12)){
			bmonat = true;
			}else {
			bmonat = true;
		}// prueft den monat ---------------------------------------------------

		if ((getJahr() % 4 == 0) & (getJahr() % 100 != 0) | getJahr() % 400 == 0) {
			bschaltjahr = true;
			}else {
			bschaltjahr = false;
		}// prueft das schaltjahr---------------------------------------------------
		
		if ((getMonat() == 1) | (getMonat() == 3) | (getMonat() == 5) | (getMonat() == 7) | (getMonat() == 8) | (getMonat() == 10) | (getMonat() == 12)) {
			lastDayInMonth = 31;
	   	}
		if ((getMonat() == 4) | (getMonat() == 6) | (getMonat() == 9) | (getMonat() == 11)) {
			lastDayInMonth = 30;
		}
		if ((getMonat() == 2) & (bschaltjahr == false)) {
			lastDayInMonth = 28;
		}
		if ((getMonat() == 29) & (bschaltjahr == true)) {
			lastDayInMonth = 29;
		}else {
			//System.out.println("Falscher Tag");
		}// prueft setzt den jetzten tag des monat---------------------------------------------------
		
		if ((getTag() >= 0) && (getTag() <= lastDayInMonth)) {
			System.out.println(lastDayInMonth);
			btag = true;
		}// prueft den tag
		
		if (bjahr == true & bmonat == true & btag == true) {
			System.out.println("Das Datum ist in Ordnung");
		}else {
			System.out.println("Das Datum ist nicht in Ordnung");
		}// prueft das ges. Datum
	}//plausibilitaetspruefung end
}//class end

