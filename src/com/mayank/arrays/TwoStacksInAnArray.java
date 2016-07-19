package com.mayank.arrays;

public class TwoStacksInAnArray {
    int size;
    int top1,top2;
    int arr[];
    
    TwoStacksInAnArray(int n){
    	this.size = n;
    	this.arr = new int[n];
    	this.top1 = -1;
    	this.top2 = size;
    }
    
    public void push1(int x){
    	if(top1 < top2-1){
    		top1++;
    		arr[top1] = x;
    	}else{
    		System.out.println("StackOverFlow");
    		System.exit(1);
    	}
    }
    public void push2(int x){
    	if(top1 < top2-1){
    		top2--;
    		arr[top2] = x;
    	}else{
    		System.out.println("StackOverFlow");
    		System.exit(1);
    	}
    }
    
 // Method to pop an element from first stack
    int pop1()
    {
        if (top1 >= 0)
        {
            int x = arr[top1];
            top1--;
            return x;
        }
        else
        {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
 
    // Method to pop an element from second stack
    int pop2()
    {
        if(top2 < size)
        {
            int x =arr[top2];
            top2++;
            return x;
        }
        else
        {
            System.out.println("Stack Underflow");
            System.exit(1);
 
        }
        return 0;
    }
 
    // Driver program to test twoStack class
    public static void main(String args[])
    {
    	TwoStacksInAnArray ts = new TwoStacksInAnArray(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from" +
                           " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from" +
                         " stack2 is " + ts.pop2());
    }
    
}
