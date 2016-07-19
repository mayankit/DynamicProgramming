package com.mayank.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {64,25,12,22,11};
		
		printArray(arr);
		selectionSort(arr);
	}

	private static void selectionSort(int[] arr) {
		for(int i=0;i< arr.length;i++){
			
			int minIndex = i;
			for(int j=i+1;j< arr.length;j++){
				
				if(arr[j] < arr[minIndex] ){
					minIndex = j;
				}
			}
			swap(arr,i,minIndex);
			printArray(arr);
		}
	}

	private static void swap(int[] arr, int j, int i) {
	    int temp = arr[j];
	    arr[j]= arr[i];
	    arr[i] = temp;
	}

	private static void printArray(int[] arr) {
		for(int x : arr){
			System.out.print(x+" ");
		}
		System.out.println();
		
	}

}
