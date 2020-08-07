package binarySearch;

public class BinarySearchInterativ {
	int  BinarySearch(int[] array, int key) {
		   /* input: Folge F der Länge n, Schlüssel k */ 
		   /* output Position p  (0 <= p <= n-1)   */
		   int links = 0;
		   int rechts = array.length-1; 
		   int mitte;
		   while (links <= rechts) { 
		       mitte = (links + rechts) / 2;
		       if  (array[mitte] ==  key)
		           return mitte; 
		       else
		           if (key < array[mitte]) 
		               rechts = mitte - 1;
		           else
		               links = mitte + 1; 
		  }    
		  return -1;
		}
}
