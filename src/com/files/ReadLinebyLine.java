package com.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadLinebyLine {

   
    
    public static String getLineByLineData(int lineNo) throws FileNotFoundException{
    	
			File file = new File("D://csv.csv");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = null;
			int lines = 1;
	    	try {
			while ((line = bufferedReader.readLine()) != null) {
				if(lines==lineNo){
					System.out.println(line);
					return line;
				}
				lines++;
			}
			fileReader.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	    	return line;

    }
}