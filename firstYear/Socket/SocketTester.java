package Socket;
import java.net.*;
import java.io.*;

/*
 * @author bsit18hoffmann
 * this class is a simple port scanner
 * */

public class SocketTester {
	static int startPortnummer = 0;
	static int endPortnummer = 1024;
	static String servernummer = "10.10.10.7";
	
	public static void main(String[] args){
		int portnummer;
		for(portnummer = startPortnummer; portnummer <= endPortnummer; portnummer++){
			try{
				Socket sock = new Socket(servernummer, portnummer);
				System.out.println("Verbunden mit " + sock.getInetAddress()+ " Portnummer:" + sock.getPort());
			}
			catch(UnknownHostException e){
				System.err.println("Unbekannte Verbindung!" + portnummer);
			}catch(IOException e){
				//System.err.println("Port: " + portnummer + " Nicht verfügbar!");
			}catch(Exception e){
				System.err.println("Error");
			}// exception handling end
		}// for end
	}// main end

}// class end