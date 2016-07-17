package com.mayank.matrix;

public class MaximumSizeSquareSubMatrixAllOne {

	/*
	 * Given a binary matrix, find out the maximum size square sub-matrix with
	 * all 1s.
	 * 
	 * For example, consider the below binary matrix.
	 * 
	 * 
	 * 0 1 1 0 1 1 1 0 1 0 0 1 1 1 0 1 1 1 1 0 1 1 1 1 1 0 0 0 0 0
	 * 
	 * The maximum square sub-matrix with all set bits is
	 * 
	 * 1 1 1 1 1 1 1 1 1
	 */

	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0 }, { 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 0 },
				{ 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 } };

		printMaxSubSquare(matrix);
	}

	private static void printMaxSubSquare(int[][] matrix) {

		int[][] S = new int[matrix.length][matrix[0].length];

		// fill row 1 as it is
		for (int i = 0; i < matrix[0].length; i++) {
			S[0][i] = matrix[0][i];
		}

		// fill column 1 as it is
		for (int i = 0; i < matrix.length; i++) {
			S[i][0] = matrix[i][0];
		}

		for (int i = 1; i < matrix.length; i++) {
             for(int j=1;j<matrix[0].length;j++){
            	 if(matrix[i][j] == 1){
            	 S[i][j] = findMin(S[i-1][j-1],S[i-1][j],S[i][j-1]) + 1;
            	 }
             }
		}
		System.out.println(S);
		int max = 0;
		int aux_row = 0;
		int aux_col = 0;
		for(int i=0;i<S.length;i++){
			for(int j=0;j<S[0].length;j++){
				if(S[i][j] > max){
					max = S[i][j];
					aux_row = i;
					aux_col = j;
				}
			}
		}
		System.out.println("max :"+max+" cordinate("+aux_row+","+aux_col+")");
		int square[][] = new int[max][max];
		for(int i=0;i< max;i++){
			for(int j=0;j< max;j++){
				square[i][j] = 1;
			}
		}
		printArray(square);
	}

	private static int findMin(int i, int j, int k) {
		if(i<j){
			if(i<k)
				return i;
			else
				return k;
		}else{
			if(j<k)
				return j;
			else
				return k;
		}
	}
	
	private static void printArray(int[][] array){
		System.out.println("");
		System.out.println("------------------------------");
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[0].length;j++){
				
				System.out.print(array[i][j] +" ");
			}
			System.out.println("");
		}
		System.out.println("------------------------------");
		System.out.println("");
	}

}
