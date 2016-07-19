package com.mayank.arrays;

import java.util.Stack;

public class SurpasserCount {
	
	public static void main(String[] args) {
		SurpasserCount sc  = new SurpasserCount();
		int arr[] = {2,7,5,3,0,8,1};
		int s[] = new int[arr.length];
		sc.findSurpasserCount(arr,s);
		sc.prinArray(s);
	}

	private void findSurpasserCount(int arr[],int[] s) {
		Stack<Integer> stack = new Stack<>();
		int size = arr.length-1;
		s[0] = 0;
		stack.push(size);
		
		int i = size-1;
		
		while(i>=0){
			int count =0;
			while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
				stack.pop();
				count++;
			}
			if(stack.isEmpty()){
				s[i] = size-i;
			}else{
				if(count >0){
				s[i] =stack.peek()-i;
				}else{
					s[i] = stack.peek()-i-1;
				}
			}
			stack.push(i);
			i--;
		}
		
		
	}

	public void prinArray(int[] arr){
		for(int x : arr){
			System.out.println(x+" ");
		}
		System.out.println();
	}
	

}
