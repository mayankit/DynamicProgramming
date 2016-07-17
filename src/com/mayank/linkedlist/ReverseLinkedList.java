package com.mayank.linkedlist;

public class ReverseLinkedList {

	static Node head;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
         
        System.out.println("Original Linked list is :");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list : ");
        list.printList(head);
    }

	private Node reverse(Node root) {
		if(root == null){
			return null;
		}
		Node previous  = null;
		Node current  = root;
		Node next = null;
		while(current !=null){
			 next = current.next;
			 current.next = previous;
			 previous = current;
			 current = next;
		}
		root = previous;
		return root;
	}

	private void printList(Node node) {
		while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
		
	}
}
