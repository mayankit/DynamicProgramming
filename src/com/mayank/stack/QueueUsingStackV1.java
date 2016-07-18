package com.mayank.stack;

import java.util.Stack;

/*
 * Method 2 (By making deQueue operation costly)
In this method, in en-queue operation, the new element is entered at the top of stack1. In de-queue operation, if stack2 is empty then all the elements are moved to stack2 and finally top of stack2 is returned.

enQueue(q,  x)
  1) Push x to stack1 (assuming size of stacks is unlimited).

deQueue(q)
  1) If both stacks are empty then error.
  2) If stack2 is empty
       While stack1 is not empty, push everything from satck1 to stack2.
  3) Pop the element from stack2 and return it.
 * 
 * 
 */

public class QueueUsingStackV1 {
	Stack<Integer> stack1;
	Stack<Integer> stack2;
	

	public QueueUsingStackV1(){
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}
	
	public void enque(int num){
		stack1.push(num);
	}
	
	public int deque() throws EmptyStackException{
		if(!stack2.isEmpty()){
			System.out.println(stack2.peek());
			return stack2.pop();
		}
		
		if(stack1.isEmpty()){
			throw new EmptyStackException();
		}
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		return stack2.pop();
	}
	
	public static void main(String[] args) {
		QueueUsingStackV1 queue = new QueueUsingStackV1();
		queue.enque(10);
		queue.enque(12);
		queue.enque(13);
		queue.enque(14);
		queue.enque(15);
		try {
			queue.deque();
			queue.deque();
			queue.deque();
			queue.deque();
			queue.deque();
			queue.deque();
			queue.deque();
		} catch (EmptyStackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
