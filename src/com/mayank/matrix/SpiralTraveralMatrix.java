package com.mayank.matrix;

public class SpiralTraveralMatrix {
	
public static void main(String[] args) {
		
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printSpiral(arr);
	}

	private static void printSpiral(int[][] arr) {
		int rowEnd = arr.length;
		int colEnd = arr[0].length;

		int i=0;
		int rowStart=0;
		int colStart=0;
        
		
		//print columns starting from left to right
	   while(rowStart <rowEnd &&  colStart < colEnd){
			for(i=colStart;i<colEnd;i++){
				System.out.println(arr[rowStart][i]);
			}
			rowStart++; // next time we will start from second row ie index 1;
	        
			
			for(i = rowStart;i<rowEnd;i++){
				System.out.println(arr[i][colEnd-1]);
			}
			colEnd--; // next time no of columns decreases
			
			if(colStart < colEnd){
			for(i=colEnd-1;i>=colStart;i--){
				System.out.println(arr[rowEnd-1][i]);
			}
			rowEnd--; // next time no of rows decreases
			}
			
			if(rowStart<rowEnd){
			for(i=rowEnd-1;i>=rowStart;i--){
				System.out.println(arr[i][colStart]);
			}
			colStart++; // next time we have to start from second column
			}
	   }
	}

}
