package com.mayank.sorting;

public class QuickSort {

	public static void main(String[] args) {
        int arr[] = {10,3,20,4,30,50,4,60};
		printArray(arr);
		quickSort(arr,0,arr.length-1);
		printArray(arr);
	}
	
	private static void quickSort(int[] arr, int low, int high) {
		if(low < high){
			int p = partition(arr,low,high);
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int pivotIndex = low;
		for(int i=low+1;i<=high;i++){
			if(arr[i] <= pivot){
				swap(arr,i,pivotIndex);
				pivotIndex++;
			}
		}
		arr[pivotIndex] = pivot;
		printArray(arr);
		return pivotIndex;
	}

	private static void swap(int[] arr, int pivotIndex, int i) {
		int temp = arr[i];
		arr[i] = arr[pivotIndex];
		arr[pivotIndex] = temp;
		
	}

	private static void printArray(int[] arr){
		for(int x : arr){
			System.out.print(x+" ");
		}
		System.out.println(" ");
	}

}
