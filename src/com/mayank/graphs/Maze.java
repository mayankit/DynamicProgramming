package com.mayank.graphs;

import java.util.List;
import java.util.Map;

public class Maze {

	MazeNode[][] nodes;
	int rows;
	int columns;
    private static final int DEFAULT_SIZE = 10;
    
    public Maze(){
    	this.nodes = new MazeNode[DEFAULT_SIZE][DEFAULT_SIZE];
    	this.rows = DEFAULT_SIZE;
    	this.columns = DEFAULT_SIZE;
    }
    
    public Maze(int rows,int columns){
    	this.nodes = new MazeNode[rows][columns];
    	this.rows = rows;
    	this.columns = columns;
    }
    
    public void addNode(int row,int column){
    	nodes[row][column] = new MazeNode(row,column);
    }
	
	
	
}
