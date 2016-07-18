package com.mayank.stack;

import java.util.Stack;

public class QueueUsingStackRecursive {
	
	Stack<Integer> stack;
	
	public QueueUsingStackRecursive(){
		stack = new Stack<>();
	}
	
	public void add(int item){
		stack.push(item);
	}
	
	public int poll() throws EmptyStackException{
	  if(stack.isEmpty()){
		  throw new EmptyStackException();
	  }
	  
	  if(stack.size() == 1){
		  return stack.pop();
	  }
	  
	  int x = stack.pop();
	  int res = this.poll();
	  stack.push(x);
	  return res;
	  
	}
	
	public static void main(String[] args) {
		QueueUsingStackRecursive queue = new QueueUsingStackRecursive();
		queue.add(10);
		queue.add(12);
		queue.add(13);
		queue.add(14);
		queue.add(15);
		
			try {
				System.out.println(queue.poll());
				System.out.println(queue.poll());
				System.out.println(queue.poll());
				System.out.println(queue.poll());
				System.out.println(queue.poll());
				System.out.println(queue.poll());
				System.out.println(queue.poll());
			} catch (EmptyStackException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}

}
