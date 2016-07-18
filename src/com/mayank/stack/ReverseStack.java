package com.mayank.stack;

import java.util.Stack;

public class ReverseStack {
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		ReverseStack  res = new ReverseStack();
		System.out.println(st);
		res.reverse(st);
		System.out.println(st);
	}

	private void reverse(Stack<Integer> st) {
		if(st.isEmpty()){
			return;
		}
		int bottom  = popBottom(st);
		reverse(st);
		st.push(bottom);
		
	}

	private int popBottom(Stack<Integer> st) {
		int top = st.pop();
		
		if(st.isEmpty()){
			return top;
		}else{
			int bottom  = popBottom(st);
			st.push(top);
			return bottom;
		}
		
	}

	
	

}
