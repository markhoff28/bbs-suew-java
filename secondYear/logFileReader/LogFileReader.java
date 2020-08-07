package logFileReader;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogFileReader {
	private List<String> fileData = new ArrayList<>();
	private HashMap<String, Integer> statistik= new HashMap<String, Integer>();
	private String filePath = "";
	
	public void setDateiName(String dateiName)
	{
		this.filePath = dateiName;
	}// setDateiName end
	
	public void fillListWithData() throws IOException
	{	
		fileData = Files.readAllLines(Paths.get(filePath),Charset.forName("UTF-8"));
	}// fillListWithData end
	
	public int getAnzahlZeilen()
	{
		int laenge = fileData.size();
		return laenge;
	}// getCountLines() end
	
	public void getStatistikUser() {
		
		for(String output : fileData)
		{
			String name = output.substring(0, output.indexOf(" "));
//			System.out.println(name);
			if(statistik.containsKey(name)) {
				statistik.put(name, (statistik.get(name)+1));
			} else {
				statistik.put(name,1);
			}
			
		}// for each end
	}
	public void zeigeAlleZeichen() 
	{
		for(Map.Entry<String, Integer> value : statistik.entrySet())
		{
			System.out.println(value.getKey() + " => " + value.getValue());
		}// for each end
	}// zeigeAlleZeichen end
	
	@Override
	public String toString() {
		String ret ="";
		for(Map.Entry<String, Integer> value : statistik.entrySet())
		{
			ret +=value.getKey() + " => " + value.getValue() + "\n";
		}
		return ret;
	}
	
}
