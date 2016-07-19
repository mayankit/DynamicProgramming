package com.mayank.arrays;

import java.util.Stack;

public class StockStackProblem {

	public static void main(String[] args) {
		int price[] = {10,4,5,90,120,80};
		int[] S = new int[price.length];
		calculateSpan(price,S);
		printArray(S);
	}

	
	private static void calculateSpan(int[] price, int[] s) {
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		s[0] = 1;
		int i =1;
		while(i<price.length){
		while(!stack.isEmpty() && price[stack.peek()] <price[i]){
			stack.pop();
		}
		if(stack.isEmpty()){
			s[i] = i+1;
		}else{
			s[i] = i-stack.peek();
		}
		stack.push(i);
		i++;
		}
		
	}


	private static void printArray(int[] arr){
		for(int x : arr){
			System.out.print(x+" ");
		}
		System.out.println(" ");
	}
	
}
