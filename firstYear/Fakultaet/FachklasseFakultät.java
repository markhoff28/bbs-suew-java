package Fakultaet;
import java.util.*;

public class FachklasseFakultät {
	Scanner sc= new Scanner (System.in);
	
	public int fakultaet(int n){
		int f = 1;
		for(int i = 1; i <= n; i++){
			f = f * i;
		}//for end
		return f;
		}//fakultaet end
	
	public int fakultaet2(int n){
		if (n == 1){
			return 1;
		}else{
		return fakultaet2(n - 1) * n;
		}// else if end
	}

}//class end
