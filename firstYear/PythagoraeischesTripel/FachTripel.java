package PythagoraeischesTripel;

public class FachTripel {
int og;//obergrenze
int a, b, c;
int zaehler = 0;
int tripel;
	
	public void setObergrenze(int obergrenze){
		og = obergrenze;
		if(obergrenze >= 99){
			System.out.println("Bitte erneut eingeben");
		}else{
			System.out.println("Korrekte eingabe");
			System.out.println("Obergrenze:" + og);
		}//if else end
	}
	public void zaehlen(){
		System.out.println("_______________________________________________");
		System.out.println("a" + "\t" + "b" + "\t" + "c");
		for (a = 1; a <= og; a++){
			for (b = a; b <= og; b++){
				for (c = b; c <= og; c++){
					
					if ((Math.pow(a, 2) + Math.pow(b, 2)) > Math.pow(og, 2)){
						b++;
					}else {
						if (c > a && c > b) {
							
							if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
							System.out.println(a + "\t" + b + "\t" + c);
							tripel ++;
							}// if end
						}// if end
					}
					zaehler ++;
				}//for c end
			}//for b end
		}//for a end
		System.out.println("Triplel: " + "\t" + tripel);
		System.out.println("Durchgaenge: " + "\t" + zaehler);
	}
}
