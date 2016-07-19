package com.mayank.heap;

import java.util.Arrays;

public class Heap {
	
	private static final int CHILDS = 2;
	private static int DEFAULT_HEAP_SIZE = 10;
	
	private int heapSize;
	private int[] heap;
	
	public Heap(){
		heap = new int[DEFAULT_HEAP_SIZE +1];
		this.heapSize = 0;
	}
	
	public boolean isEmpty(){
		return this.heapSize == 0;
	}
	
	public boolean isFull(){
		return heapSize == heap.length;
	}
	
	public void reSize(){
		heap = Arrays.copyOf(heap, heap.length * 2);
	}
	
	public void insert(int element){
		if(isFull()){
			reSize();
		}
		heap[heapSize] = element;
		heapSize++;
		heapifyUp(heapSize-1);
		
	}
	
	private void heapifyUp(int childIndex){
		int temp = heap[childIndex];
		
		while(childIndex > 0 && temp > heap[parent(childIndex)]){
			heap[childIndex] = heap[parent(childIndex)];
			childIndex = parent(childIndex);
		}
		heap[childIndex] = temp;
	}

	private void swap(int[] arr, int childInd, int parent) {
		int temp = arr[childInd];
		arr[childInd] = parent;
		parent = temp;
	}

	private int parent(int childInd) {
		
		return (childInd)/2;
	}
	
	public void prinHeap(){
		for(int x : heap){
			System.out.println(x+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {12,13,8,6,5};
		Heap heap = new Heap();
		for(int x:arr){
			heap.insert(x);
		}
		heap.prinHeap();
	}

}
