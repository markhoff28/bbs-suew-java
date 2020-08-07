package Queenproblem;

import java.util.Scanner;

public class TestQueen {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 FachQueen queen  = new FachQueen();
	     System.out.println("n-Daten-Problem");
	     System.out.println();
	     System.out.print("n: ");
	      int n = in.nextInt();
	        int[] q = queen.queens(n);
	        queen.print(q);
	

	}

}
