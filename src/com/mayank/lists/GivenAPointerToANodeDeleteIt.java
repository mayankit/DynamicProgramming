package com.mayank.lists;

public class GivenAPointerToANodeDeleteIt {
	
	Node head;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    void deleteNode(Node node) {
        Node temp = node.next;
        node.data = temp.data;
        node.next = temp.next;
        System.gc();
 
    }
 
    // Driver program to test above functions
    public static void main(String[] args) {
    	GivenAPointerToANodeDeleteIt list = new GivenAPointerToANodeDeleteIt();
        list.head = new Node(1);
        list.head.next = new Node(12);
        list.head.next.next = new Node(1);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(1);
 
        System.out.println("Before Deleting ");
        list.printList(list.head);
 
        /* I m deleting the head itself.
         You can check for more cases */
        list.deleteNode(list.head.next.next);
        System.out.println("");
        System.out.println("After deleting ");
        list.printList(list.head);
    }

}
