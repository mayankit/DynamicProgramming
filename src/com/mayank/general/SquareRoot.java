package com.mayank.general;

public class SquareRoot {
	public static void main(String[] args) {
		System.out.println(squareRoot(5));
	}

	//babylonian method
	private static float squareRoot(int i) {
		// TODO Auto-generated method stub
		
		float end = i;
		float start = 1;
		float precision = 0.000001f;
		
		while((end-start) > precision){
			end = (end + start)/2;
			start = i/end;
		}
		return end;
	}
	
	
	
	

}
