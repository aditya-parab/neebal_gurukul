package com.day3;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4210818;
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
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}

}
