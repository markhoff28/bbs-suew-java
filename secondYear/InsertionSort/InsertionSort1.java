package InsertionSort;

public class InsertionSort1 {
	
	public int[] intArr = { 5, 4, 8, 2, 3, 9, 7, 6 }; 

	    public int[] sort() { 
	        int k; 
	        for (int i = 0; i < intArr.length; i++) { 
	            for (int j = intArr.length-1; j > 0; j--) { 
	                if (intArr[j-1] > intArr[j]) { 
	                    k = intArr[j]; 
	                    intArr[j] = intArr[j - 1]; 
	                    intArr[j - 1] = k; 
	                } 
	            } 
	        } 
	        return intArr; 
	    } 

	    public static void main(String[] args) { 
	        InsertionSort1 is = new InsertionSort1(); 
	        int[] arr = is.sort(); 
	        for (int i = 0; i < arr.length; i++) { 
	            System.out.println(i + 1 + ": " + arr[i]); 
	        } 
	    } 
}
