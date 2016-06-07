package com.mayank.dp;

public class FeboNachiTopDown {
	
	public static void main(String[] args) {
		int num = 5;
		System.out.println(findFibo(num));
	}

	private static int findFibo(int num) {
		int[] lookUp = new int[num+1];
		return fibo(lookUp,num);	
	}

	private static int fibo(int[] lookUp, int num) {
		if(lookUp[num] != 0){
			return lookUp[num];
		}
		
		if(num ==0 || num ==1){
			lookUp[num] = 1;
		}
		
		lookUp[num] = fibo(lookUp,num-1) + fibo(lookUp,num-2);
		
		return lookUp[num];
	}

}
