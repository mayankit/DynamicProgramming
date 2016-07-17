package com.mayank.sets;

public class DisjointUnionSets {
	
	int[] rank,parent;
	int n;
	public DisjointUnionSets(int n) {
		super();
		this.n = n;
		this.parent = new int[n];
		this.rank = new int[n];
		makeSet();
	}
	private void makeSet() {
		// Initially all elements are in thre own set
		for(int i=0;i<n;i++){
			parent[i] = i;
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		 // Let there be 5 persons with ids as
        // 0, 1, 2, 3 and 4
        int n = 5;
        DisjointUnionSets dus =  new DisjointUnionSets(n);
 
        // 0 is a friend of 2
        dus.union(0, 2);
 
        // 4 is a friend of 2
        dus.union(4, 2);
 
        // 3 is a friend of 1
        dus.union(3, 1);
 
        // Check if 4 is a friend of 0
        if (dus.find(4) == dus.find(0))
            System.out.println("Yes");
        else
            System.out.println("No");
 
        // Check if 1 is a friend of 0
        if (dus.find(1) == dus.find(0))
            System.out.println("Yes");
        else
            System.out.println("No");
		
		
	}
	private int find(int x) {
		if(parent[x] != x){
			
			parent[x] = find(parent[x]);
			
		}
		
		return parent[x];
	}
	private void union(int x, int y) {
		// 
		
		int xRoot = find(x);
		int yRoot = find(y);
		
		if(xRoot == yRoot)
			return;
		
		if(rank[xRoot] < rank[yRoot]){
			parent[xRoot] = y;
		}else if(rank[xRoot] > rank[yRoot]){
			parent[yRoot] = xRoot;
		}else{
			parent[yRoot] = xRoot;
			rank[xRoot] = rank[xRoot] + 1;
		}
		
		
	}
	
	
	

}
