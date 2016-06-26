package com.mayank.tree;


public class BoundayTraversalTree {
	

	 Node root;
	
	 public static void main(String args[]) {
	        /* creating a binary tree and entering the nodes */
		 BoundayTraversalTree tree = new BoundayTraversalTree();
		 tree.root = new Node(20);
	        tree.root.left = new Node(8);
	        tree.root.left.right = new Node(6);
	        tree.root.left.right.left = new Node(7);
	        tree.root.left.right.left.right = new Node(5);
	        tree.root.left.right.left.right.left = new Node(4);
	        tree.root.left.right.left.right.right = new Node(3);
	        
	        tree.root.right = new Node(2);
	        tree.root.right.left = new  Node(1);
	        tree.root.right.right = new  Node(6);
	        tree.root.right.right.left = new  Node(8);
	        tree.root.right.right.left.left = new Node(7);
	        tree.root.right.right.left.left.right = new Node(5);
	        tree.printBoundary(tree.root);
	    }
	 

		
		

		private void printBoundary(Node node) {
		 if(node == null)
			 return;
		 System.out.println(node.data);
		 
		 printBoundaryLeft(node.left);
		 printBoundaryRight(node.right);
		
	    }





		private void printBoundaryLeft(Node node) {
			if(node != null){
				if(node.left != null){
					System.out.println(node.data);
					printBoundaryLeft(node.left);
				}else if(node.right !=null){
					System.out.println(node.data);
					printBoundaryLeft(node.right);
				}
			}
			
		}
		
		private void printBoundaryRight(Node node) {
			if(node != null){
				if(node.right != null){
					System.out.println(node.data);
					printBoundaryLeft(node.right);
				}else if(node.left !=null){
					System.out.println(node.data);
					printBoundaryLeft(node.left);
				}
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
