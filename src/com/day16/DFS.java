package com.day16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFS {
	
	public static ArrayList<ArrayList<Integer>> convertToAdjList(int[][] matrix) {
		
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<matrix.length;i++) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==1) {
					row.add(j);
				}
			}
			adjList.add(row);
		}
		
		return adjList;
		
		
	}
	
	public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adjList) {
	    ArrayList<Integer> dfs = new ArrayList<>();
	    
	    Stack<Integer> stack = new Stack<>();
	    boolean[] visited = new boolean[adjList.size()];
	    
	    stack.push(0); // Start from node 0
	    visited[0] = true;
	    
	    while (!stack.isEmpty()) {
	        int node = stack.pop();
	        dfs.add(node);
	        
	        for (int neighbor : adjList.get(node)) {
	            if (!visited[neighbor]) {
	                visited[neighbor] = true;
	                stack.push(neighbor);
	                break;
	            }
	        }
	    }
	    
	    return dfs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] adj = 
			{   {0,1,0,1,0,0,0},//A
				{1,0,1,0,0,0,1},//B
				{0,1,0,0,0,1,1},//C
				{1,0,0,0,1,0,1},//D
				{0,0,0,1,0,1,0},//E
				{0,0,1,0,1,0,1},//F
				{0,1,1,1,0,1,0} //G  
				};
		
		ArrayList<ArrayList<Integer>> adjList = convertToAdjList(adj);
		
//		System.out.println(dfs(adjList));
		ArrayList<Integer> ans = dfs(adjList);
		
		for(int i: ans) {
			System.out.print((char)(i+65)+" ");
		}
		
		

	}

}
