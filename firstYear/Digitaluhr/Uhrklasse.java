package Digitaluhr;

public class Uhrklasse {
	Zeitklasse start = new Zeitklasse();
	Zeitklasse stop = new Zeitklasse();
	Zeitklasse aktuell = new Zeitklasse();
	
	public void setStartzeit(int stunde, int minute, int sekunde)
	{
		start.setStunde(stunde);
		start.setMinute(minute);
		start.setSekunde(sekunde);
	}
	
	public void setStoptzeit(int stunde, int minute, int sekunde)
	{
		stop.setStunde(stunde);
		stop.setMinute(minute);
		stop.setSekunde(sekunde);
	}
	
	public void setAktuellezeit(int stunde, int minute, int sekunde)
	{
		aktuell.setStunde(stunde);
		aktuell.setMinute(minute);
		aktuell.setSekunde(sekunde);
	}
	
	public boolean checkTime()
	{
		int jetzt = aktuell.getSekunden();
		int halt = stop.getSekunden();
		if (jetzt <= halt)
		{
			return true;
		}else{
			return false;
		}
	}
	
	public void zeigeUhrzeit()
	{
		while(checkTime() == true)
		{
			aktuell.nextStep();
			System.out.println(aktuell.toString());
		}
	}
}
