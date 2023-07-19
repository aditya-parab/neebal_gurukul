package com.day3;

public class findLargestDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12394;
		
		int max=Integer.MIN_VALUE;
		while(num!=0) {
			int digit = num%10;
			if(digit>max)
				max = digit;
			num = num/10;
		}
		System.out.println(max);
	}
}
