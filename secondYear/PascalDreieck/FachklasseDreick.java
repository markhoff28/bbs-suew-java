package PascalDreieck;

public class FachklasseDreick {
	int n;
	int feld[][];
	
	/**
	 * erstellt das dreieck 
	 * befuellt die raender des array mit 1
	 * fuellt den rest des arrays auf
	 * @param n
	 */
	public void initDreieck(int n){
		this.n = n;
		//n = 3;
		feld = new int [n][n];
		for(int z = 0; z < n; z++){
			feld[z][0] = 1;
			feld [z][z] = 1;
		}
		for(int zeile = 1; zeile < n; zeile++){
			for(int spalte = 1; spalte < n; spalte++){
				feld[zeile][spalte] = feld[zeile - 1][spalte - 1] + feld[zeile - 1][spalte];				 
			}//for end
		}//for end
	}//intDreieck end
	
	/**
	 * print the array in the console
	 */
	public void zeigeDreieck(){
		n = n -1;
		for(int i = 0; i < n; i++){
			for(int o = 0; o < n; o++){
				if(feld[i][o] != 0){
					System.out.print(feld[i][o]);	
				}
				}//for end 
		System.out.println();	
		}//for end
	}//zeigeDreieck end

}//class end
