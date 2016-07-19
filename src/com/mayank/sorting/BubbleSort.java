package com.mayank.sorting;

public class BubbleSort {
	public static void main(String[] args) {
        int arr[] = {5,1,4,2,8};
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
	}

	private static void bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++){
			System.out.println("Pass No:"+(i+1));
			boolean flag = false;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j] < arr[j-1]){
					swap(arr,j,j-1);
					flag = true;
				}
				
				printArray(arr);
			}
			if(!flag){
				break;
			}
		}
		
	}
	
	private static void swap(int[] arr, int j, int i) {
	    int temp = arr[j];
	    arr[j]= arr[i];
	    arr[i] = temp;
	}
	
	private static void printArray(int[] arr){
		for(int x : arr){
			System.out.print(x+" ");
		}
		System.out.println(" ");
	}

}
