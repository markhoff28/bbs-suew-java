package Verschluesselung;

public class TestCrypto {

	public static void main(String[] args) {
		Crypto cryo = new Crypto();
//		System.out.println("Der Text ist folgender: " + cryo.crypt("GDV ZDU JHKHLP", -3));
//		System.out.println("Der Text ist folgender: " + cryo.crypt("DAS IST GEHEIM", +26));
		cryo.setMyOffset(3);
		String orgianalText = "APFEL";
		System.out.println(cryo.cryptPWE(orgianalText));
		System.out.println(cryo.kryptVigenere("APFELBAUM", "BIRNE"));
	}

}
