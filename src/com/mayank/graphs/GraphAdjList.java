package com.mayank.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GraphAdjList extends Graph{
	
	private Map<Integer,List<Integer>> adjListMap;

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
	

}
