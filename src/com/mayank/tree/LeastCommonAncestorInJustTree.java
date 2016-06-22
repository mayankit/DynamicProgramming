package com.mayank.tree;

public class LeastCommonAncestorInJustTree {

	
  public Node leaseCommonAncestor(Node root,Node num1,Node num2){
	if(root == null)
		return null;
	
	
	
	if(root.equals(num1) || root.equals(num2)){
		return root;
	}
	
	Node left = leaseCommonAncestor(root.left,num1,num2);
	Node right = leaseCommonAncestor(root.right,num1,num2);
	
	if(left !=null && right !=null){
		return root;
	}
	
	return left!=null? left: right;
	  
  }
	
	
  private static class Node{
	  private int data;
	  private Node left;
	  private Node right;
	
	  public Node(int data) {
		super();
		this.data = data;
	}
	  
	  
  }
  
  public static void main(String[] args) {
	  LeastCommonAncestorInJustTree lsa = new LeastCommonAncestorInJustTree();
	  Node n1 = new Node(1);
	  Node n2= new Node(2);
	  Node n3 = new Node(3);
	  Node n4 = new Node(4);
	  Node n5 = new Node(5);
	  Node n6 = new Node(6);
	  Node n7 = new Node(7);
	  
	  n1.left = n2;
	  n2.left = n4;
	  n2.right = n5;
	  n1.right = n3;
	  n3.left = n6;
	  n3.right = n7;
	  
	  Node lca = lsa.leaseCommonAncestor(n1, n4, n5);
	  System.out.println(lca.data);
	 
	  
  }
}
