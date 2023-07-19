package com.day3;

public class WhileShape1 {
		public static void main(String args[]) {
			int j=1;
			int i=1;
			while( i<=5) {
				j=1;
				 while(j<=5-i) {
					System.out.print("-");
					j++;
					
				}
				j=i;
				while(j>=1) {
					System.out.print(j);
					j--;
				}
				j=2; // since we are skipping that first 1
				while(j<=i) { //as u see because j=2 it skips here at first
					System.out.print(j);
					j++;
			
				}
				j=1;
				while(j<=5-i) {
					System.out.print("-");
					j++;
				}
				
				i++; //update the initial i while loop
				System.out.println(); //to the next line, now.
			}
		}
}
