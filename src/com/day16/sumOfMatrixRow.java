package com.day16;

public class sumOfMatrixRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a = {{1,2,3,4},{5,6,7},{8,9,10}};
		
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum+=a[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.print("= "+sum);
			System.out.println();
			
		}

	}

}
