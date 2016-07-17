package com.mayank.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {64,40,12,22,11};
		
		int sortedArr[]  = selectionSort(arr);
		for(int x : sortedArr){
			System.out.print(x+" ");
		}
	}

	private static int[] selectionSort(int[] arr) {
		for(int i=0;i< arr.length;i++){
			
			int minIndex = i;
			for(int j=i+1;j< arr.length;j++){
				
				if(arr[j] < arr[minIndex] ){
					minIndex = j;
				}
			}
			swap(i,minIndex,arr);
		}
		return arr;
	}

	private static void swap(int i, int minIndex, int[] arr) {
		int temp = arr[minIndex];
		arr[minIndex] = arr[i];
		arr[i] = temp;
	}

}
