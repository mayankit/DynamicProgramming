package com.mayank.tree;

public class FindKthsmallestElementInBST {
	
	/* There are two approaches to solve this problem
	 * *****************************************************************
	 * Solution 1
	 * ---------------------------------------------------------------------
	 * Do inorder traversal and then find the k-1 element
	 * in inorder array.
	 * time complexity of this solution is O(n) as we have to do
	 * full tree traversing.
	 * --------------------------------------------------------------------- 
	 * 
	 * *******************************************************************
	 * Solution 2
	 * -----------------------------------------------------------------------
	 * 2) We will create Augment BST
	 * We will augment the binary search tree by storing the weight of left 
	 * subtree rooted at a node. So any node will keep an extra count which
	 * is equal to the number of nodes in its left subtree.
	 * This augmentation is called order statistics tree.
	 * With the help of this augmentation we can find the kth smallest element
	 * in O(log n) expected complexity for a balanced binary search tree.
	 *  
	 * Suppose we try to find the 6th smallest element, we start at root.
	 * If root has leftWeight value 3, that means there are only 3 elements
	 * that are smaller than root. So 6th smallest element cannot be on the 
	 * left side of root. So we try to find the element in right subtree. 
	 * While going to right subtree we now try to find 6-4=2nd smallest 
	 * element, because we already had 3 smaller element in root's left subtree 
	 * and root itself is smaller than the right subtree. 
	 * So we call the recursive function on root.right. 
	 * If the value of k is less than the leftWeight then we just go to the 
	 * left subtree with the value k.
	 */
	
	private Node root;
	
	private static class Node{
		int  value;
		Node left;
		Node right;
		int leftWeight;
		public Node(int value) {
			super();
			this.value = value;
			this.left = this.right = null;
		}
		@Override
		public String toString() {
			return "Node [value=" + value + ", left=" + left + ", right=" + right + ", leftWeight=" + leftWeight + "]";
		}
			
	}
	
	public static void main(String[] args) {
		FindKthsmallestElementInBST bst = new FindKthsmallestElementInBST();
		int[] arr = {12,4,5,6,2,7,8,11,2,3};
		for(int num:arr){
			bst.addNode(num);
		}
		
		System.out.println(bst.getOrdered(5));
	}

	public void addNode(int value) {
		Node root = this.root;
		addNode(value,root);
		
	}
	
	
	
	@Override
	public String toString() {
		return ""+root;
	}

	private void addNode(int value,Node root){
		Node node  = new Node(value);
		
		if(root == null){
			this.root = node;
			return;
		}
		
		if(root.value > value){
			//it will be inserted into left sub tree
			if(root.left == null){
				root.leftWeight = 1;
				root.left = node;
			}else{
				root.leftWeight = root.leftWeight + 1;
				addNode(value,root.left);
			}
		}else{
			//it will be inserted in right sub tree
			if(root.right == null){
				root.right = node;
			}else{
				addNode(value,root.right);
			}
		}
	}
	
	public int getOrdered(int kthElement){
		return getOrdered(kthElement,this.root).value;
	}

	private Node getOrdered(int kthElement, Node root) {
		
		if(root == null){
			return null;
		}
		
		if(kthElement < root.leftWeight){
			return getOrdered(kthElement,root.left);
		}else if(kthElement > root.leftWeight){
			return getOrdered(kthElement-root.leftWeight-1,root.right);
		}else{
			return root;
		}
	}
	
	
}
