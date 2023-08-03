package com.day17;

public class TopologicalSort {

	
	public static boolean isCycle(int[][]matrix) {
		int [] start;
		int flag =0;
		boolean[] visited = new boolean[matrix[0].length];
		visited[0] = true;
		for(int i=0;i<matrix.length;i++) {
		
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[j][i]!=0) {
					flag = 1;
					
				}
			}
			if(flag == 0 && !visited[i]) { //no in-directions
			for(int j=0;j<matrix[0].length;j++) {
				
			}
			}
				
			}
		
		
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {
				{0,1,0,0,0,1,0},//A
				{0,0,0,0,0,0,0},//B
				{0,1,0,0,0,1,1},//C
				{1,0,0,0,1,1,0},//D
				{0,0,0,0,0,1,1},//E
				{0,1,0,0,0,0,0},//F
				{0,0,0,0,0,1,0}//G
		};
		
		
		System.out.println(isCycle(matrix));

	}

}
