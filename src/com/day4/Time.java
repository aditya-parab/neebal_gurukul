package com.day4;

public class Time {
private int hours,min,sec;
	public Time() {
		// TODO Auto-generated constructor stub
	}
	
	Time(int hours, int min, int sec){
		this.hours = hours;
		this.min = min;
		this.sec = sec;
	}
	
	public Time add(Time t) {
		int sec1 = (this.hours%12)*(60*60)+this.min*(60)+this.sec;
		int sec2 = (t.hours%12)*(60*60)+t.min*(60)+t.sec;
		int totalsecs = sec1+sec2;
		int hr3 = totalsecs/(3600);
		int min3 = (totalsecs%(60*60))/60;
		int sec3 = (totalsecs%(60*60))%(60);
		return new Time(hr3,min3,sec3);
	}
	
	public String convertIn12Hours() {
		
		Time temp = new Time(this.hours,this.min,this.sec);
		String timetype="";
		if(temp.hours>=12) {
			timetype = "PM";
		}
		else {
			timetype = "AM";
		}
		if(temp.hours!=12)
		temp.hours = temp.hours%12;
		return temp.hours+":"+temp.min+":"+temp.sec+" "+timetype;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.hours+":"+this.min+":"+this.sec;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time x = new Time(12,30,25);
		Time y = new Time(19,20,35);
		Time z = x.add(y);
		

		
		String timeMessage1 = x.convertIn12Hours();
		String timeMessage2 = y.convertIn12Hours();
		
		System.out.println(x); //12:30:25
		System.out.println(y); //19:20:35
		System.out.println(z); //7:51:10
		
		System.out.println(timeMessage1);
		System.out.println(timeMessage2);

	}

}
