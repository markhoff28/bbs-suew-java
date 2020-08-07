package MathematischeFormeln;
import java.text.DecimalFormat;

public class Formeln {
	DecimalFormat df = new DecimalFormat("#0.00000");
		int iA = -3;
		int iB = 4;
		int iC = 5;
		
		public void aufgabe1() 
		{
			double dErgebnis1 = (double)iA/iB;
			System.out.println("Ergebnis 1: " + df.format(dErgebnis1));
		}
		
		public void aufgabe2() 
		{
			double dErgebnis2 = Math.cbrt(iB);
			System.out.println("Ergebnis 2: " + df.format(dErgebnis2));
		}
		
		public void aufgabe3() 
		{
			double dErgebnis3 = Math.pow(iC, 3);
			System.out.println("Ergebnis 3: " + df.format(dErgebnis3));
		}
		
		public void aufgabe4() {
			double dErgebnis4 = Math.sqrt(Math.pow(iB, 2) + Math.pow(iC, 2));
			System.out.println("Ergebnis 4: " + df.format(dErgebnis4));
		}
		
		public void aufgabe5() {
			double dErgebnis5 = (Math.sqrt(Math.pow(iB, 2) + Math.pow(iC, 2)) +3 * iA) / (Math.abs(iA) + 2);
			System.out.println("Ergebnis 5: " + df.format(dErgebnis5));
		}
		
		public void aufgabe6() {
			double dErgebnis6 = Math.sin((3 * iA * Math.PI) / iC );
			System.out.println("Ergebnis 6: " + df.format(dErgebnis6));
		}
		
		public void aufgabe7() {
			double dErgebnis7 = (iA * iB + Math.pow(iC, iA)) / 3 + (iB / (2 + ((double)5 / iB)));
			System.out.println("Ergebnis 7: " + df.format(dErgebnis7));
		}


}//class end
