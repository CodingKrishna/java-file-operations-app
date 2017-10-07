package com.files;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {
	public static void main(String[] args) throws IOException{ 
		FileInputStream fis = new FileInputStream("D://TextField.txt");
		int size = fis.available();
		byte[] b = new byte[size];
		fis.read(b);
		String data = new String(b);
		System.out.println(data);	
		fis.close();
	}
}
