package binarySearch;

import java.util.Arrays;

public class TestBinarySearch {
	
	public static void main(String[] args) {
        int[] testArr = { 5, 3, 5, 228, 14, 69, 18, 27, 109, 85 };
        Arrays.sort(testArr);
        BinarySearchRekursiv bs = new BinarySearchRekursiv();
        BinarySearchInterativ ibs = new BinarySearchInterativ();
        System.out.println(ibs.BinarySearch(testArr, 5) +  " " + testArr[ibs.BinarySearch(testArr, 228)]);
        bs.searchBinary(testArr, 0, testArr.length - 1, 228);
        
    } 
}
