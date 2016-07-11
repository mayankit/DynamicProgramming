package com.mayank.tree;


public class ConstructTreeWhenPreOrderAndInorderGiven {
	private static int index = 0;
	public static void main(String[] args) {
		
		char[] inOrderArray = {'D','B','E','A','F','C'};
		char[] preOrderArray = {'A','B','D','E','C','F'};
		
		Node root = createTree(inOrderArray,preOrderArray,0,inOrderArray.length-1);
		inorder(root);
	}
	
	
	
	private static Node createTree(char[] inOrderArray, char[] preOrderArray, int start, int end) {
		
		Node node = null;
		if(start > end){
			return node;
		}
		
		node = new Node(preOrderArray[index]);
		index++;
		
		if(start == end){
			return node;
		}
		
		
		int inOrderIndex = findInOrderIndex(inOrderArray,start,end,node.data);
		node.left = createTree(inOrderArray,preOrderArray,start,inOrderIndex-1);
		node.right = createTree(inOrderArray,preOrderArray,inOrderIndex+1,end);
		
		return node;
	}

	private static void inorder(Node root) {
		if(root.left != null){
			inorder(root.left);
		}
		System.out.print(root.data+" ");
		if(root.right != null){
			inorder(root.right);
		}
	}


	private static int findInOrderIndex(char[] inOrderArray, int start, int end, int data) {
		for(int i=start;i<=end;i++){
			if(inOrderArray[i] == data){
				return i;
			}
		}
		return 0;
	}



	private static class Node{
		char data;
		Node left,right;
		public Node(char data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
		
	}

}
