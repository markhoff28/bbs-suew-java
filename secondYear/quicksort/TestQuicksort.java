package quicksort;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class TestQuicksort {

	public static void main(String[] args) {
		 Quicksort quick = new Quicksort();
		 GenerateTestData testdata = new GenerateTestData();
		 int[] arr = testdata.belegeFelder();
		 long beginn = System.nanoTime();
		 quick.quickSort(arr, 0, arr.length-1);
		 long endtime = System.nanoTime();
		 System.out.println(TimeUnit.NANOSECONDS.toMillis(endtime - beginn));
		 for(int i = 0; i < arr.length-1; i++){
			 if (arr[i] <= arr[i + 1]) {
//				 System.out.println("true");
			 }else {
				 System.out.println("False");
			 }
		}//for end
			
		    

	}

}
