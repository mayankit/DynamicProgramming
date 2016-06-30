package com.mayank.graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjMatrix  extends Graph{
	
	private int[][] adjMatrix;
	
	
	public GraphAdjMatrix() {
		super();
		this.adjMatrix = new int[2][2];
	}

	@Override
	public boolean implementAddEdge(int v, int w) {
		if(v >= adjMatrix.length || w >=adjMatrix.length){
			return false;
		}
		adjMatrix[v][w] = 1;
		return true;
		
	}

	@Override
	public void implementAddVertex() {
		int v = getNumVertices();
		if( v >= adjMatrix.length){
			int[][] newAdjMatrix = new int[v*2][v*2];
			
			for(int i=0;i< adjMatrix.length;i++){
				for(int j=0;j< adjMatrix.length;j++){
					newAdjMatrix [ i] [j] = adjMatrix[i][j];
				}
			}
			adjMatrix = newAdjMatrix;
		}
	}

	@Override
	public List<Integer> getNeighbours(int v) {
		List<Integer> neighbors = new ArrayList<>();	
		for(int i =0;i<getNumVertices();i++){
			if(adjMatrix[v][i] >= 1){
				neighbors.add(i);
			}
		}
		return neighbors;
	}
	
	public List<Integer> getTwoHopNeighbours(int v){
		List<Integer> neighbors = getNeighbours(v);
		List<Integer> twoHopNeighbors = new ArrayList<>();
		for(int x : neighbors){
			twoHopNeighbors.addAll(getNeighbours(x));
		}
		
		return twoHopNeighbors;
	}
	
	public static void main(String[] args) {
		GraphAdjMatrix graph = new GraphAdjMatrix();
		graph.addVertex();
		graph.addVertex();
		graph.addVertex();
		graph.addEdge(1, 2);
	}

	
	

}
