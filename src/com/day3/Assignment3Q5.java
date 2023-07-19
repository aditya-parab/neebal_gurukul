package com.day3;

import java.util.Scanner;

public class Assignment3Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		
		for(int i=1;i<=10000;i++) {
			int num = i;
			int count=0;
			int total=0;
			int num2 = num;
			while(num!=0) {
				int digit = num%10;
				count+=1;
				num=num/10;
			}
			num=num2;
			while(num!=0) {
				int digit = num%10;
				total+=Math.pow(digit,count);
				num=num/10;
			}
			
			if(total == num2) {
				System.out.print(total+",");
			}
			else {
				continue;
			}
		}

	}

}
