package Queenproblem2;

public class FachQueen {
	 public static int solutions(boolean[][] queen, int row) {
	        if (row == queen.length) {
	            return 1;
	        }
	 
	        int counter = 0;
	        for (int col = 0; col < queen.length; col++) {
	            if (!isPositionSave(queen, row, col)) {
	                continue;
	            }
	 
	            queen[row][col] = true;
	            counter += solutions(queen, row + 1);
	            queen[row][col] = false;
	        }
	 
	        return counter;
	    }
	 
	    public static boolean isPositionSave(boolean[][] queen, int row, int col) {
	 
	        for (int i = 0; i < row; i++) {
	            int dC = row - i;
	            // Teste Spalte
	            if (queen[i][col]) {
	                return false;
	            }
	            // Teste linke Diagonale
	            if (col - dC >= 0 && queen[i][col - dC]) {
	                return false;
	            }
	            // Teste rechte Diagonale
	            if (col + dC < queen.length && queen[i][col + dC]) {
	                return false;
	            }
	        }
	 
	        return true;
	    }
}
