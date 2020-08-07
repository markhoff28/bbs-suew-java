package Sternchen;

public class Stern {
	public void forschlieife1(){
		for (int stern1 = 1; stern1 <= 5; stern1++){
			System.out.print("*");
		}
	}
	public void forschleife2(){
		System.out.println("");
		for (int stern2 = 1; stern2 <= 5; stern2++){
			System.out.print(" *");
		}
	}
	public void forschlieife3(){
		System.out.println("");
		for (int stern3 = 1; stern3 <= 5; stern3++){
			System.out.print("*");
		}
		System.out.println("");
		for (int stern3 = 1; stern3 <= 5; stern3++){
			System.out.print("*");
		}
	}
	public void HalberBaum(){
		for (int dreieck = 1; dreieck <= 5; dreieck++){
			System.out.println("");
			for (int stern4 = 1; stern4 <= dreieck; stern4 ++){
				System.out.print("*");
				}//for end
		}//for groß end
	}
	public void halberBaum(){
		for (int dreieck = 1; dreieck <= 5; dreieck++){
			System.out.println("");
			for (int stern5 = 1; stern5 <= dreieck; stern5 ++){
				System.out.print("*");
				}//for end
			for (int luecke = dreieck; luecke <= dreieck; luecke --){
				System.out.print(" ");
			}//for end 
		}//for groß end
	}
	public void weihnachtsbaum(){
		/*System.out.println("");
		for (int dreieck1 = 1; dreieck1 <= 5; dreieck1 ++){
			System.out.println("");
			*/
		
		//btnHdd.setEnadled(true);
		//lblHdd.setVisible(false);
		
	}
}
