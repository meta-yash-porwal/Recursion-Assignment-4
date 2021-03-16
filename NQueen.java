import java.util.Scanner;


/**
 * this class is used to place queen on the chess board 
 * so that no two queen attack each other 
 * Using Backtracking and Recursion 
 * This class uses column wise implementation 
 * This class has createMatrix(), nQueen(), isSafe(), printResult()
 * and main() method.
 * @author yash.porwal_metacube
 *
 */
public class NQueen {
	
	/**
	 * this will create Matrix which is like chess board of the input size
	 * so that we can place queen in this matrix
	 * @param matrixSize is the size of 2-D array
	 * @return solution board of N queens in 2D array (chess Board)
	 * @throws Exception for n<=3
	 */
	public int[][] createMatrix(int matrixSize)throws Exception {
		if(matrixSize <= 3) {
			System.out.println("No Solution exist for N smaller than 3");
			System.exit(0);
//			throw new Exception("No Solution exist for N smaller than 3");
		}
		int board[][]=new int[matrixSize][matrixSize];
		for(int i = 0; i<matrixSize; i++) {
			for( int j = 0; j<matrixSize; j++) {
				board[i][j]=0;
			}
		}
		/*
		 *Boolean  nQueen(int[][] board, int startCol, int matrixSize) {
		 */
		Boolean result = nQueen(board , 0, matrixSize);
		if(result == true) {
			return board;
		}
		else {
			System.out.println("No solution exist for provided dimensions");
			System.exit(-1);
		}
		return null;
	}
	
	/**
	 * Prints the solution(board or Matrix) of N-Queen  
	 * @param board : 2-D array to represent chess board 
	 */
	public static void printResult(int[][] board) {
		for(int i=0; i < board.length; i++) {
			for( int j = 0; j<board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * to check that where we placing queen is safe or not
	 * so that no two queen attack each other.
	 * @param board: 2-D array to represent chess board 
	 * @param row at which we try to place queen
	 * @param col at which we try to place queen
	 * @param matrixSize this is size of chess board (3x3, 4x4 or so on)
	 * @return true if queen is safe to place else false
	 */
	boolean isSafe(int board[][], int row, int col, int matrixSize) {
        int i, j;
        
        // Row (left side) checking for other queens before only
        for (i = 0; i < col; i++) {
        		if (board[row][i] == 1)
        			return false;
        		
        }
        
        // Top Diagonal checking for other queens before only (left side)
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
        		if (board[i][j] == 1)
        			return false;
        		
        }
        
        // Bottom Diagonal checking for other queens before only (left side)
        for (i = row, j = col;i < matrixSize && j >= 0 ; i++, j--) {
        		if (board[i][j] == 1)
        			return false;
        		
        }
 
        return true;
    }
	
	/**
	 * this method is used to looping rows and columns in the chess board
	 * to place queen then 
	 * this method uses isSafe() method to check that queen is safe or not
	 * @param board 2D array representing position of queens
	 * @param startCol Column at which queen has to be placed
	 * @param matrixSize is the size of the chess board (Matrix)
	 * @return boolean value i.e., true if all queens can be placed
	 */
	Boolean  nQueen(int[][] board, int startCol, int matrixSize) {
		//Only possible if all queens are placed
		if(startCol >= matrixSize) {
			return true;
		}
		// this is the row traversal of the Board
		for(int i = 0; i < matrixSize; i++) {

			/*
			* boolean isSafe(int board[][], int row, int col, int matrixSize)
			* Check for possible placement of queen in column
			*/
			if(isSafe(board, i, startCol, matrixSize)) {
				// Placing queen
				board[i][startCol] = 1;
				if(nQueen(board, startCol+1, matrixSize)) {
					return true;
				}
				else {
				//If queen can't be placed safely
					board[i][startCol] = 0; 
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc =new Scanner(System.in);
		NQueen obj=new NQueen();
		System.out.println("Enter the dimension of matrix : ");
		int matrixSize=sc.nextInt();
		int result[][]=obj.createMatrix(matrixSize);
		NQueen.printResult(result);
	}
	
}
