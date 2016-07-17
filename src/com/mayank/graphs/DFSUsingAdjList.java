package com.mayank.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import javax.swing.DefaultButtonModel;

public class DFSUsingAdjList extends Graph{
	
private Map<Integer,List<Integer>> adjListMap;

	
	
	public DFSUsingAdjList() {
		super();
		this.adjListMap = new HashMap<>();
	}

	@Override
	public boolean implementAddEdge(int v, int w) {
		adjListMap.get(v).add(w);
		return true;
	}

	@Override
	public void implementAddVertex() {
		int v = getNumVertices();
		
		List<Integer> neighbors = new ArrayList<Integer>();
		adjListMap.put(v, neighbors);
		
	}

	@Override
	public List<Integer> getNeighbours(int v) {
		return new ArrayList<Integer>(adjListMap.get(v));
	}
	
	public List<Integer> getTwoHopNeighbours(int v){
		List<Integer> oneHop = getNeighbours(v);
		List<Integer> twoHop = new ArrayList<>(); 
		for(int x : oneHop){
			twoHop.addAll(getNeighbours(x));
		}
		return twoHop;
	}

	public static void main(String[] args) {
		DFSUsingAdjList graph = new DFSUsingAdjList();
		graph.addVertex();
		graph.addVertex();
		graph.addVertex();
		graph.addVertex();
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		System.out.println(graph);
		graph.DFS(2);
	}
	
	public void DFS(int s) {
		boolean visited[] = new boolean[this.getNumVertices()];
		 Stack<Integer> stack = new Stack<>();
		
		visited[s] = true;
		stack.add(s);
		
		DFSUtil(visited, stack);
	}
	
	private void DFSUtil(boolean[] visited,Stack<Integer> stack){
		
		while(!stack.isEmpty()){
			Integer elem = stack.pop();
			System.out.print(elem);
			
			List<Integer> nextList = adjListMap.get(elem);
			for(Integer edge : nextList){
				
				if(visited[edge] != true){
					visited[edge] = true;
					stack.push(edge);
					DFSUtil(visited,stack);
				}
			}
			
		}
	}

	@Override
	public String toString() {
		return "BFSUsingAdjList [adjListMap=" + adjListMap + "]";
	}

}
