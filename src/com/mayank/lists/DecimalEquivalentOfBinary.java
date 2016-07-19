package com.mayank.lists;

public class DecimalEquivalentOfBinary {
	
	private Node root;
	
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
	
	public void printList(){
		while(root != null){
			System.out.print(root.data +" ");
			root = root.next;
		}
	}
	
	public static void main(String[] args) {
		DecimalEquivalentOfBinary list = new DecimalEquivalentOfBinary();
		list.addNodeTail(0);
		list.addNodeTail(0);
		list.addNodeTail(0);
		list.addNodeTail(1);
		list.addNodeTail(1);
		list.addNodeTail(0);
		list.addNodeTail(0);
		list.addNodeTail(1);
		list.addNodeTail(0);
		//list.printList();
		System.out.println(list.decimalEquivalent());
	}
	
	public int decimalEquivalent(){
		Node root = this.root;
		return decimalEquivalent(root);
	}

	private int decimalEquivalent(Node root) {
		int res = 0;
		
		while(root !=null){
			res = res * 2 + root.data;
			root = root.next;
		}
		return res;
	}

}
