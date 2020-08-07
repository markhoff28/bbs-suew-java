package HTML_Reader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HTML_Klasse {
	List<String> results = new ArrayList<>();
	private String dateiName = "";

	public void setDateiName(String dateiName)
	{
		this.dateiName = dateiName;
	}// setDateiName end
	
	public void leseDateiEin() throws IOException
	{	
		 results = Files.readAllLines(Paths.get(dateiName),Charset.forName("UTF-8"));
	}// leseDateEin end
	
	public void zeigeAlleZeichen() 
	{
		for(String output : results)
		{
			System.out.println(output);
		}// for each end
	}// zeigeAlleZeichen end
	
	public void zeigeZeile(int zeilennummer)
	{
		System.out.println(results.get(zeilennummer));
	}// zeigeZeilen end
	
	public void stringToInt()
	{
		String zahl = "289";
		int number = Integer.parseInt(zahl);
		System.out.println(number);
	}
	
	public void zeigeTextmuster(String muster)
	{
		for(String output : results)
		{	
			if (output.indexOf(muster) != -1)
			{
				System.out.println(output);
			}// if end
		}// for each end
	}// zeigeTextmuster end
	
	public void zaehleTextmuster(String muster)
	{
		int count = 0;
		for(String output : results)
		{
			if (output.indexOf(muster) != -1)
			{
				count ++;
			}
		}
		System.out.println("Textmuster: " + muster + " Anzahl: "+ count);
	}// zaehleTextmuster end
	
	public void zaehleZeilen()
	{
		int laenge = results.size();
		System.out.println("Laenge: " + laenge);
	}// zaehleZeilen end
	
	public void filterTags()
	{
		StringBuffer content = new StringBuffer();
		for(String output : results)
		{
			content.append(output);
		}// for end
		
		//Matcher matches = Pattern.compile("<([a-zA-Z]+)\\s*([a-zA-z=\"]*)>").matcher(content);
		Matcher matches = Pattern.compile("<(.*)>").matcher(content);
		while(matches.find())
		{
			System.out.println(matches.group());
		}// while end
	}// filterTag end
	
	public void zeigeDateipfad()
	{
		System.out.println("Der Pfad der Datei " + dateiName);
	}// zeigeDateipfad end
	
	public void zeigeDateinamen()
	{
		String tempDatei[] = dateiName.split("\\\\");
		System.out.println("Der Name der Datei " + tempDatei[tempDatei.length - 1]);
	}// zeigeDateinamen end
	
	public void zeigeAlleUeberschriften()
	{
		String connection = results.stream().collect(Collectors.joining("\n"));
		Matcher matches = Pattern.compile("<[hH][1-6].*>.*<\\/[hH][1-6]>").matcher(connection);
		while(matches.find())
		{
			System.out.println(matches.group());
		}// while end		
	}
	
	public void pruefeHyperlinks()
	{
		Pattern pattern = Pattern.compile("<a href=\\\"(http:\\/\\/|https:\\/\\/|)(.[^\"]*)\\\"");
		for (String line:results) {
			Matcher matches = pattern.matcher(line);
			while(matches.find())
			{
				//System.out.println(matches.group());
				String group = matches.group(1) + matches.group(2);
				//group = group.endsWith("/") ? group.substring(0, group.length() - 1) : group;
				try {
					URL url = new URL(group);
					URLConnection con = url.openConnection();
					System.out.println("  VALID " + group);
				} catch (IOException e) {
					System.out.println("  INVALID " + group);
				}		
			}// while end	
		}
	}
}// class end
