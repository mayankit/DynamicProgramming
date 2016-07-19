package com.mayank.heap;

public class MaxHeap {
	
	private int[] Heap;
	private int size;
	private int maxSize;
	
	private static final int FRONT = 1;
	
	public MaxHeap(int maxSize){
		this.maxSize = maxSize;
		this.size =0;
		Heap = new int[this.maxSize + 1];
		Heap[0] = Integer.MAX_VALUE;
	}
	
	public void insert(int element){
		Heap[++size] = element;
		
		int current = size;
		
		while(Heap[current] > Heap[parent(current)]){
			swap(Heap,current,parent(current));
			current = parent(current);
		}
	}

	private void swap(int[] arr, int pivotIndex, int i) {
		int temp = arr[i];
		arr[i] = arr[pivotIndex];
		arr[pivotIndex] = temp;
		
	}
	private int parent(int current) {
		
		return current/2;
	}

}
