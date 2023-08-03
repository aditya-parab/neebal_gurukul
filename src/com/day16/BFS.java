package com.day16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS {
	
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
	
	public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adjList){
		ArrayList<Integer> bfs = new ArrayList<Integer>();
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		boolean [] visited = new boolean[adjList.size()];
		
		q.add(0); //u are storing indexes in queue not the whole list of neighbors
		visited[0] = true;
		
		while(!q.isEmpty()) {
			int node = q.poll();
			
			for(int it: adjList.get(node)) {
				if(visited[it]==false) {
					visited[it]=true;
					q.add(it);
				}
			}
			
			bfs.add(node); //finished iterating over node
		}
		
		return bfs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] adj = 
			{   {0,1,0,1,0,0,0},
				{1,0,1,0,0,0,1},
				{0,1,0,0,0,1,1},
				{1,0,0,0,1,0,1},
				{0,0,0,1,0,1,0},
				{0,0,1,0,1,0,1},
				{0,1,1,1,0,1,0}  };
		
		ArrayList<ArrayList<Integer>> adjList = convertToAdjList(adj);
		
		System.out.println(bfs(adjList));
	ArrayList<Integer> ans = bfs(adjList);
		
		for(int i: ans) {
			System.out.print((char)(i+65)+" ");
		}
		
		
		
		

	}

}
