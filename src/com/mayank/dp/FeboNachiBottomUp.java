package com.mayank.dp;

public class FeboNachiBottomUp {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(findFibo(num));
	}

	private static int findFibo(int num) {
		int[] lookUp = new int[num+1];
		return fibo(lookUp,num);	
	}
	
	private static int fibo(int[] lookUp, int num) {
		lookUp[0] = 1;
		lookUp[1] = 1;
		
		for(int i=2;i<lookUp.length;i++){
			lookUp[i] = lookUp[i-1] + lookUp[i-2];
		}
		
		return lookUp[num];
	}

}
