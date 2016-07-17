package com.mayank.sorting;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {2,6,8,10,15,24,35,40,50};
		int index = binarySearch(arr,38);
		System.out.println(index);
	}

	private static int binarySearch(int[] arr,int num) {
		return binarySearch(arr,num,0,arr.length);
	}

	private static int binarySearch(int[] arr,int num, int start, int end) {
		if(start < end){
		int mid =   (start +end)/2;
		if(arr[mid] == num){
			return mid;
		}
		if(arr[mid] > num){
			return binarySearch(arr,num,start,mid-1);
		}else{
			return binarySearch(arr,num,mid+1,end);
		}}
		else{
			return -1;
		}
	}

}
