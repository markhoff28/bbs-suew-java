package BornToDie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	
	private String dateiName = "";
		
	public void zeigeDatei() {
		String textZeile = "";
		FileReader meinFile = null;
				
			try {
				meinFile = new FileReader(dateiName);
				
				BufferedReader meinLeseStream = new BufferedReader(meinFile);
				
				textZeile = meinLeseStream.readLine();
				while (textZeile != null) {
					System.out.println(textZeile);
					textZeile = meinLeseStream.readLine();
				}
				meinFile.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
			System.out.println("### ENDE ###");
			
		
	}
	
	
	/* ---------------------------------------------------------- */
	
	public void setDateiName(String dateiName) {
		this.dateiName = dateiName;
	}

}
