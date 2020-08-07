package logFileReader;

import java.io.IOException;

public class LogFileReaderTest {

	public static void main(String[] args) {
		LogFileReader myLog = new LogFileReader();
		myLog.setDateiName("C:\\Users\\magnu\\Documents\\Schule\\Loginlog.log");
		try {
			myLog.fillListWithData();;
		} catch (IOException e) {
			e.printStackTrace();
		}
//		
		myLog.getStatistikUser();
		System.out.println(myLog);

	}

}
