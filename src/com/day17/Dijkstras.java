package com.day17;

import java.util.Arrays;



public class Dijkstras {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int mat[][] = {
		{ 1000, 4, 1000, 8, 1000, 1000, 1000,
			1000 },
		{ 4, 1000, 3, 1000, 1000, 1000, 1000,
			1000 },
		{ 1000, 3, 1000, 1000, 1000, 1000, 2,
			1 },
		{ 8, 1000, 1000, 1000, 3, 1000, 1000,
			1000 },
		{ 1000, 1000, 1000, 3, 1000, 7, 1000,
			1000 },
		{ 1000, 1000, 1000, 4, 7, 1000, 6,
			1000 },
		{ 1000, 1000, 2, 5, 1000, 6, 1000, 7 },
		{ 1000, 1000, 1, 1000, 1000, 2, 7,
			1000 } };

	prims(mat);
    }

    public static int prims(int mat[][]) {
	int ans = 0;
	int distanceArr[] = new int[mat.length];
	int parent[] = new int[mat.length];
	Arrays.fill(distanceArr, Integer.MAX_VALUE);
	Arrays.fill(parent, -1);

	
	distanceArr[0] = 0; //set A as 0
	boolean[] visited = new boolean[mat.length];
	int start=0;
	visited[start] = true;

	int count = 1; //since start/0 is already taken care of

	while (count < mat.length) { //to keep updating start and so keep repeating for all unselected nodes
	    for (int i = 0; i < mat.length; i++) {
		
		    if (mat[start][i]+distanceArr[start] < distanceArr[i] &&!visited[i]) {
		    	parent[i] = start;
		    	distanceArr[i] = mat[start][i]+distanceArr[start ];
			

		    }
		
	    }
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
	    for (int i = 0; i < mat.length; i++) {
		if (!visited[i] && (distanceArr[i] < min)) {
		    min = distanceArr[i];
		    minIndex = i;
		}
	    }

	    min = Integer.MAX_VALUE;
	    visited[minIndex] = true; //moving to the smallest child
	    start = minIndex;
	    count++;
	}
	
	int total=0;
	for (int i = 1; i < parent.length; i++) {
	    System.out.println(((char) (parent[i] + 65)) + " " + (char) (i + 65));
	    total+=distanceArr[i];
	}
	
	System.out.println(total);
	return total;
    }

}