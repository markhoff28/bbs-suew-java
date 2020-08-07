package Verschluesselung;

public class Crypto {
	int myOffset = 0;
	
	public int getMyOffset() {
		return myOffset;
	}

	public void setMyOffset(int myOffset) {
		this.myOffset = myOffset;
	}

	public String crypt(String text, int offset){
		char[] target = text.toCharArray();
		for(int i = 0; i < target.length; i++) {
			if (target[i] != ' '){
				target[i] = (char) (target[i] + offset);
				if (target[i] > 'Z') {
					target[i] -= 25;
				}
				if (target[i] < 'A') {
					target[i] += 25;
				}
			}
		}
		return new String(target);
	}
	
	public String cryptPWE(String text){
		String target = "";
		for(int i = 0; i < text.length(); i++) {
			target = target + (char)((((text.charAt(i) - 65) + this.myOffset) % 26) + 65);
		}
		return new String(target);
	}
	
	public String kryptVigenere(String text, String schluessel) {
		String ergebnisText = "";
		for(int i = 0; i < text.length(); i++) {
			this.setMyOffset((int)schluessel.charAt((i%schluessel.length()))-65);
			
			ergebnisText = ergebnisText + cryptPWE(""+text.charAt(i));
		}
		return ergebnisText;
	}

}
