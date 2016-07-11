package com.mayank.lists;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void addNodeTailTest() {
		LinkedList list = new LinkedList();
		list.addNodeTail(5);
		list.addNodeTail(6);
		list.addNodeTail(7);
		list.addNodeTail(8);
		list.addNodeTail(9);
		assertTrue(("5 6 7 8 9 ").equals(list.getList()));
	}

	@Test
	public void addNodeHeadTest() {
		LinkedList list = new LinkedList();
		list.addNodeHead(5);
		list.addNodeHead(6);
		list.addNodeHead(7);
		list.addNodeHead(8);
		list.addNodeHead(9);
		assertTrue(("9 8 7 6 5 ").equals(list.getList()));
	}
	
	@Test
	public void addNodeTest() {
		LinkedList list = new LinkedList();
		list.addNodeHead(5);
		list.addNodeHead(6);
		list.addNodeHead(7);
		list.addNodeHead(8);
		list.addNodeHead(9);
		list.addNode(1,0);
		list.addNode(2,3);
		list.addNode(3,1);
		assertTrue(("1 3 9 8 2 7 6 5 ").equals(list.getList()));
	}
	
	@Test
	public void deleteNodeTest() {
		LinkedList list = new LinkedList();
		list.addNodeTail(1);
		list.addNodeTail(2);
		list.addNodeTail(3);
		list.addNodeTail(4);
		list.addNodeTail(5);
		list.addNodeTail(6);
		list.addNodeTail(7);
		list.addNodeTail(8);
		list.addNodeTail(9);
		list.deleteNode(0);
		list.deleteNode(3);
		list.deleteNode(1);
		assertTrue(("2 4 6 7 8 9 ").equals(list.getList()));
	}
	
	@Test
	public void getReverseStringTest() {
		LinkedList list = new LinkedList();
		list.addNodeTail(1);
		list.addNodeTail(2);
		list.addNodeTail(3);
		list.addNodeTail(4);
		list.addNodeTail(5);
		list.addNodeTail(6);
		list.addNodeTail(7);
		list.addNodeTail(8);
		list.addNodeTail(9);
		
		list.printReverseString();
	}
	
	@Test
	public void reverseLinkedListTest() {
		LinkedList list = new LinkedList();
		list.addNodeTail(1);
		list.addNodeTail(2);
		list.addNodeTail(3);
		list.addNodeTail(4);
		list.addNodeTail(5);
		list.addNodeTail(6);
		list.addNodeTail(7);
		list.addNodeTail(8);
		list.addNodeTail(9);
		
		list.reverseLinkedList();
		assertTrue(("9 8 7 6 5 4 3 2 1 ").equals(list.getList()));
	}
	
	@Test
	public void mergeTwoSortedLists() {
		LinkedList list1 = new LinkedList();
		list1.addNodeTail(1);
		list1.addNodeTail(3);
		list1.addNodeTail(5);
		list1.addNodeTail(7);
		list1.addNodeTail(9);
		
		LinkedList list2 = new LinkedList();
		list2.addNodeTail(2);
		list2.addNodeTail(4);
		list2.addNodeTail(8);
		list2.addNodeTail(15);
		list2.addNodeTail(18);
		
		Node node = LinkedList.mergeTwoSortedLists(list1.getRoot(), list2.getRoot());
		assertTrue(("1 2 3 4 5 7 8 9 15 18 ").equals(LinkedList.getList(node)));
	}


}
