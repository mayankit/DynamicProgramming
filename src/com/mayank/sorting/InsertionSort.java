package com.mayank.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int arr1[] = {30,32,40,2,5,3,9,6,20,21,34,22};
		int arr2[] = {30,32,40,2,5,3,9,6,20,21,34,22};
		printArray(arr1);
		long startTime = System.nanoTime();
		insertionSort(arr1);
		long endTime = System.nanoTime();
		System.out.println("Time taken using swap "+(endTime-startTime));
		printArray(arr1);
		startTime = System.nanoTime();
		insertitionSortWithoutSwap(arr2);
		endTime = System.nanoTime();
		System.out.println("Time taken without swap "+(endTime-startTime));
		printArray(arr2);
	}

	private static void insertitionSortWithoutSwap(int[] arr) {
		
		for(int i=1;i<arr.length;i++){
			int x = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > x){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = x;
		}
	}

	private static void insertionSort(int[] arr) {
	
		for(int i=1;i<arr.length;i++){
			int j = i;
			
			while(j>0 && arr[j] < arr[j-1]){
			    swap(arr,j,j-1);
				j--;
			}
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
