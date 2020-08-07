package shellSort;

public class ShellSort {
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	int sort(int arr[]) {
		int count = 0;
		int n = arr.length;
		for (int gap = n/2; gap > 0; gap /= 2) {
			for (int i = gap; i < n; i ++) {
				int temp = arr[i];
				int j = i;
				while (j >= gap && arr[j - gap] > temp) {
					arr[j] = arr[j - gap];
					j -= gap;
				}
				arr[j] = temp;
				count ++;
				printArray(arr);
			}
		}
		System.out.println(count);
		return 0;
	}
	
	public static void main (String args[]) {
		int arr[] = {7, 4, 1, 8, 5, 2, 9, 6, 3, 0};
//		System.out.println("Bevor");
//		printArray(arr);
		ShellSort ob = new ShellSort();
		ob.sort(arr);
		System.out.println("After");
		printArray(arr);
	}
}
