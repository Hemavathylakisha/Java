package PracticePackage;

public class TwoDandJaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TwoD
		 int[][] matrix = {
		            {1, 2, 3},
		            {4, 5, 6}
		        };

		        for (int i = 0; i < matrix.length; i++) {
		            for (int j = 0; j < matrix[i].length; j++) {
		                System.out.print(matrix[i][j] + " ");
		            }
		            System.out.println();
		        }
		        
		 //Jagged
		        int[][] jagged = {
		                {1, 2},
		                {3, 4, 5},
		                {6}
		            };

		            for (int[] row : jagged) {
		                for (int elem : row) {
		                    System.out.print(elem + " ");
		                }
		                System.out.println();
		            }
	}

}
