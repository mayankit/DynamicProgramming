package com.mayank.graphs;

import java.util.List;

public abstract class Graph {
	
	private int numVertices;
	private int numEdges;
	
	public Graph() {
		super();
		this.numVertices = 0;
		this.numEdges = 0;
	}

	public int getNumVertices() {
		return numVertices;
	}

	public int getNumEdges() {
		return numEdges;
	}

	public void setNumVertices(int numVertices) {
		this.numVertices = numVertices;
	}

	public void setNumEdges(int numEdges) {
		this.numEdges = numEdges;
	}
	
	public void addVertex(){
		implementAddVertex();
		numVertices++;
	}
	public void addEdge(int v,int w){
		boolean isAdded = implementAddEdge(v,w);
		if(isAdded){
			numEdges++;
		}
		
	}


	public abstract boolean implementAddEdge(int v,int w);

	public abstract void implementAddVertex();
	
	public abstract List<Integer> getNeighbours(int v);
	
	
	
    
	
}
