package com.day10;

public class threadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.print("/");
					try { Thread.sleep(1000);}
					catch (Exception e) {
						// TODO: handle exception
					}
				}
				
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.print("*");
					try { Thread.sleep(0);
					}
					catch (Exception e) {
						// TODO: handle exception
					}
				}
				System.out.println("END");
				
			}
			
		});
		t1.setDaemon(true);
		t1.start();
		t2.start();
		


	}

}
