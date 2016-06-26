package com.mayank.arrays;

public class ReplaceEveryElementByGreatestOnRightSide {
	
	public static void main(String[] args) {
		int arr[] = {16,17,4,3,5,2};
		
	    getGreatestRight(arr);
	    
	    for(int x : arr){
	    	System.out.println(x);
	    }
	}

	private static int[] getGreatestRight(int[] arr) {
		
		int max = arr[arr.length-1];
		arr[arr.length-1] = -1;
		
		for(int i=arr.length-2;i>=0;i--){
			int temp = arr[i];
			
			arr[i] = max;
			if(max <  temp ){
				max = temp;
			}
		}
		
		return arr;
	}

}
