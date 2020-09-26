package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EnhancedReader {
public static void main(String[] args) {
	try(BufferedReader br=new BufferedReader(new FileReader("log.txt"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("lognew.java"))){
		String  value=null;
		while((value=br.readLine())!=null) {
		System.out.println(value);
		bw.write(value);
	bw.write("\n");
		}
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
