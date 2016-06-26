package com.mayank.tree;

public class FindATreeIsBSTORNOT {
	Node root;
	
	public static void main(String args[])
    {
		FindATreeIsBSTORNOT tree = new FindATreeIsBSTORNOT();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
 
        if (tree.isBST(tree.root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }

	private boolean isBST(Node root) {
		
		return isBSTUtil(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
	}

	private boolean isBSTUtil(Node root, int maxValue, int minValue) {
		if(root == null)
			return true;
		
		if(root.data > maxValue || root.data < minValue){
			return false;
		}
		
		return isBSTUtil(root.left,root.data-1 , minValue) && isBSTUtil(root, maxValue, root.data +1);
	}

}

class Node
{
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
