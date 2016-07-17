package com.mayank.sorting;

public class BubbleSort {
	public static void main(String[] args) {
        int arr[] = {5,1,4,2,8};
		
		int sortedArr[]  = bubbleSort(arr);
		
	}

	private static int[] bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++){
			boolean flag = false;
			for(int j=1;j<arr.length;j++){
				if(arr[j]< arr[j-1]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
				
			}
			if(!flag){
				break;
			}
			printArray(arr);
		}
		return arr;
	}
	
	private static void printArray(int[] arr){
		for(int x : arr){
			System.out.print(x+" ");
		}
		System.out.println(" ");
	}

}
