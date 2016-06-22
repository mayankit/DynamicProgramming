package com.mayank.tree;

import java.util.Stack;

public class BST {

	public Node addNode(Node root,int num){
		Node child = new Node(num);
		if(root == null){
			return child;
		}

		if(root.value > num){
			if(root.left == null){
				root.left = child;
			}else{
				addNode(root.left,num);
			}

		}else{
			if(root.right == null){
				root.right = child;
			}else{
				addNode(root.right,num);
			}

		}

		return root;
	}

	public void preOrder(Node root){
		if(root == null)
			return;
		System.out.print (root.value);
		if(root.left != null){
			preOrder(root.left);
		}
		if(root.right != null){
			preOrder(root.right);
		}
	}

	//DFS
	public void iterativePreOrder(Node root){
		if(root == null)
			return;
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			Node node = stack.pop();
			System.out.print(node.value);
			if(node.right != null)
				stack.push(node.right);
			if(node.left !=null)
				stack.push(node.left);
		}
	}

	public void inOrder(Node root){
		if(root == null)
			return;

		if(root.left != null){
			inOrder(root.left);
		}
		System.out.print(root.value);
		if(root.right != null){
			inOrder(root.right);
		}
	}

	//DFS
	public void iterativeInOrder(Node root){

		Stack<Node> stack = new Stack<>();
		while(!stack.isEmpty() || root != null){
			if( root != null){
				stack.push(root);
				root = root.left;
			}else{
				root = stack.pop();
				System.out.print(root.value);
				root = root.right;
			}
		}
	}


	public void postOrder(Node root){
		if(root == null)
			return;

		if(root.left != null){
			postOrder(root.left);
		}
		if(root.right != null){
			postOrder(root.right);
		}
		System.out.print(root.value);
	}

	//DFS
	public void iterativePostOrder(Node root){

		Stack<Node> stack = new Stack<>();
		Node lastVisitedNode = null;
		while(!stack.isEmpty() || root != null){
			if( root != null){
				stack.push(root);
				root = root.left;
			}else{
				Node peekNode = stack.peek();
				// if right child exissts and  traversing node
				// from left child then move right
				if(peekNode.right != null && lastVisitedNode != peekNode.right){
				root  = peekNode.right;
				}
				else
				{
					 System.out.print(peekNode.value);
					 lastVisitedNode = stack.pop();
				}
				
			}
		}
	}
	
	public  Node leastCommonAncestor(Node root,int num1,int num2){
		if(root == null)
			return null;
		if( root.value > num1 && root.value > num2  && root.left != null){
			return leastCommonAncestor(root.left,num1,num2);
		}else if(root.value < num1 && root.value < num2 && root.right != null){
			return leastCommonAncestor(root.right,num1,num2);
		}
		
		return root;
	}



	private static class Node{
		private Node left;
		private Node right;
		private int value;

		public Node(int value) {
			super();
			this.value = value;
		}

		@Override
		public String toString() {
			return "Node [left=" + left + ", right=" + right + ", value=" + value + "]";
		}

	}
	
	

	public static void main(String[] args) {
		BST bst = new BST();
		Node root = bst.addNode(null, 7);
		root = bst.addNode(root, 4);
		root = bst.addNode(root, 3);
		root = bst.addNode(root,6);
		root  = bst.addNode(root, 5);
		root = bst.addNode(root, 2);
		root = bst.addNode(root, 1);

		root = bst.addNode(root, 8);

		Node node = bst.leastCommonAncestor(root,3,6);
		System.out.println(node.value);
	}

}
