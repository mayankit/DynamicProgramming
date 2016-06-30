package com.mayank.lists;

import com.sun.javafx.geom.Rectangle;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.scenario.effect.impl.state.LinearConvolveKernel;
import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;

public class LinkedList {
	
	//keeping reference of root node
	private Node root;
	
	public Node addNode(int num){
		
		Node node = new Node(num);
		if(root == null){
		   this.root = node;
		   return node;
		}
		
		Node temp = root;
		while(temp.next != null){
			temp = temp.next;
		}
		
		temp.next = node;
		return root;
		
	}
	
	
	
	
	public static void main(String[] args) {
		LinkedList  list = new LinkedList();
		list.addNode(5);
		list.addNode(6);
		list.addNode(7);
		Node root = list.addNode(8);
	}

}
