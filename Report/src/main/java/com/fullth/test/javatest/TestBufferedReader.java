package com.fullth.test.javatest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedReader {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		if(!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write("첫 번째 줄 작성 테스트");
			bw.newLine();
			bw.write("두 번째 줄 작성 테스트");
			bw.close();
			
			BufferedReader br = new BufferedReader(new FileReader(file));
	        String line=null;
	        while((line=br.readLine())!=null)
	            System.out.println(line);
	        
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
