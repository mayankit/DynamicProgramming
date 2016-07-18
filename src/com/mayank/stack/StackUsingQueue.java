package com.mayank.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> queue;
	
	public StackUsingQueue(){
		this.queue = new LinkedList<>();
	}

	public void push(int num){
		int s = queue.size();
		
		queue.add(num);
		
		for(int i = 0;i<s;i++){
			queue.add(queue.peek());
			queue.poll();
		}
	}
	
	public void pop(){
		if(queue.isEmpty()){
			System.out.println("No element");
		}else{
			queue.poll();
		}
	}
	
	public static void main(String[] args) {
		StackUsingQueue q = new StackUsingQueue();
		q.push(10);
		q.push(20);
		q.push(30);
		q.pop();
	}
}
