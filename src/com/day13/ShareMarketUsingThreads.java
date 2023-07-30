package com.day13;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.temporal.TemporalAmount;
import java.util.Arrays;
import java.util.Scanner;


class StockGame extends Thread{
	private static double stockPrice=100.0;
	private static int availableShares;
	private static int tradeCount=1;
	private String name;
	private int numShares;
	private String fileName;
	public String actionword="Purchasing";
	private static final String printLock = "ADI"; //can be Object or String or Integer or any Wrapper class
	
	public static double getStockPrice() {
		return stockPrice;
	}

	public static void setStockPrice(double stockPrice) {
		StockGame.stockPrice = stockPrice;
	}

	public static int getAvailableShares() {
		return availableShares;
	}

	public static void setAvailableShares(int availableShares) {
		StockGame.availableShares = availableShares;
	}

	public static int getTradeCount() {
		return tradeCount;
	}

	public static void setTradeCount(int tradeCount) {
		StockGame.tradeCount = tradeCount;
	}


	public void setTraderName(String name) {
		this.name = name;
	}
	public String getTraderName() {
		return this.name;
	}

	public int getNumShares() {
		return numShares;
	}

	public void setNumShares(int numShares) {
		this.numShares = numShares;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	
	public StockGame() {
	}
	
	public StockGame(String name,String fileName) {
		this.name=name;
		this.fileName=fileName;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			//print the current stock information 
	
			
			
			
			File file = new File(getFileName());
			
			  //Creating a Scanner object
		      Scanner sc = new Scanner(file);
		      
		      //StringBuffer to store the contents
		      StringBuffer sb = new StringBuffer();
		      
		      //Appending each line to the buffer
		      while(sc.hasNextLine()) {
		         sb.append(sc.nextLine()+"\n");
		      }
		      String s = sb.toString();
		      String[] arr = s.split("\n");
		      
		      for(int i=0;i<arr.length;i++) {
		  	
		    	  
		    	  String action = arr[i].split(",")[0];
		    	  int amount = Integer.parseInt(arr[i].split(",")[1]);
		    	  processAction(action,amount);
			     
		      }
	
//		      System.out.println(Arrays.toString(arr));
		      
		      sc.close();
		      
			
		} catch (Exception e) {
			System.out.println("error reading file...");
		}
		
		
	}
	
	public synchronized void processAction(String action,int amount) { //the action to perform - must be synchronized to prevent interference between threads
		
		synchronized (printLock){ //print statements also have to be synchronized
		System.out.println("-----------------------");
		if(action.equals("BUY")) {
			this.actionword="Purchasing";}
		else if(action.equals("SELL")) {
			this.actionword="Selling";}
		else {
			System.out.println("Error, invalid input!");
			return;
		}
			
		System.out.println("Stock Price: "+getStockPrice());
		System.out.println("Trade number: "+getTradeCount());
		System.out.println("Name: "+getTraderName());

		System.out.println(actionword+" "+amount+" shares at "+getStockPrice()+"...");
		
		tradeCount++;
	}
		
		if(action.equals("BUY")) {
			
//			numShares+=amount;
			setNumShares(getNumShares()+amount);
//			availableShares-=amount;
			setAvailableShares(getAvailableShares()-amount);
//			stockPrice+=(1.5*amount);
			setStockPrice(getStockPrice()+(1.5*amount));
			
		}
		
		if(action.equals("SELL")) {

//			numShares-=amount; 
			setNumShares(getNumShares()-amount);
//			availableShares+=amount;
			setAvailableShares(getAvailableShares()+amount);
//			stockPrice-=(2.0*amount);
			setStockPrice(getStockPrice()-(2.0*amount));
			
		}
		

		
		 
	}
	
}




public class ShareMarketUsingThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			StockGame[] stockTraders = {new StockGame("Xander", "TraderOneMoves.txt"),
			new StockGame("Afua", "TraderTwoMoves.txt")};
			for (int i = 0; i < stockTraders.length; i++) {
			stockTraders[i].start();
			}
			for (int i = 0; i < stockTraders.length; i++) {
			stockTraders[i].join();
			}
			} catch (Exception ex) {
			ex.printStackTrace();
			return;
			}

	}

}
