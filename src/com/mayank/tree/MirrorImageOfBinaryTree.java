package com.mayank.tree;

public class MirrorImageOfBinaryTree {
	
	 Node root;
	
	 public static void main(String args[]) {
	        /* creating a binary tree and entering the nodes */
		 MirrorImageOfBinaryTree tree = new MirrorImageOfBinaryTree();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	       /* print inorder traversal of the input tree */
	        System.out.println("Inorder traversal of input tree is :");
	        tree.inOrder(tree.root);
	        System.out.println("");
	      
	 
	        /* convert tree to its mirror */
	        tree.mirror();
	        
	        /* print inorder traversal of the minor tree */
	        System.out.println("Inorder traversal of binary tree is : ");
	        tree.inOrder(tree.root);

	 
	    }
	
	
	private void mirror() {
		mirror(root);
		
	}


	private void mirror(Node root) {
		if(root == null){
			return;
		}
		
		Node node = root.left;
		root.left = root.right;
		root.right = node;
		if(root.left != null){
			mirror(root.left);
		}
		
		if(root.right != null){
			mirror(root.right);
		}
		
	}
	
	private void inOrder(Node root){
		if(root == null){
			return;
		}
		if(root.left != null){
			inOrder(root.left);
		}
		System.out.println(root.data);
		if(root.right != null){
			inOrder(root.right);
		}
	}


	private static class Node {
		 
	    int data;
	    Node left, right;
	 
	    public Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}

}
