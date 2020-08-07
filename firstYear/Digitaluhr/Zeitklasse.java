package Digitaluhr;

public class Zeitklasse {
	int stunde, minute, sekunde;

	public int getStunde() {
		return stunde;
	}

	public void setStunde(int stunde) {
		if ((stunde >= 0) && (stunde <= 23)) {
			this.stunde = stunde;
			//System.out.println("Stunde OK");
		}else {
			stunde = 0;
		}
		//this.stunde = stunde;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if ((minute >= 0) && (minute <= 59)) {
			this.minute = minute;
			//System.out.println("Sekunde OK");
		}else {
			minute = 0;
		}	
	}

	public int getSekunde() {
		return sekunde;
	}

	public void setSekunde(int sekunde) {
		if ((sekunde >= 0) && (sekunde <= 59)) {
			this.sekunde = sekunde;
			//System.out.println("Sekunde OK");
		}else {
			sekunde = 0;
		}	

	}
	
	public void setZeit(int stunde, int minute, int sekunde) {
		this.setStunde(stunde);
		this.setMinute(minute);
		this.setSekunde(sekunde);
	}
	
	public int getSekunden()
	{
		return ((stunde * 3600) + (minute * 60) + sekunde);
	}
	
	public void nextStep()
	{
		if (sekunde < 59)
		{
			sekunde++;
		}
		else if( minute < 59)
		{
			minute++;
			sekunde = 0;
		}
		else if( stunde < 59)
		{
			stunde++;
			minute = 0;
			sekunde = 0;
		}
	}
	
	public String toString()
	{
		return stunde + ":" + minute + ":" + sekunde;
	}
	

}
