package com.mayank.stack;

import java.util.Stack;

public class QueueUsingStackV2 {

		Stack<Integer> stack1;
		Stack<Integer> stack2;
		

		public QueueUsingStackV2(){
			stack1 = new Stack<>();
			stack2 = new Stack<>();
		}
		
		public void enqueue(int num){
			if(stack1.empty()){
				stack1.push(num);
				return;
			}
			
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
			stack1.push(num);
			
			while(!stack2.isEmpty()){
				stack1.push(stack2.pop());
			}
			
		}
		
		public int dequeue() throws EmptyStackException{
		   if(stack1.isEmpty()){
			   throw new EmptyStackException();
		   }
		   System.out.println(stack1.peek());
		   return stack1.pop();
		}
		
		public static void main(String[] args) {
			QueueUsingStackV2 queue = new QueueUsingStackV2();
			queue.enqueue(10);
			queue.enqueue(12);
			queue.enqueue(13);
			queue.enqueue(14);
			queue.enqueue(15);
			try {
				queue.dequeue();
				queue.dequeue();
				queue.dequeue();
				queue.dequeue();
				queue.dequeue();
				queue.dequeue();
				queue.dequeue();
			} catch (EmptyStackException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

}
