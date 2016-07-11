package com.mayank.tree;
public class ConstructTreeWhenPostOrderAndInOrderGiven {
	
	private static int index = 0;
	public static void main(String[] args) {
		
		int [] inOrder = {4,8,2,5,1,6,3,7};
		int [] postOrder = {8,4,5,2,6,7,3,1};
		index = inOrder.length-1;
		Node<Integer> root = createTree(inOrder,postOrder,0,postOrder.length-1);
		inorder(root);
	}
	
	private static Node<Integer> createTree(int[] inOrder, int[] postOrder, int start, int end) {
        Node<Integer> node  = null;
		if(start > end){
			return node;
		}
		
		node = new Node<Integer>(postOrder[index]);
		index--;
		
		if(start == end){
			return node;
		}
		
		int inOrderIndex = findIndex(inOrder,start,end,node.data);
		
		node.right =  createTree(inOrder,postOrder,inOrderIndex+1,end);
		node.left =  createTree(inOrder,postOrder,start,inOrderIndex-1);
	
		return node;
	}

	private static int findIndex(int[] inOrder, int start, int end, Integer data) {
		
		for(int i=start;i<=end;i++){
			if(inOrder[i] == data){
				return i;
			}
		}
		return 0;
	}


	private static void inorder(Node<?> root) {
		if(root.left != null){
			inorder(root.left);
		}
		System.out.print(root.data+" ");
		if(root.right != null){
			inorder(root.right);
		}
	}
	
	private static class Node<T>{
		T data;
		Node<T> left,right;
		public Node(T data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
		}

}}
	
