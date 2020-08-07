package binarySearch;

public class BinarySearchRekursiv {
public void searchBinary(int[] intArr, int links, int rechts, int key) {
        
        int mitte = links + ((rechts - links) / 2);
        
        if (intArr.length == 0) {
            System.out.println("Array leer.");
            return;
        }
        
        if (mitte >= intArr.length){
            System.out.println(key + " nicht im Array enthalten.");
            return;
        }

        if (key > intArr[mitte]) {
            searchBinary(intArr, mitte + 1, rechts, key);
        } else if (key < intArr[mitte] && links != mitte) {
            searchBinary(intArr, links, mitte - 1, key);
        } else if(key == intArr[mitte]) {
            System.out.println(key + " an Position " + mitte + " enthalten.");
        } else{
            System.out.println(key + " nicht im Array enthalten.");
        }
    } 
}
