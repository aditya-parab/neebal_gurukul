package com.day10;

public class DeleteStringBufferWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Hello my name is adi i want to say hello to all";
System.out.println(s);
s=s.toLowerCase();
String word = "Hello";
word=word.toLowerCase();

StringBuffer sb = new StringBuffer(s);
int i=0;

while(i!=-1) {
	i=sb.indexOf(word);
	if(i!=-1) {
		sb=sb.delete(i, i+word.length());
		i++;
	}
			
}
s=sb.toString().trim();

System.out.println(s);
	}

}
