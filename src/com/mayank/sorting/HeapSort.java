package com.mayank.sorting;

public class HeapSort {

	public static void main(String[] args) {
		int arr[]  = {12,11,13,5,6,7};
		printArray(arr);
		HeapSort ob = new HeapSort();
		ob.sort(arr);
		printArray(arr);
		
	}

	public void sort(int[] arr) {
		int length = arr.length;
		for(int i=length/2-1;i>=0;i--){
			heapify(arr,length,i);
		}
		
		 for (int i=length-1; i>=0; i--)
	        {
	            // Move current root to end
	            swap(arr,i,0);
	 
	            // call max heapify on the reduced heap
	            heapify(arr, i, 0);
	        }
		
	}
	
	private void heapify(int[] arr, int length, int i) {
	  int largest = i;
	  int l = 2*i + 1;
	  int r = 2*i + 2;
	  
	  if(l<length && arr[l] > arr[largest]){
		  largest = l;
	  }
	  
      if(r<length && arr[r] > arr[largest]){
		  largest = r;
	  }
      if(largest != i){
    	  swap(arr,i,largest);
    	  heapify(arr,length,largest);
      }
	}

	private void swap(int[] arr, int pivotIndex, int i) {
		int temp = arr[i];
		arr[i] = arr[pivotIndex];
		arr[pivotIndex] = temp;
		
	}

	private static  void printArray(int[] arr){
		for(int x : arr){
			System.out.print(x+" ");
		}
		System.out.println(" ");
	}
}
