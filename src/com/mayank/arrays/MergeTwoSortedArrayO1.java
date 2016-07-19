package com.mayank.arrays;

public class MergeTwoSortedArrayO1 {
	public static void main(String[] args) {
	  int[] arr1 = {1,5,9,10,15,20};
	  int[] arr2 ={2,3,8,13};
	  
	  mergeArray(arr1,arr2);
	  printArray(arr1);
	  printArray(arr2);
	}

	private static void printArray(int[] arr) {
		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
			if(i != arr.length-1){
			System.out.print(" ,");
			}
		}
		System.out.println("}");
	}

	private static void mergeArray(int[] arr1, int[] arr2) {
		
		for(int i=arr2.length-1;i>=0;i--){
			int last = arr1[arr1.length-1];
			int j = arr1.length-2;
			
			for(;j>=0 && arr1[j] > arr2[i];j--){
				arr1[j+1] = arr1[j];
			}
			
				arr1[j+1] = arr2[i];
				arr2[i] = last;
					
		}
	}

}
