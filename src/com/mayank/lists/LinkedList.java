package com.mayank.lists;

import com.sun.javafx.geom.Rectangle;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.scenario.effect.impl.state.LinearConvolveKernel;
import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;

public class LinkedList {

	// keeping reference of root node
	private Node root;
	
	public Node getRoot() {
		return root;
	}

	//It will print the List
	public void printList(){
		while(root != null){
			System.out.print(root.data +" ");
			root = root.next;
		}
	}
	
	public String getList(){
		StringBuilder sb = new StringBuilder();
		while(root != null){
			sb.append(root.data+" ");
			root = root.next;
		}
		return sb.toString();
	}
	
	public static String getList(Node node){
		StringBuilder sb = new StringBuilder();
		while(node != null){
			sb.append(node.data+" ");
			node = node.next;
		}
		return sb.toString();
	}
	
	public void  printReverseString(){
		Node current = root;
		
		if(root.next != null){
			root = root.next;
			printReverseString();
		}
		System.out.print(current.data+" ");
		
	}
	
	
	public Node reverseLinkedList(){
		if(root == null)
			return null;
		
		Node current = root;
		Node next = null;
		Node previous = null;
		
		while(current != null){
			next  = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		root = previous;
		return root;
		
	}
	/*It is a method that will always add node in 
	 * the tail of linked list
	 * 
	 */
	public Node addNodeTail(int num) {

		Node node = new Node(num);
		if (root == null) {
			this.root = node;
			return node;
		}

		Node temp = root;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = node;
		return root;

	}

	/*It is a method that will always add node in 
	 * the Head of linked list
	 * 
	 */
	public Node addNodeHead(int num) {

		Node node = new Node(num);
		if (root == null) {
			this.root = node;
			return node;
		}

		node.next = root;
		this.root = node;
		return node;

	}

	/*It is a method that will always add node at a particular position
	 * 1---------2--------3---------4----------5------------6
	 * pos0     pos1      pos2      pos3       pos4         pos5
	 */
	public Node addNode(int num, int pos) {
		if(pos < 0){
			return null;
		}
		
		Node node = new Node(num);
		if(root == null){
			this.root = node;
			return node;
		}
		
		Node rootNode = root;
		Node previous = null;
		Node current = root;
		
		while(pos >0){
			previous = current;
			current = current.next;
			pos--;
		}
		
		if(previous == null){
			node.next = current;
			this.root = node;
			return node;
		}
		
		previous.next = node;
		node.next = current;
		
		return rootNode;
	}
	
	/*It is a method that will always add node at a particular position
	 * 1---------2--------3---------4----------5------------6
	 * pos0     pos1      pos2      pos3       pos4         pos5
	 */
	public Node deleteNode(int pos) {
		if(pos < 0 || root==null){
			return null;
		}
		
		Node previous = null;
		Node current  =  root;
		
		while( pos >0){
			previous = current;
			current = current.next;
			pos--;
		}
		
		if(previous == null){
			this.root = current.next;
			current.next = null;
			return root;
		}
		
	    previous.next = current.next;
	    current.next = null;
		
		return root;
	}
	
	public static Node mergeTwoSortedLists(Node headA, Node headB) {
	    Node node = null;

	    if(headA == null && headB != null){
	        return headB;
	    } 
	    
	    if(headB == null && headA != null){
	        return headA;
	    } 
	    
	    if(headA.data > headB.data){
	            node = headB;
	            headB = headB.next;
	            node.next = mergeTwoSortedLists(headA,headB);    
	    }else{
	            node = headA;
	            headA = headA.next;
	            node.next = mergeTwoSortedLists(headA,headB);  
	    }
	    return node;
	}
	
	public int getNthNodefromLast(int position){
		Node ref = root;
		Node main = root;
		
		while(position >=0){
			ref = ref.next;
			position--;
		}
		
		while(ref != null){
			ref = ref.next;
			main = main.next;
		}
		
		return main.data;
	}
	
	public boolean cycleDetection(Node root){
		Node slow_pointer  = root;
		Node fast_pointer = root;
		
		while(slow_pointer != null && fast_pointer!=null && fast_pointer.next != null){
			slow_pointer = slow_pointer.next;
			fast_pointer = fast_pointer.next.next;
			
			if(slow_pointer == fast_pointer){
				return true;
			}
		}
		
		return false;
	}

	

}
