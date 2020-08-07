package Digitaluhr;
import java.util.concurrent.TimeUnit;
import java.util.*;
public class FachDigitaluhr {
	Scanner sc = new Scanner(System.in);
	private int startStunde, startMinute, startSekunde;
	private int stopStunde, stopMinute, stopSekunde;
	
	public void leseUhrzeitvontastatur() {
		System.out.println("Bitte geben Sie die Stunde ein:");
		startStunde = sc.nextInt();
		System.out.println("Bitte geben Sie die Minute ein:");
		startMinute = sc.nextInt();
		System.out.println("Bitte geben Sie die Seunde ein:");
		startSekunde = sc.nextInt();
	}
	
	public void setUhrzeit(int stunde, int minute, int sekunde) {
		this.setStartStunde(stunde);
		this.setStartMinute(minute);
		this.setStartSekunde(sekunde);
	}
	
	public void setStopzeit(int sstunde, int sminute, int ssekunde) {
		this.stopStunde = sstunde;
		this.stopMinute = sminute;
		this.stopSekunde = ssekunde;
	}

	public void setStartStunde(int startStunde) {
		if ((startSekunde >= 0) && (startSekunde <= 24)) {
			this.startStunde = startStunde;
			System.out.println("Stunde OK");
		}else {
			startStunde = 0;
		}
	}

	public void setStartMinute(int startMinute) {
		if ((startMinute >= 0) && (startMinute <= 59)) {
			this.startMinute = startMinute;
			System.out.println("Minute OK");
		}else {
			startMinute = 0;
		}
	}

	public void setStartSekunde(int startSekunde) {
		if ((startSekunde >= 0) && (startSekunde <= 59)) {
			this.startSekunde = startSekunde;
			System.out.println("Sekunde OK");
		}else {
			startSekunde = 0;
		}	
	}

	public void zeigeUhrzeit() throws InterruptedException{
		for(int h = startStunde; h <= stopStunde; h ++){
			for(int m = startMinute; m <= stopMinute; m++) {
				for(int s = startSekunde; s <= stopSekunde; s++) {
					System.out.println( h +":" + m  + ":" + s);
					TimeUnit.SECONDS.sleep(1);
				}// for s end
				startSekunde = 0;
			} // for m end
			startMinute = 0;
		}// for s end
	}//uhrzeit() end

}// class end
