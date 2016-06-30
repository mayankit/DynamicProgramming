package com.mayank.graphs;

import java.util.LinkedList;
import java.util.List;

public class MazeNode {
	
	int row;
	int column;
	char dispChar;
	
	List<MazeNode> neighbors;
	
	public static final char EMPTY = '-';
	public static final char PATH = 'o';
	public static final char START = 'S';
	public static final char GOAL = 'G';
	
	
	
	public MazeNode(int row, int column) {
		super();
		this.row = row;
		this.column = column;
		this.neighbors = new LinkedList<>();
		this.dispChar = EMPTY;
	}
	
	public int getRow() {
		return row;
	}
	public int getColumn() {
		return column;
	}
	public char getDispChar() {
		return dispChar;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public void setDispChar(char dispChar) {
		this.dispChar = dispChar;
	}
	public List<MazeNode> getNeighbors() {
		return neighbors;
	}
	public void setNeighbors(List<MazeNode> neighbors) {
		this.neighbors = neighbors;
	}
}
