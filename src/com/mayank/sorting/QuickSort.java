package com.mayank.sorting;

public class QuickSort {

	public static void main(String[] args) {
        int arr[] = {5,1,4,2,8};
		printArray(arr);
		quickSort(arr,0,arr.length-1);
		printArray(arr);
	}
	
	private static void quickSort(int[] arr,int low,int high) {
		if(low < high){
			int p = partition(arr,low,high);
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);
		}
		
	}

	

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int pivotIndex = low;
		
		for(int i=1;i<=high;i++){
			if(arr[i]<pivot){
				swap(arr,i,pivotIndex);
				pivotIndex++;
			}
		}
		return pivotIndex;
	}

	private static void swap(int[] arr, int i, int j) {
		int x = arr[i];
		arr[i] = arr[j];
		arr[j] = x;
		
	}

	private static void printArray(int[] arr){
		for(int x : arr){
			System.out.print(x+" ");
		}
		System.out.println(" ");
	}

}
