package com.mayank.tree;

public class ConstructBSTFromPreOrder {
	
	private static int index = 0;
	public static void main(String[] args) {
		int[] arr = {10,5,1,7,40,50};
		Node root  = createTree(arr);
		inorder(root);
	}

	
	private static Node createTree(int[] arr) {

		return createNode(arr,Integer.MAX_VALUE,Integer.MIN_VALUE);
	}


	private static Node createNode(int[] arr, int maxValue, int minValue) {
		if(index >= arr.length){
			return null;
		}
		Node node = null;
		if(arr[index] > minValue && arr[index] < maxValue){
			 node = new Node(arr[index]);
			index++;
			if(index < arr.length){
			node.left = createNode(arr, node.data + 1, minValue);
			node.right = createNode(arr, maxValue, node.data + 1);
			}
		}
		return node;
	}


	private static void inorder(Node node){
		if(node == null){
			return;
		}
		if(node.left != null){
			inorder(node.left);
		}
		System.out.println(node.data);
		if(node.right != null){
			inorder(node.right);
		}
	}

	
	
	static class Node {
		int data;
		Node left,right;
		public Node(int data) {
			super();
			this.data = data;
		}	
	}}



	
	
