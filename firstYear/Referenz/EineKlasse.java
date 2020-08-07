package Referenz;

public class EineKlasse 
{
	int a;

	public int getA() {
		return a;
	}

	public void setA(int b) {
		this.a = b;
	}
	
	public void nochEineMethode(EineKlasse einBezeichner) {
		einBezeichner.a = 29;
	}
}
