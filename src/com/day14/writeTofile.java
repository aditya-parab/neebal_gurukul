package com.day14;

import java.io.IOException;
import java.io.OutputStream;

public class writeTofile {

	
	private void writeToStream(OutputStream outputStream,String s) {
		try {
			byte[] data = s.getBytes();
			outputStream.write(data);
			outputStream.flush();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
		finally {
			try {
				outputStream.close();
			} catch (IOException e2) {
				throw new RuntimeException();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
